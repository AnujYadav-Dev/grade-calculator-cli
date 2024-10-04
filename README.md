
# Student Grade Calculator

This is a simple Java console application that allows users to calculate their grade based on the marks they have achieved in multiple subjects. The application prompts the user to enter the number of subjects, the name of each subject, and the marks obtained in each one. Based on the marks, the program calculates the average percentage and assigns a grade.

## Features

- Input for the number of subjects.
- Input for each subject's name and marks.
- Validation to ensure marks are between 0 and 100.
- Calculation of total marks and average percentage.
- Grade calculation based on the average percentage:
  - A+: 90% and above
  - A: 80% to 89%
  - B: 70% to 79%
  - C: 60% to 69%
  - D: 50% to 59%
  - F: below 50%
- Displays a summary report including subjects, marks, total marks, average percentage, and the final grade.

## How to Use

1. **Compile the program**:  
   In your terminal or command prompt, navigate to the folder where the Java file is saved and run:
   ```bash
   javac StudentGradeCalculator.java
   ```

2. **Run the program**:  
   After compiling, run the following command to start the application:
   ```bash
   java StudentGradeCalculator
   ```

3. **Follow the prompts**:  
   - Enter the number of subjects.
   - Enter the name and marks of each subject.
   - The program will validate that the marks are between 0 and 100.
   - Once all subjects are entered, the application will calculate the total marks, average percentage, and assign a final grade.

4. **View the result summary**:  
   After all data is entered, the program will display a formatted result summary showing:
   - Subject names and corresponding marks.
   - Total marks.
   - Average percentage.
   - Final grade.

## Example

```text
============================================
       WELCOME TO STUDENT GRADE CALCULATOR
============================================
Enter the number of subjects: 3

--------------------------------------------
Enter the name and marks obtained out of 100
--------------------------------------------
Enter the name of Subject 1: Math
Enter marks for Math: 85
Enter the name of Subject 2: Science
Enter marks for Science: 90
Enter the name of Subject 3: History
Enter marks for History: 70

============================================
                 RESULT SUMMARY
============================================
Subject              Marks Obtained
--------------------------------------------
Math                 85
Science              90
History              70
--------------------------------------------
Total Marks          : 245
Average Percentage   : 81.67
Final Grade          : A
============================================
```

## Technologies Used

- **Java**: The program is written in Java and runs as a console application.

## Prerequisites

To run this project, you need to have:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed.



