package lesson9.hw.main;

import lesson9.hw.contractEmploye.ContractEmploye;
import lesson9.hw.contractGoods.ContractGoods;
import lesson9.hw.exeptions.AlphNumSeqExeption;
import lesson9.hw.exeptions.AlphSeqExeption;
import lesson9.hw.exeptions.NumrSeqExeption;
import lesson9.hw.finance.Finance;
import lesson9.hw.registr.Registr;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Registr registr1 = new Registr();

        ContractEmploye contractEmploye1 = new ContractEmploye("abc23", new Date(2000 / 12 / 12), new Date(2000 / 9 / 9), "Nikita");

        Finance finance = new Finance(123, new Date(2012/01/23), "5abc55asdfa", 228);
        ContractGoods contractGoods1 = new ContractGoods("wer2341a2b", "Pencil", 3453, new Date(2009 / 12 / 12));

        registr1.saveDoc(finance);
        registr1.saveDoc(contractEmploye1);
        registr1.saveDoc(contractGoods1);

        /*try {
            new AlphSeqExeption().methodException(contractEmploye.docNumber);
        } catch (AlphSeqExeption alphSeqExeption) {
            System.out.println("Not contains");
        }*/

        AlphSeqExeption alphSeqExeption = new AlphSeqExeption();
        try {
            alphSeqExeption.methodException(contractEmploye1, contractGoods1, finance);
        }catch (AlphSeqExeption alphSeqExeption1){
            System.out.println("not contains");
        }
        AlphNumSeqExeption alphNumSeqExeption = new AlphNumSeqExeption();
        try {
            alphNumSeqExeption.methodExeption(contractEmploye1,contractGoods1,finance);
        }catch (AlphNumSeqExeption alphNumSeqExeption1){
            System.out.println("not end");
        }

        NumrSeqExeption numrSeqExeption = new NumrSeqExeption();
        try {
            numrSeqExeption.methodExeption(contractEmploye1,contractGoods1,finance);
        }catch (NumrSeqExeption numrSeqExeption1){
            System.out.println("not start with");
        }


        System.out.println(registr1.infoDoc(finance));
        System.out.println(registr1.infoDoc(contractEmploye1));
        System.out.println(registr1.infoDoc(contractGoods1));



    }
}
