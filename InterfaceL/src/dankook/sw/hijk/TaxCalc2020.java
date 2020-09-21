package dankook.sw.hijk;

public class TaxCalc2020 implements TaxCalc{
    private double taxableIncome;

    public TaxCalc2020() {
        this.taxableIncome = 0;
    }

    @Override
    public void setTaxableIncome(double amount) {
        this.taxableIncome = amount;
    }

    @Override
    public double computeTax() {
        double tax = taxableIncome/10000;
        double decl = 0;
        if(tax < 5000)
            decl = 0.2;
        else if(tax >= 5000 && tax < 8000)
            decl = 0.25;
        else if(tax >= 8000 && tax < 12000)
            decl = 0.3;
        else
            decl = 0.35;

        return taxableIncome * decl;
    }
}
