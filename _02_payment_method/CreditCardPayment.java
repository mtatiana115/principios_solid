package _02_payment_method;

public class CreditCardPayment implements PaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("pago con tarjeta de credito");
  }

}
