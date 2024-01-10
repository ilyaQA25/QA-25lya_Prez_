package lesson6.hw;

import java.util.Scanner;

public class CreditCard {


    int accrualMoney;
    int cardNumber;

    int withdraw;
    int currentAmount;

    CreditCard(int cardNumber, int currentAmount) {
        this.cardNumber = cardNumber;
        this.currentAmount = currentAmount;

    }

    CreditCard() {

    }

    void accural(int accrualMoney) {
        currentAmount += accrualMoney;

    }

    void withdrawMoney(int withdraw) {
        currentAmount -= withdraw;

    }


    String fullInfo() {
        return String.valueOf(cardNumber) + " " + String.valueOf(currentAmount);
    }

}
