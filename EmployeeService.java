public interface EmployeeService {
    void addEmployee(Employee employee);
    void displayEmployees();
    Employee searchEmployee(int id);
    void updateEmployee(int id,double newSalary);
    void deleteEmployee(int id);
}