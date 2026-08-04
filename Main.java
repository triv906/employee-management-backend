import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        System.out.println("========== Employee Management System ==========");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Adding Employee...");
                break;

            case 2:
                System.out.println("Displaying Employees...");
                break;

            case 3:
                System.out.println("Searching Employee...");
                System.out.println("Enter Employee ID:");
                int id=sc.nextInt();
                Employee found=service.searchEmployee(id);
                if(found!=null){
                    found.displayDetails();
                }else{
                    System.out.println("Employee not found");
                }
                break;

            case 4:
                System.out.println("Exiting...");
                break;

                default:
    System.out.println("Invalid Choice");
    }

        sc.close();
    }
    EmployeeService service = new EmployeeService();
}
