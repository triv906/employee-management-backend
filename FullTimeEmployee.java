public class FullTimeEmployee extends Employee {
  public FullTimeEmployee(String name,int id,double salary,String department){
  super(name,id,salary,department);
  }
  @Override
  public void displayDetails(){
  super.displayDetails();
  System.out.println("Employee type: Full - Time");
  System.out.println(" ");
  }

  
}
