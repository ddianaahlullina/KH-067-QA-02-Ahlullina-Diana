import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        char operator = '+';
        Double answer = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Please, enter first number");
        try {
            firstNumber = sc.nextDouble();
            System.out.println("Please, choose an operator: +, -, *, /, %.");
            operator = sc.next().charAt(0);
            System.out.println("Please, enter second number");
            secondNumber = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Input is wrong. Please, enter correct value.");
        }
        if (operator == '+') {
            answer = firstNumber + secondNumber;
        } else if (operator == '-') {
            answer = firstNumber - secondNumber;
        } else if (operator == '*') {
            answer = firstNumber * secondNumber;
        } else if (operator == '/') {
            answer = firstNumber / secondNumber;
        } else if (operator == '%') {
            answer = firstNumber % secondNumber;
        } else {
            System.out.println("Unsupported operation.\n" +
                    "Please, enter an operator: +, -, *, /, %.");
        }
        if (answer != null) {
            System.out.println("Answer: " + answer);
        }
    }
}