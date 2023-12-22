package lesson2;

import java.util.Scanner;

public class rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of a rainbow color: ");
        int color = scanner.nextInt();


        if (color == 1) {
            System.out.println("red");
        } else if (color == 2) {
            System.out.println("orange");
        } else if (color == 3) {
            System.out.println("yellow");
        } else if (color == 4) {
            System.out.println("green");
        } else if (color == 5) {
            System.out.println("blue");
        } else if (color == 6) {
            System.out.println("indigo");
        } else if (color == 7) {
            System.out.println("violet");
        } else {
            System.out.println("wrong symbol or number");
        }
    }
}
