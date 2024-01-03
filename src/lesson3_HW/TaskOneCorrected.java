package lesson3_HW;

import java.util.Arrays;

public class TaskOneCorrected {
    public static void main(String[] args) {
        int[] mas = {34, 47, 34, 18, 96, 33, 34, 55, 87, 34};
        int numberForReplacement = 34;

        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == numberForReplacement) {
                mas[i] = -1;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

