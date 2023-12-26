package lesson3_HW;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class task_two {
    public static void main(String[] args) {
        Scanner arrsize = new Scanner(System.in);
        System.out.println("enter array size");
        int razmer=arrsize.nextInt();

        int boxCount[] = new int[razmer];
        for(int i=0; i < boxCount.length; i++)
        {

            boxCount[i]  =  (int) (Math.random()*6) + 1;
        }
        System.out.println(Arrays.toString(boxCount));
        int min = boxCount[0];
        int max = boxCount[0];

        for (int i = 1; i <boxCount.length ; i++) {
            if (boxCount[i]<min){
                min=boxCount[i];
            }
            if (boxCount[i]>max){
                max=boxCount[i];
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        }

    }

