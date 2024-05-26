# Assignment 6 (Final Project)

## Project Description

This project is a Student Management System that models the essential components and interactions within a university. It includes classes for `Address`, `Department`, `Student`, `Assignment`, `Course`, and `Util`, along with a `Gender` enumeration. The system allows for creating students, departments, courses, and assignments, and includes functionality for registering students in courses, managing assignments, and calculating scores.

## Project Structure

The project is structured as follows:

src/main/java/
├── Address.java
├── Assignment.java
├── Course.java
├── Department.java
├── Gender.java
├── Student.java
└── util/
└── Util.java

src/test/java/
├── AddressTest.java
├── AssignmentTest.java
├── CourseTest.java
└── UtilTest.java


## Classes and Their Responsibilities

### `Address`

- **Fields**: `int streetNo`, `String street`, `String city`, `String province`, `String postalCode`, `String country`
- **Methods**:
  - `static boolean isPostalCodeValid(String postalCode)`: Checks if a postal code is valid.
  - Constructor: Validates and sets fields.
  - `toString`, `equals`, getters, setters

### `Department`

- **Fields**: `String departmentId`, `String departmentName`, `static int nextId`
- **Methods**:
  - `static boolean validateDepartmentName(String departmentName)`: Validates a department name.
  - Constructor: Validates and sets fields.
  - `toString`, `equals`, getters, setters

### `Student`

- **Fields**: `String studentId`, `String studentName`, `Gender gender`, `Address address`, `Department department`, `List<Course> registeredCourses`, `static int nextId`
- **Methods**:
  - `boolean registerCourse(Course course)`: Registers a course for the student.
  - `boolean dropCourse(Course course)`: Drops a course for the student.
  - Constructor: Creates a student with a unique ID.
  - `toSimplifiedString`, `toString`, `equals`, getters, setters

### `Assignment`

- **Fields**: `String assignmentId`, `String assignmentName`, `double weight`, `int maxScore`, `double assignmentAverage`, `List<Integer> scores`, `static int nextId`
- **Methods**:
  - `void calcAssignmentAvg()`: Calculates the average score.
  - `void generateRandomScore()`: Generates random scores for the assignment.
  - Constructor: Initializes the assignment.
  - `toString`, getters, setters

### `Course`

- **Fields**: `String courseId`, `String courseName`, `double credits`, `Department department`, `List<Assignment> assignments`, `List<Student> registeredStudents`, `List<Double> finalScores`, `static int nextId`
- **Methods**:
  - `boolean isAssignmentWeightValid()`: Checks if assignment weights sum to 1.
  - `boolean registerStudent(Student student)`: Registers a student in the course.
  - `int[] calcStudentsAverage()`: Calculates weighted averages for students.
  - `boolean addAssignment(String assignmentName, double weight, int maxScore)`: Adds an assignment to the course.
  - `void generateScores()`: Generates scores for the course.
  - `void displayScores()`: Displays scores in a formatted table.
  - `toSimplifiedString`, `toString`, `equals`, getters, setters

### `Util`

- **Methods**:
  - `static String toTitleCase(String strIn)`: Converts a string to title case.

### `Gender`

- Enumeration with values `FEMALE` and `MALE`.

## Unit Tests

Unit tests are provided for the following methods:

### `AddressTest`

- `isPostalCodeValid`: Tests various valid and invalid postal codes.

### `AssignmentTest`

- `calcAssignmentAvg`: Tests the calculation of the average score.

### `CourseTest`

- `calcStudentsAverage`: Tests the calculation of students' weighted averages.

### `UtilTest`

- `toTitleCase`: Tests the conversion of strings to title case.



