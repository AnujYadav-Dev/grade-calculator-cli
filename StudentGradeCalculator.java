import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Creating a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Print header for the application
        System.out.println("============================================");
        System.out.println("       WELCOME TO STUDENT GRADE CALCULATOR  ");
        System.out.println("============================================");
        
        // Prompt for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Arrays to hold subject names and marks for each subject
        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Section for subject names and marks input
        System.out.println("\n--------------------------------------------");
        System.out.println("Enter the name and marks obtained out of 100");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();

            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            marks[i] = scanner.nextInt();
            
            // Validate the marks are between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Please enter marks between 0 and 100 for " + subjectNames[i] + ": ");
                marks[i] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline after integer input
            
            // Sum up the total marks
            totalMarks += marks[i];
        }
        
        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Determine the grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display the subject names, marks, total marks, average percentage, and grade to the user
        System.out.println("\n============================================");
        System.out.println("                 RESULT SUMMARY             ");
        System.out.println("============================================");
        System.out.println(String.format("%-20s %-15s", "Subject", "Marks Obtained"));
        System.out.println("--------------------------------------------");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(String.format("%-20s %-15d", subjectNames[i], marks[i]));
        }
        System.out.println("--------------------------------------------");
        System.out.println(String.format("%-20s: %-15d", "Total Marks", totalMarks));
        System.out.println(String.format("%-20s: %-15.2f", "Average Percentage", averagePercentage));
        System.out.println(String.format("%-20s: %-15s", "Final Grade", grade));
        System.out.println("============================================");
        
        // Closing message
        System.out.println("\nThank you for using the Student Grade Calculator \n!");
        
        // Close the scanner object
        scanner.close();
    }
}
