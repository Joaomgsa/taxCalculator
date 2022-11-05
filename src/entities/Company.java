package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //falta ajustar a lógica do exercicio
    @Override
    public Double Tax(){
        if (getAnnualIncome()< 2000.00){
            return getAnnualIncome() * 0.15;
        }
        else {
            return getAnnualIncome() * 0.25;
        }

    }
}
