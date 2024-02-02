package lesson9.hw.contract_goods;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractGoods extends Documents {

    private String typeOfGoods;
    private Integer quantityOfGoods;



    public ContractGoods(String docNumber, String typeOfGoods, Integer quantityOfGoods, Date docDate) {
        super(docNumber, docDate);
        this.typeOfGoods = typeOfGoods;
        this.quantityOfGoods = quantityOfGoods;

    }

    public ContractGoods(String docNumber, Date docDate) {
        super(docNumber, docDate);
    }

    public ContractGoods() {
    }

    @Override
    public String toString() {
        return "ContractGoods{" +
                "docNumber=" + this.getDocNumber() +
                ", typeOfGoods='" + typeOfGoods + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", docDate=" + this.getDocDate() +
                '}';
    }


}
