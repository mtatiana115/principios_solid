package _01_order;

import java.util.List;

//Principio de responsabilidaad única

public class Order {

  private List<String> items;
  private double totalAmount;

  public Order(List<String> items) {
    this.items = items;
    this.totalAmount = calculateTotal();
  }

  private double calculateTotal() {
    // Lógica para calcular el total de la orden
    return 100.0; // simplificado
  }

  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

}
