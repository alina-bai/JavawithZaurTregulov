package Lesson29;
import java.util.ArrayList;
import java.util.function.Predicate;

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("Имя работника: " + e.name + "," +  "Отдел работника: " + e.department + ","+
                            "Зарплата: " + e.salary + ".");
    }


    void filtraciyaRabotnikov(ArrayList <Employee> list, Predicate<Employee> p) {
        for (Employee e : list) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Ivan", "IT", 150);
        Employee e2 = new Employee("Nikolay", "sales", 200);
        Employee e3 = new Employee("Elena", "HR", 250);
        Employee e4 = new Employee("Petr", "IT", 300);
        Employee e5 = new Employee("MAriya", "IT", 350);
        Employee e6 = new Employee("Ekaterina", "Sales", 400);
        Employee e7 = new Employee("Aleksandr", "HR", 450);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        TestEmployee t = new TestEmployee();
        t.filtraciyaRabotnikov(list, x -> x.department.equals("IT") && x.salary > 200);
        System.out.println("---------------------------------------");
        t.filtraciyaRabotnikov(list, x -> x.name.startsWith("E") && x.salary != 450);
        System.out.println("---------------------------------------");
        t.filtraciyaRabotnikov(list, x -> x.name.equals(x.department));


    }

}


