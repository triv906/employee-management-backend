import java.util.ArrayList;
public class EmployeeServiceImpl implements EmployeeService{
      ArrayList<Employee> employees = new ArrayList<>();

  @Override
  public void addEmployee(Employee employee){
    employees.add(employee);
  }
  @Override
  public void displayEmployees(){
    for(Employee emp:employees){
      emp.displayDetails();
    }
  }
  @Override
  public Employee searchEmployee(int id){
    for(Employee emp:employees){
      if(emp.getId()==id){
        return emp;
      }
    }
      return null;
  }
  @Override
  public void updateEmployee(int id,double newSalary){
    Employee emp=searchEmployee(id);
    if(emp!=null){
      emp.setSalary(newSalary);
      System.out.println("Employee salary updated successfully!");
    }else{
      System.out.println("Employee not found");
    }
  }
  @Override
  public void deleteEmployee(int id){
    Employee emp=searchEmployee(id);
    if(emp!=null){
      employees.remove(emp);
      System.out.println("Employee deleted successfully!");
    } else{
      System.out.println("Employee not found");
    }

}
}
