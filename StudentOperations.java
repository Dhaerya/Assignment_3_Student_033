//StudentOperations.java //CRUD operations

import java.util.*;

class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added.");
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }
}
