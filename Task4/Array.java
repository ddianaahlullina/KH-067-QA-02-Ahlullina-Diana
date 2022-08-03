import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter at least three words separated by commas");
        String words = sc.nextLine();
        String[] array = words.split(", ");
        int choice;
        if (array.length < 3) {
            System.out.println("You enter less then 3 words");
            return;
        }
        do {
            System.out.println("Select filter: ");
            System.out.println("1 - maximum length \n" +
                    "2 - start with \n" +
                    "3 - end with \n" +
                    "4 - contains\n" +
                    "0 - exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter length of word: ");
                    int length = sc.nextInt();
                    for (String result: array) {
                        if (result.length() <= length) {
                            System.out.println("Word: " + result);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter first letter: ");
                    String firstLetter = sc.next();
                    for (String result: array) {
                        if (result.startsWith(firstLetter)) {
                            System.out.println("Word:" + result);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter last letter: ");
                    String lastLetter = sc.next();
                    for (String result: array) {
                        if (result.endsWith(lastLetter)) {
                            System.out.println("Word:" + result);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter part of word");
                    String partWord = sc.next();
                    for (String result: array) {
                        if (result.contains(partWord)) {
                            System.out.println("Word:" + result);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Enter from 1 to 4");
            }
        } while (choice != 0);
    }
}