//Main.java 
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        System.out.println("How many students do you want to add?");
        int numberOfStudents = scan.nextInt();
        scan.nextLine(); // Consume the leftover newline character

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.println("Enter Name: ");
            String name = scan.nextLine();

            System.out.println("Enter PRN:");
            int prn = scan.nextInt();
            scan.nextInt(); // Consume the leftover newline character

            System.out.println("Enter Branch: ");
            String branch = scan.nextLine();

            System.out.println("Enter CGPA: ");
            float cgpa = scan.nextFloat();
            scan.nextLine(); // Consume the leftover newline character

            Student student = new Student(name, prn, branch, cgpa);
            operations.addStudent(student);
        }

        System.out.println("\nDisplaying all students:");
        operations.displayStudents();
    }
}

