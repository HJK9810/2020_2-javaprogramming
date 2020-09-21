package dankook.sw.hijk;

public class TaxReport {
    private TaxCalc calc;
    private double taxableIncome = 0;

    public TaxReport(TaxCalc tc, double amount) { //constructor injection
        taxableIncome = amount;
        calc = tc;
        calc.setTaxableIncome(taxableIncome);
    }

    public void printTax() {
        var tax = calc.computeTax();
        String strTax = String.format("%.2f", tax);
        System.out.println("소득금액 : " + taxableIncome + "의 세금" + strTax);
    }
}
