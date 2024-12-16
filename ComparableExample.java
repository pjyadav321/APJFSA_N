import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Write a java program to implement comparable interface that sorts
the age of employee (employee(id,name,age))
 */
class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;

    //Parameterized constructor
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding compareTo method to sort by age
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }

    // Overriding toString method for easy display
    public String toString() {
        return "Employee id = " + id + "\n"+
                "name = " + name + "\n"+
                "age = " + age ;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List <Employee> e = new ArrayList<>();
        // Creating a list of employees
        e.add(new Employee(1, "Pooja", 21));
        e.add(new Employee(2, "Priyanka", 20));
        e.add(new Employee(3, "Ramesh", 22));
        e.add(new Employee(4, "Sakshi", 19));

        System.out.println("Before sorting:" );
        for (Employee employee: e){
            System.out.println(employee);
            System.out.println();
        }

        // Sorting employees by age
        Collections.sort(e);
        System.out.println("\n\nAfter Sorting based on age: ");
        for (Employee employee: e){
            System.out.println(employee);
            System.out.println();
        }

    }
}
/*
            OUTPUT::::::::::::
            Before sorting:
            Employee id = 1
            name = Pooja
            age = 21

            Employee id = 2
            name = Priyanka
            age = 20

            Employee id = 3
            name = Ramesh
            age = 22

            Employee id = 4
            name = Sakshi
            age = 19



            After Sorting based on age:
            Employee id = 4
            name = Sakshi
            age = 19

            Employee id = 2
            name = Priyanka
            age = 20

            Employee id = 1
            name = Pooja
            age = 21

            Employee id = 3
            name = Ramesh
            age = 22
 */