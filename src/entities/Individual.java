package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

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
