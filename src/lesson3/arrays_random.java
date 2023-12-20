package lesson3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arrays_random {
    public static void main(String[] args) {
        Scanner arrsize = new Scanner(System.in);
        System.out.println("enter array size");
        int razmer=arrsize.nextInt();

        Random random = new Random();

        int[] array = new int[razmer];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(array.length);
        }
        System.out.println(Arrays.toString(array));
    }
}
