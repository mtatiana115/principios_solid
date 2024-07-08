package _02_payment_method;

public class PaymentProcessor {

  private PaymentMethod paymentMethod;

  public PaymentProcessor(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void processPayment() {
    paymentMethod.processPayment();
  }
}