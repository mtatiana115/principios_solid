package _01_order;

public class PrintOrder {

  public void printOrder(Order order) {
    for (String item : order.getItems()) {
      System.out.println(item);

    }
    System.out.println(order.getTotalAmount());
  }
}
