package lesson9.hw.finance;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class Finance extends Documents {
    Integer amountInMonth;
    Date docDate;
    Integer docNumber;

    Integer codeDepartment;

    public Finance(Integer amountInMonth, Date docDate, Integer docNumber, Integer codeDepartment) {
        this.amountInMonth = amountInMonth;
        this.docDate = docDate;
        this.docNumber = docNumber;
        this.codeDepartment = codeDepartment;
    }

    public Finance() {
    }

    @Override
    public String toString() {
        return "Finance{" +
                "amountInMonth=" + amountInMonth +
                ", docDate=" + docDate +
                ", docNumber=" + docNumber +
                ", codeDepartment=" + codeDepartment +
                '}';
    }

}
