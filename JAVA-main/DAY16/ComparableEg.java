package DAY16;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age; 
    }
}

public class ComparableEg {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));
        Collections.sort(students); 
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}
