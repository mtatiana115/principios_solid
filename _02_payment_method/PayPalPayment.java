package _02_payment_method;

public class PayPalPayment implements PaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("pago con paypal");
  }

}
