package org.example;


public class Main {
    public static void main(String[] args) {
        Address address = new Address(123, "Main Street", "Vancouver", "BC", "V6B1A1", "Canada");
        Department department = new Department("D01", "Computer Science");
        Student student = new Student("Lionel Messi", Gender.MALE, address, department);
        Course course = new Course("Programming 1", 3.0, department);

        System.out.println(address);
        System.out.println(department);
        System.out.println(student);
        System.out.println(course);

        // Adding assignments and registering a student to the course
        course.addAssignment("Assignment 1", 0.2, 100);
        course.addAssignment("Assignment 2", 0.3, 100);
        course.addAssignment("Final Exam", 0.5, 100);

        course.registerStudent(student);
        course.generateScores();
        course.displayScores();

        // Creating more students and registering them to the course
        Student student2 = new Student("Michael JordN", Gender.FEMALE, address, department);
        course.registerStudent(student2);
        course.generateScores();
        course.displayScores();
    }
}
