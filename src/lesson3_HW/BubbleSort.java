package lesson3_HW;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;


                    int buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
