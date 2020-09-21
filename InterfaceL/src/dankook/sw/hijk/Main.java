package dankook.sw.hijk;

public class Main {
    public static void main(String[] args) {
        TaxCalc tc = new TaxCalc2019();
        TaxCalc tc2 = new TaxCalc2020();
        TaxReport report = new TaxReport(tc,20000000);
        TaxReport report1 = new TaxReport(tc2, 20000000);
        report.printTax();
        report1.printTax();
    }
}
