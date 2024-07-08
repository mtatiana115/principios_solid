package _06_TaxCalculator;

//Principio de Abierto/Cerrado
public class TaxCalculator {

  private TaxStrategy taxStrategy;

  public TaxCalculator(TaxStrategy taxStrategy) {
    this.taxStrategy = taxStrategy;
  }

  public void calculateTax() {
    System.out.println(taxStrategy.calculateTax());
  }

}
