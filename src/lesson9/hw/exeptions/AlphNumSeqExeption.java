package lesson9.hw.exeptions;

import lesson9.hw.contract_employe.ContractEmploye;
import lesson9.hw.contract_goods.ContractGoods;
import lesson9.hw.documents.Documents;
import lesson9.hw.finance.Finance;

public class AlphNumSeqExeption extends DocumentInvalidException {

    public AlphNumSeqExeption() {
        super();
    }
    public boolean methodExeption(Documents documents1) {
        if (!documents1.getDocNumber().endsWith("1a2b")){
            throw new  AlphNumSeqExeption();
        }
    return false;

    }

}
