
package lesson2;
import java.util.Scanner;
public class even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int userNumber = scanner.nextInt();

        if (userNumber % 2==0 && userNumber>0){
            System.out.println("this number is even");
        }else{
            System.out.println("it is odd number or negative number");
        }
    }
}
