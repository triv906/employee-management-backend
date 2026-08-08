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
public Employee searchEmployee(int id){
    for(Employee emp: employees){
        if(emp.getId()==id){
            return emp;
        }
    }
     return null;
    }
    public void updateEmployee(int id,double newSalary){
        Employee emp=searchEmployee(id);
        if(emp!=null){
            emp.setSalary(newSalary);
            System.out.println("Employee salary updated successfully.");
        }else{
            System.out.println("Employee not found.");
        }
        }
    }

