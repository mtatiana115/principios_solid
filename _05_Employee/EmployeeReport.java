package _05_Employee;

public class EmployeeReport {
  public void generateReport(Employee employee) {
    System.out.println("generating report...");
    System.out.println("---report---");
    System.out.println("name: " + employee.getName());
    System.out.println("salary: " + employee.getSalary());
  }

}
