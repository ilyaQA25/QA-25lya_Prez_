package lesson9.hw.main;

import lesson9.hw.contractEmploye.ContractEmploye;
import lesson9.hw.contractGoods.ContractGoods;
import lesson9.hw.finance.Finance;
import lesson9.hw.registr.Registr;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Registr registr1 = new Registr();

        ContractEmploye contractEmploye = new ContractEmploye(345, new Date(2000 / 12 / 12), new Date(2000 / 9 / 9), "Nikita");

        Finance finance = new Finance(123, new Date(2012/01/23), 54654, 228);
        ContractGoods contractGoods1 = new ContractGoods(345345, "Pencil", 3453, new Date(2009 / 12 / 12));

        registr1.saveDoc(finance);
        registr1.saveDoc(contractEmploye);
        registr1.saveDoc(contractGoods1);


        System.out.println(registr1.infoDoc(finance));
        System.out.println(registr1.infoDoc(contractEmploye));
        System.out.println(registr1.infoDoc(contractGoods1));
    }
}
