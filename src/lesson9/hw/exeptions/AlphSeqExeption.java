package lesson9.hw.exeptions;

import lesson9.hw.contractEmploye.ContractEmploye;
import lesson9.hw.contractGoods.ContractGoods;
import lesson9.hw.finance.Finance;

import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatException;

public class AlphSeqExeption extends IllegalArgumentException {

    public AlphSeqExeption() {
        super();
    }

    public void methodException(ContractEmploye employee, ContractGoods goods, Finance finance) {
        if (!employee.docNumber.contains("abc")|| !goods.docNumber.contains("abc")||!finance.docNumber.contains("abc")) {
            throw new AlphSeqExeption();
        }
    }
}

