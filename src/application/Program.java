package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        List<TaxPayer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers");
        int numberOfTaxPayers = sc.nextInt();


        for (int i = 0; i <= numberOfTaxPayers; i++); {
            //System.out.println("Tax payer # "+ i + "data :");
            System.out.println("Individual or Company (i/c)?");
            char typeOfTaxPayers = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual Income: $ ");
            double annualIncome = sc.nextDouble();

            if (typeOfTaxPayers == 'i') {

                System.out.print("Health Expenditures: $ ");
                double heathExpenditures = sc.nextDouble();
                list.add(new Individual(name,annualIncome, heathExpenditures));

            }else if (typeOfTaxPayers == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,annualIncome,numberOfEmployees));
            } else {
                System.out.print("Type of taxpayer not found, try again");
            }
        }
        System.out.println();

        Double totalTaxes = 0.0;

        System.out.printf("***Summary of Tax payers***");

        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.printf("Name: ", tp.getName() ,"$ %.2f%n",tp.Tax());
            totalTaxes += tax;
        }
        System.out.println();
        System.out.printf("Total Taxes paid: $ %.2f%n", totalTaxes);


        sc.close();
    }
}