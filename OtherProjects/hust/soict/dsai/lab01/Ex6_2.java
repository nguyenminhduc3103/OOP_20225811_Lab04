import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = keyboard.nextLine();

        System.out.print("How old are you? ");
        int age = keyboard.nextInt();

        System.out.print("How tall are you (m)? ");
        double height = keyboard.nextDouble();

        System.out.println("Mrs/Ms " + name + ", " + age + " years old.");
        System.out.println("Your height is " + height + " m.");

        keyboard.close();
    }
}