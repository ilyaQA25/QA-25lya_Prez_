package lesson9.hw.contract_employe;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractEmploye extends Documents {

    private Date contractDeadline;

    private String employeName;

    public ContractEmploye(String docNumber, Date docDate, Date contractDeadline, String employeName) {
        super(docNumber, docDate);
        this.contractDeadline = contractDeadline;
        this.employeName = employeName;
    }

    public ContractEmploye() {
    }

    public ContractEmploye(String docNumber, Date docDate) {
        super(docNumber, docDate);
    }

    @Override
    public String toString() {
        return "ContractEmploye{" +
                "docNumber=" + this.getDocNumber() +
                ", docDate=" + this.getDocDate() +
                ", contractDeadline=" + contractDeadline +
                ", employeName='" + employeName + '\'' +
                '}';
    }

}
