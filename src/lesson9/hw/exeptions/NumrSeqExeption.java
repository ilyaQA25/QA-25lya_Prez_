package lesson9.hw.exeptions;

import lesson9.hw.contract_employe.ContractEmploye;
import lesson9.hw.contract_goods.ContractGoods;
import lesson9.hw.documents.Documents;
import lesson9.hw.finance.Finance;

public class NumrSeqExeption extends DocumentInvalidException {
    public NumrSeqExeption() {
        super();
    }

    public boolean methodExeption(Documents documents1) {
        if (!documents1.getDocNumber().startsWith("555")) {
            throw new NumrSeqExeption();
        }

        return false;
    }

}
