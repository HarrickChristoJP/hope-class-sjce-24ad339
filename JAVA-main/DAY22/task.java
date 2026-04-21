package Day22;

import java.util.List;

abstract class Emp {
    String name;
    String dept;
    double sal;
    int age;

    Emp(String name, String dept, double sal, int age) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
        this.age = age;
    }
}

class Developer extends Emp {
    Developer(String name, double sal, int age) {
        super(name, "Developer", sal, age);
    }
}

class HR extends Emp {
    HR(String name, double sal, int age) {
        super(name, "HR", sal, age);
    }
}

class Manager extends Emp {
    Manager(String name, double sal, int age) {
        super(name, "Manager", sal, age);
    }
}

public class task {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Developer("A", 55000, 28),
                new Developer("B", 48000, 30),
                new Developer("C", 65000, 35),
                new HR("D", 45000, 25),
                new Manager("E", 80000, 40));

        // Filter by dept(Developer)
        List<Emp> devs = employees.stream().filter(e -> e.dept.equals("Developer")).toList();
        System.out.println("Developers:");
        devs.forEach(e -> System.out.println(e.name));

        // salary greater than 50000
        List<Emp> salFilter = employees.stream()
                .filter(e -> e.sal > 50000).toList();
        System.out.println("\nEmployees with salary > 50000:");
        salFilter.forEach(e -> System.out.println(e.name + " - " + e.sal));

        // Total salary of all employees
        double totalSal = employees.stream().mapToDouble(e -> e.sal).sum();
        System.out.println("Total salary of all employees: " + totalSal);

        // Average salary
        double avgSal = employees.stream().mapToDouble(e -> e.sal).average().orElse(0);
        System.out.println("Average salary: " + avgSal);

        // Total count of employees
        long empCount = employees.stream().count();
        System.out.println("Total count of employees: " + empCount);
    }
}
