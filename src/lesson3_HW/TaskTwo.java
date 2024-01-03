package lesson3_HW;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner arrSize = new Scanner(System.in);
        System.out.println("enter array size");
        int razmer = arrSize.nextInt();

        int boxCount[] = new int[razmer];
        for (int i = 0; i < boxCount.length; i++) {

            boxCount[i] = (int) (Math.random() * 6) + 1;
        }
        System.out.println(Arrays.toString(boxCount));
        int min = boxCount[0];
        int max = boxCount[0];

        for (int i = 1; i < boxCount.length; i++) {
            if (boxCount[i] < min) {
                min = boxCount[i];
            }
            if (boxCount[i] > max) {
                max = boxCount[i];
            }
        }
        double average = 0;
        if (boxCount.length > 0) {
            double sum = 0;
            for (int j = 0; j < boxCount.length; j++) {
                sum += boxCount[j];
            }
            average = sum / boxCount.length;
        }
        System.out.println("average: " + average);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

}

