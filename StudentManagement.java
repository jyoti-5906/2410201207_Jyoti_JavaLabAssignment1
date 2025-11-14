
import java.util.Scanner;

class Student {

    int rollNumber;
    String name;
    String course;
    int marks;
    char grade;

    // Constructor
    Student(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
        calculateGrade();   // grade is calculated whenever object is created
    }

    // Method to calculate grade based on marks
    void calculateGrade() {
        if (marks >= 90) {
            grade = 'A'; 
        }else if (marks >= 75) {
            grade = 'B'; 
        }else if (marks >= 60) {
            grade = 'C'; 
        }else if (marks >= 40) {
            grade = 'D'; 
        }else {
            grade = 'F';
        }
    }

    // Method to display student details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many students you want to store: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Student[] students = new Student[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Marks (0–100): ");
            int marks = sc.nextInt();

            students[i] = new Student(roll, name, course, marks);
        }

        // Displaying all students
        System.out.println("\n====== Student Records ======");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
