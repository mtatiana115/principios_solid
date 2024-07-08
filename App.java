import java.util.Arrays;

import _01_order.Order;
import _01_order.PrintOrder;
import _02_payment_method.CreditCardPayment;
import _02_payment_method.PayPalPayment;
import _02_payment_method.PaymentMethod;
import _02_payment_method.PaymentProcessor;
import _03_worker.HumanWorker;
import _03_worker.RobotWorker;
import _04_Database.DataService;
import _05_Employee.Employee;
import _05_Employee.EmployeeReport;
import _05_Employee.EmployeeRepository;
import _05_Employee.PayrollService;
import _06_TaxCalculator.TaxCalculator;
import _06_TaxCalculator.TaxStrategy;
import _06_TaxCalculator.UKTaxStrategy;

public class App {

  public static void main(String[] args) {
    // Principio de Responsabilidad Única
    // PrintOrder printOrder = new PrintOrder();
    // Order order = new Order(Arrays.asList("pc", "notebook", "phone"));
    // printOrder.printOrder(order);

    // Principio de Abierto/Cerrado
    // PaymentMethod credit = new CreditCardPayment();
    // PaymentMethod payPal = new PayPalPayment();
    // PaymentProcessor paymentProcessor = new PaymentProcessor(credit);
    // PaymentProcessor paymentProcessor2 = new PaymentProcessor(payPal);
    // paymentProcessor.processPayment();
    // paymentProcessor2.processPayment();

    // Principio de Segregación de Interfaces
    // HumanWorker humanWorker = new HumanWorker();
    // humanWorker.work();
    // humanWorker.eat();

    // RobotWorker robotWorker = new RobotWorker();
    // robotWorker.work();

    // Principio de Inversión de Dependencias
    DataService dataService = new DataService();
    dataService.saveData("database");

    // Principio de Responsabilidad Única
    // Employee employee = new Employee("catalina", 10);

    // EmployeeRepository employeeRepository = new EmployeeRepository();
    // EmployeeReport employeeReport = new EmployeeReport();
    // PayrollService payrollService = new PayrollService();

    // employeeRepository.saveToDatabase(employee);
    // employeeReport.generateReport(employee);
    // payrollService.calculatePay(employee, 5);

    // Principio de Abierto/Cerrado
    TaxStrategy taxStrategy = new UKTaxStrategy();

    TaxCalculator taxCalculator = new TaxCalculator(taxStrategy);

    taxCalculator.calculateTax();

  }
}
