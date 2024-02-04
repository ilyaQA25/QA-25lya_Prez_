package lesson9.hw.main;

import lesson9.hw.contract_employe.ContractEmploye;
import lesson9.hw.contract_goods.ContractGoods;
import lesson9.hw.exeptions.AlphNumSeqExeption;
import lesson9.hw.exeptions.AlphSeqExeption;
import lesson9.hw.exeptions.DocumentInvalidException;
import lesson9.hw.exeptions.NumrSeqExeption;
import lesson9.hw.finance.Finance;
import lesson9.hw.registr.Registr;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Registr registr1 = new Registr();
        Finance finance = new Finance("555abcwrwerabc1a2b", 1000, new Date(2000 / 12 / 12), 1488123);


        try {
            registr1.saveDoc(finance);
        } catch (DocumentInvalidException exception) {
            System.out.println("exeption error");
        }


    }
}
