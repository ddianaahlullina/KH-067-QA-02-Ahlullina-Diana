import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = s.nextLine();
        System.out.println(name + ", your address is " + address);
    }
}
