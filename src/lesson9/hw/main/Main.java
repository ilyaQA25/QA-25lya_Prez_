package lesson9.hw.main;

import lesson9.hw.contract_employe.ContractEmploye;
import lesson9.hw.contract_goods.ContractGoods;
import lesson9.hw.exeptions.AlphNumSeqExeption;
import lesson9.hw.exeptions.AlphSeqExeption;
import lesson9.hw.exeptions.NumrSeqExeption;
import lesson9.hw.finance.Finance;
import lesson9.hw.registr.Registr;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Registr registr1 = new Registr();

        ContractEmploye contractEmploye1 = new ContractEmploye("abc231a2b", new Date(2000 / 12 / 12), new Date(2000 / 9 / 9), "Nikita");

        Finance finance = new Finance("wrwerabc1a2b",1000, new Date(2000/12/12),1488123);
        ContractGoods contractGoods1 = new ContractGoods("wer2341a2b", "Pencil", 3453, new Date(2009 / 12 / 12));

        registr1.saveDoc(finance);
        registr1.saveDoc(contractEmploye1);
        registr1.saveDoc(contractGoods1);

        /*try {
            new AlphSeqExeption().methodException(contractEmploye.docNumber);
        } catch (AlphSeqExeption alphSeqExeption) {
            System.out.println("Not contains");
        }*/

        AlphNumSeqExeption alphNumSeqExeption = new AlphNumSeqExeption();
        try {
            alphNumSeqExeption.methodExeption(contractEmploye1);
        }catch (AlphNumSeqExeption alphNumSeqExeption1){
            System.out.println("not ended");
        }

        System.out.println(registr1.infoDoc(finance));
        System.out.println(registr1.infoDoc(contractEmploye1));
        System.out.println(registr1.infoDoc(contractGoods1));



    }
}
