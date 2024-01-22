package lesson9.hw.contractEmploye;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class ContractEmploye extends Documents {
    Integer docNumber;
    Date docDate;
    Date contractDeadline;

    String employeName;

    public ContractEmploye(Integer docNumber, Date docDate, Date contractDeadline, String employeName) {
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.contractDeadline = contractDeadline;
        this.employeName = employeName;
    }

    public ContractEmploye() {
    }

    @Override
    public String toString() {
        return "ContractEmploye{" +
                "docNumber=" + docNumber +
                ", docDate=" + docDate +
                ", contractDeadline=" + contractDeadline +
                ", employeName='" + employeName + '\'' +
                '}';
    }

}
