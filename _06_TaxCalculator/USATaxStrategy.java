package _06_TaxCalculator;

public class USATaxStrategy implements TaxStrategy {

  @Override
  public double calculateTax() {
    return 0.1;
  }

}
