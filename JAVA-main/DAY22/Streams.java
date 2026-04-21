package Day22;
/*
Strea
*/
import java.util.List;
class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class Streams {
    public static void main(String[] args) {
        List<Integer> nums=List.of(1,2,3,4,5);
        List<Integer> squares=nums.stream().map(n->n*n).toList();
        System.out.println(squares);
        List<Employee> employees=List.of(
            new Employee("Garcia",50000),
            new Employee("Messy",60000));
        List<String> names=employees.stream().map(e->e.name).toList();
        List<Employee> greaterSalary=employees.stream().filter(e->e.salary>55000).toList();
        System.out.println(names);
        System.out.println("Employees with salary > 55000:");
        greaterSalary.forEach(e->System.out.println(e.name+" - "+e.salary));
    }
}
