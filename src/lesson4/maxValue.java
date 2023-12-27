package lesson4;

import java.util.Arrays;
import java.util.Random;

public class maxValue {
    public static void main(String[] args) {
        int size = 5;

        Random random = new Random();

        int[][] myArray = new int[size][size];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = random.nextInt(40);
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        int max = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] > max) {
                    max = myArray[i][j];

                }

            }

        }
        System.out.println(max);
    }
}

