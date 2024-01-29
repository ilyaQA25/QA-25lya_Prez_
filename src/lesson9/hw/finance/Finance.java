package lesson9.hw.finance;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class Finance extends Documents {
    Integer amountInMonth;
    Date docDate;


    Integer codeDepartment;

    public Finance(String docNumber, Integer amountInMonth, Date docDate, Integer codeDepartment) {
        super(docNumber);
        this.amountInMonth = amountInMonth;
        this.docDate = docDate;
        this.codeDepartment = codeDepartment;
    }

    public Finance(String docNumber) {
        super(docNumber);
    }

    @Override
    public String toString() {
        return "Finance{" +
                "amountInMonth=" + amountInMonth +
                ", docDate=" + docDate +
                ", docNumber=" + this.getDocNumber() +
                ", codeDepartment=" + codeDepartment +
                '}';
    }

}
