package lesson9.hw.contract_employe;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractEmploye extends Documents {
    Date docDate;
    Date contractDeadline;

    String employeName;

    public ContractEmploye(String docNumber, Date docDate, Date contractDeadline, String employeName) {
        super(docNumber);
        this.docDate = docDate;
        this.contractDeadline = contractDeadline;
        this.employeName = employeName;
    }

    public ContractEmploye(String docNumber) {
        super(docNumber);
    }

    @Override
    public String toString() {
        return "ContractEmploye{" +
                "docNumber=" + this.getDocNumber() +
                ", docDate=" + docDate +
                ", contractDeadline=" + contractDeadline +
                ", employeName='" + employeName + '\'' +
                '}';
    }

}
