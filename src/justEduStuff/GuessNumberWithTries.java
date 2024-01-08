package justEduStuff;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberWithTries {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int randomnumber = newRandom.nextInt(51) + 1;
        System.out.println("Введите число от 1 до 50:");
        Scanner newScanner = new Scanner(System.in);
        int scannerNumber = newScanner.nextInt();

        if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
            for (int schetchik = 7; schetchik > 0; --schetchik) {
                if (scannerNumber > randomnumber) {
                    System.out.println("Ваше число больше загаданного Осталось попыток: " + schetchik);
                    Scanner newscannerT = new Scanner(System.in);
                    int scannerttwo = newscannerT.nextInt();
                    scannerNumber = scannerttwo;
                } else if (scannerNumber < randomnumber) {
                    System.out.println("Ваше число Меньше загаданного. Осталос попыток " + schetchik);
                    Scanner newscnnaerThr = new Scanner(System.in);
                    int newScannerThree = newscnnaerThr.nextInt();
                    scannerNumber = newScannerThree;
                }
            }
            if (scannerNumber == randomnumber) {
                System.out.println("Победа!");
            }
        }
        if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
            System.out.println("Поражение!");
        }
    }
}