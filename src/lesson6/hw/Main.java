package lesson6.hw;

import lesson6.hw.CreditCard;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(12345, 500);
        CreditCard card2 = new CreditCard(12345, 500);
        CreditCard card3 = new CreditCard(12345, 500);

        card1.accural(50);
        card2.accural(60);
        card3.withdrawMoney(10);
        System.out.println(card1.fullInfo());
        System.out.println(card2.fullInfo());
        System.out.println(card3.fullInfo());



       /* CreditCard[] list = new CreditCard[3];
        for (int i = 0; i < list.length; i++) {
            list[i]=new CreditCard((int)(Math.random()*12), (int)(Math.random()*12));

        }
        System.out.println(Arrays.deepToString(list));*/
    }
}
