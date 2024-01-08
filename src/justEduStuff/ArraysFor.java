package justEduStuff;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysFor {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] ar = new int[size1];



        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i]= random.nextInt(10);
            sum+=ar[i];
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(sum);
    }
}
