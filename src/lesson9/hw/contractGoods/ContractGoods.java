package lesson9.hw.contractGoods;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractGoods extends Documents {
    Integer docNumber;

    String typeOfGoods;
    Integer quantityOfGoods;
    Date docDate;

    public ContractGoods(Integer docNumber, String typeOfGoods, Integer quantityOfGoods, Date docDate) {
        this.docNumber = docNumber;
        this.typeOfGoods = typeOfGoods;
        this.quantityOfGoods = quantityOfGoods;
        this.docDate = docDate;
    }

    public ContractGoods() {
    }

    @Override
    public String toString() {
        return "ContractGoods{" +
                "docNumber=" + docNumber +
                ", typeOfGoods='" + typeOfGoods + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", docDate=" + docDate +
                '}';
    }

    String ContractGoodsInfo() {
        return "doc number: " + String.valueOf(docNumber) + " type of goods: " + typeOfGoods + " quantityOfGoods: " + String.valueOf(quantityOfGoods) + " doc date: " + String.valueOf(docDate);
    }
}
