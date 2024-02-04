package lesson9.hw.exeptions;

import lesson9.hw.contract_employe.ContractEmploye;
import lesson9.hw.contract_goods.ContractGoods;
import lesson9.hw.documents.Documents;
import lesson9.hw.finance.Finance;

public class AlphSeqExeption extends DocumentInvalidException {

    public AlphSeqExeption() {
        super();
    }

    public boolean methodException(Documents documents1) {
        if (!documents1.getDocNumber().contains("abc")) {
            throw new AlphSeqExeption();
        }

        return false;
    }
}

