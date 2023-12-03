import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void updateStudent(int id, String name, String grade) {
        // Implement the update logic
    }

    public Student searchStudentByName(String name) {
        // Implement the search logic
        return null; // Placeholder, modify as needed
    }

    public void deleteStudent(int id) {
        // Implement the delete logic
    }
}