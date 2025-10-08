import java.util.*;
import java.util.stream.Collectors;

// Student class
class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

// Main class
public class StudentStreamExample {
    public static void main(String[] args) {

        // List of students
        List<Student> students = Arrays.asList(
                new Student(101, "Amit", 82.5),
                new Student(102, "Neha", 91.2),
                new Student(103, "Ravi", 68.4),
                new Student(104, "Priya", 88.9),
                new Student(105, "Karan", 75.6)
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        // Filtering students with marks > 80
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.marks > 80)
                .collect(Collectors.toList());

        System.out.println("\nStudents with Marks > 80:");
        filteredStudents.forEach(System.out::println);

        // Sorting filtered students by marks in descending order
        List<Student> sortedStudents = filteredStudents.stream()
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .collect(Collectors.toList());

        System.out.println("\nFiltered Students Sorted by Marks (Descending):");
        sortedStudents.forEach(System.out::println);

        // Filter + Sort in one stream
        System.out.println("\nFilter + Sort in One Stream:");
        students.stream()
                .filter(s -> s.marks > 80)
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .forEach(System.out::println);
    }
}
