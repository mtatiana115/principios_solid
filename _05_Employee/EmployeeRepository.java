package _05_Employee;

public class EmployeeRepository {

  public void saveToDatabase(Employee employee) {
    System.out.println("saving employee..." + employee.getName());
  }

}
