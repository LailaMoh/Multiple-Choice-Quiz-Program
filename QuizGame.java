import java.util.Scanner;

/*
 * Program Name: Simple Quiz Game
 * Description: This program asks the user five multiple-choice questions,
 * checks their answers, and displays the final score as a percentage.
 */

public class QuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;          // Stores number of correct answers
        char answer;            // Stores user input

        // Question 1
        System.out.println("Question 1: What is the correct file extension for Java?");
        System.out.println("A. .jav");
        System.out.println("B. .java");
        System.out.println("C. .class");
        System.out.println("D. .js");
        System.out.print("Enter your answer (A, B, C, or D): ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'B') score++;

        // Question 2
        System.out.println("\nQuestion 2: Which data type is used to store whole numbers?");
        System.out.println("A. float");
        System.out.println("B. double");
        System.out.println("C. int");
        System.out.println("D. char");
        System.out.print("Enter your answer (A, B, C, or D): ");
        answer = input.next().toUpperCase().charAt(0);
        switch (answer) {
            case 'C':
                score++;
                break;
        }

        // Question 3
        System.out.println("\nQuestion 3: Which keyword is used to create an object in Java?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. object");
        System.out.println("D. main");
        System.out.print("Enter your answer (A, B, C, or D): ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'B') score++;

        // Question 4
        System.out.println("\nQuestion 4: Which statement is used for decision making?");
        System.out.println("A. for");
        System.out.println("B. while");
        System.out.println("C. if");
        System.out.println("D. break");
        System.out.print("Enter your answer (A, B, C, or D): ");
        answer = input.next().toUpperCase().charAt(0);
        switch (answer) {
            case 'C':
                score++;
                break;
        }

        // Question 5
        System.out.println("\nQuestion 5: Which symbol is used for comments in Java?");
        System.out.println("A. #");
        System.out.println("B. <!-- -->");
        System.out.println("C. //");
        System.out.println("D. **");
        System.out.print("Enter your answer (A, B, C, or D): ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'C') score++;

        // Calculate percentage
        double percentage = (score / 5.0) * 100;

        // Display final result
        System.out.println("\nQuiz Completed!");
        System.out.println("Correct Answers: " + score + " out of 5");
        System.out.println("Final Score: " + percentage + "%");

        input.close();
    }
}
