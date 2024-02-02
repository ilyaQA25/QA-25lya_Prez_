package lesson9.hw.contract_goods;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractGoods extends Documents {

    String typeOfGoods;
    Integer quantityOfGoods;
    Date docDate;


    public ContractGoods(String docNumber, String typeOfGoods, Integer quantityOfGoods, Date docDate) {
        super(docNumber);
        this.typeOfGoods = typeOfGoods;
        this.quantityOfGoods = quantityOfGoods;
        this.docDate = docDate;
    }

    public ContractGoods(String docNumber) {
        super(docNumber);
    }


    @Override
    public String toString() {
        return "ContractGoods{" +
                "docNumber=" + this.getDocNumber() +
                ", typeOfGoods='" + typeOfGoods + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", docDate=" + docDate +
                '}';
    }


}
