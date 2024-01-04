package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskZero {
    public static void main(String[] args) {

        int[][][] mas = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};
        System.out.println("array before adding user number to all elements: ");
        System.out.println(Arrays.deepToString(mas));

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        int userNumber = scanner.nextInt();


        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] += userNumber;
                }
            }

        }
        System.out.println(Arrays.deepToString(mas));
    }

}


//создать 3-мерный массив из целых чисел и > каждый элемент массива на заданное число