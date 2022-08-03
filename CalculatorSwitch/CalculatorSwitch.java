import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        char operator = ' ';
        double result =0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Please, enter first number");
        try {
            firstNumber = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Please, enter correct value.");
            return;}
        System.out.println("Please, choose an operator: +, -, *, /, %.");
        operator = sc.next().charAt(0);
        System.out.println("Please, enter second number");
        try{
            secondNumber = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Please, enter correct value.");
            return;
        }
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = firstNumber / secondNumber;
                System.out.println("Result: " + result);
                break;
            case '%':
                result = firstNumber % secondNumber;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Unsupported operation.\n Please, enter an operator: +, -, *, /, %.)");
        }
    }
}