public class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee("James", 122, 300000, "IT");
    Employee e2 = new Employee("Robert", 125, 30000, "CSE");
    e1.displayDetails();

    System.out.println();

    e2.displayDetails();
  }

}
