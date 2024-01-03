package lesson3_HW;

import java.util.Scanner;

public class TaskZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        int userNumber = scanner.nextInt();

        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == userNumber) {

                System.out.println("your number is included in array");
            }
        }

    }

}

