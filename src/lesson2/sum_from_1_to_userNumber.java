package lesson2;
import java.util.Scanner;
public class sum_from_1_to_userNumber {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter last number:");
        int userNumber = scanner.nextInt();
        int sum=0;
        for (int i = 1; i < userNumber; i++) {
            sum=+i;
            System.out.println(sum);
            }

        }


    }




