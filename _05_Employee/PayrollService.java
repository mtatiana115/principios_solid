package _05_Employee;

public class PayrollService {
  public void calculatePay(Employee employee, int hours) {
    System.out.println("calculating payment... \n" + employee.getSalary() * hours);

  }

}
