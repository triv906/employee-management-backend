import java.util.ArrayList;

public class EmployeeService {
  ArrayList<Employee> employees = new ArrayList<>();
public void addEmployee(Employee employee){
    employees.add(employee);
}
    public void displayEmployees() {

    for(Employee emp : employees) {
        emp.displayDetails();
    }
}
}

