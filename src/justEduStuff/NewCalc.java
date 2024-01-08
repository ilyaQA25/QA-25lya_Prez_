package justEduStuff;

import java.util.Scanner;

public class NewCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number: ");
        int first = scanner.nextInt();
        System.out.println("second number: ");
        int second = scanner.nextInt();
        System.out.println("Choose operation: +, -, * or /");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println(first + second);
        } else if (operation == '-') {
            System.out.println(first - second);
        } else if (operation == '*') {
            System.out.println(first * second);
        } else if (operation == '/') {
            System.out.println(first / second);
        } else {
            System.out.println("wrong symbol");
        }
    }
}
