package lesson9.hw.exeptions;

import lesson9.hw.contractEmploye.ContractEmploye;
import lesson9.hw.contractGoods.ContractGoods;
import lesson9.hw.finance.Finance;

public class NumrSeqExeption extends IllegalArgumentException{
    public NumrSeqExeption(){
        super();
    }
    public void methodExeption(ContractEmploye employee, ContractGoods goods, Finance finance){
                if (!employee.docNumber.startsWith("555")||!goods.docNumber.startsWith("555")||finance.docNumber.startsWith("555")){
                    throw new NumrSeqExeption();
                }
    }

}
