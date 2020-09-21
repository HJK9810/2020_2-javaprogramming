package dankook.sw.hijk;

public interface TaxCalc {
    void setTaxableIncome(double amount);
    double computeTax();
}
