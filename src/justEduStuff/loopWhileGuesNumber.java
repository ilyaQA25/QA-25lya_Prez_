package justEduStuff;

import java.util.Random;
import java.util.Scanner;

public class loopWhileGuesNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int aiNumbr = random.nextInt(12);
        while (true) {
            System.out.println("Enter your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == aiNumbr) {
                System.out.println("Lucky guess!");
                break;
            } else {
                System.out.println("wrong number");

            }


        }
    }

}
