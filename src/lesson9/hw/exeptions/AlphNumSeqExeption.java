package lesson9.hw.exeptions;

import lesson9.hw.contractEmploye.ContractEmploye;
import lesson9.hw.contractGoods.ContractGoods;
import lesson9.hw.finance.Finance;

public class AlphNumSeqExeption extends IllegalArgumentException {

    public AlphNumSeqExeption() {
        super();
    }
    public void methodExeption(ContractEmploye employee, ContractGoods goods, Finance finance) {
        if (!employee.docNumber.endsWith("1a2b") &&!goods.docNumber.endsWith("1a2b")&&finance.docNumber.endsWith("1a2b")){
            throw new  AlphNumSeqExeption();
        }
    }
}
