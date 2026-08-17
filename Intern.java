public class Intern extends Employee {
  public Intern(String name,int id,double salary,String department){
    super(name,id,salary,department);
  }
  @Override
  public void displayDetails(){
  super.displayDetails();
  System.out.println("Employee type: Intern");
  System.out.println(" ");
  }
  
}
