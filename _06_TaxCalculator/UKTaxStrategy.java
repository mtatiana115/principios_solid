package _06_TaxCalculator;

public class UKTaxStrategy implements TaxStrategy {

  @Override
  public double calculateTax() {
    return 0.2;
  }

}
