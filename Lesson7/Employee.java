package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    public Employee (int id2){
        id = id2;
    }

    Employee (String surname2){
        surname = surname2;
    }
    private  Employee (double salary2 ){
        salary = salary2;
    }
 double uvelechenieZarplaty () {
        salary *= 2;
        return salary;
 }
  void getId(){
     System.out.println("ID =  " + id);
 }
 public void getSurname(){
     System.out.println("Surname =  " + surname);
 }
 private void getSalary(){
        System.out.println("Salary =  " + salary);
 }

}
