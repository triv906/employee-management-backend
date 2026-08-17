import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();
        FullTimeEmployee fullTimeEmployee =
        new FullTimeEmployee("Sindhuja", 122, 300000, "IT");

        service.addEmployee(fullTimeEmployee);
        Intern intern =
        new Intern("Stuti", 125, 15000, "IT");

         service.addEmployee(intern);
        while (true) {

            System.out.println("========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Employee Name:");
                    String name = sc.next();
                    System.out.println("Enter Employee ID:");
                    int employeeId;
                    try {
                        employeeId = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Please enter a valid number");
                        break;
                    }
                    if (service.searchEmployee(employeeId) != null) {
                        System.out.println("Employee ID already exists");
                        break;
                    }
                    System.out.println("Enter Employee Salary:");
                    double salary = sc.nextDouble();
                    System.out.println("Enter Employee Department:");
                    String department = sc.next();
                    Employee employee = new Employee(name, employeeId, salary, department);
                    service.addEmployee(employee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.println("Displaying Employees...");
                    service.displayEmployees();
                    break;

                case 3:
                    System.out.println("Searching Employee...");
                    System.out.println("Enter Employee ID:");
                    int id = sc.nextInt();
                    Employee found = service.searchEmployee(id);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Employee ID:");
                    int updateId = sc.nextInt();

                    System.out.println("Enter new salary:");
                    double newSalary = sc.nextDouble();

                    service.updateEmployee(updateId, newSalary);
                    break;
                case 5:
                    System.out.println("Enter Employee ID to delete:");
                    int deleteId = sc.nextInt();
                    service.deleteEmployee(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}
