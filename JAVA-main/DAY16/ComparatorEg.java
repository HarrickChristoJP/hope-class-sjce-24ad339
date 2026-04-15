package DAY16;

import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class ComparatorEg {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Alice", 22, 85),
            new Student("Bob", 20, 90),
            new Student("Charlie", 25, 80)
        );

        Comparator<Student> byMarks = (s1, s2) -> s2.marks - s1.marks;
        students.sort(byMarks);
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age + " - " + s.marks);
        }
    }
}
