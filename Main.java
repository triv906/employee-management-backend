public class Main {
  public static void main(String[] args) {
    EmployeeService service = new EmployeeService();
    Employee e1 = new Employee("James", 122, 300000, "IT");
    Employee e2 = new Employee("Robert", 125, 30000, "CSE");
    Employee e3 = new Employee("Louis", 143, 40000, "ECE");
    service.addEmployee(e1);
    service.addEmployee(e2);
    service.addEmployee(e3);

    service.displayEmployees();
  }

}
