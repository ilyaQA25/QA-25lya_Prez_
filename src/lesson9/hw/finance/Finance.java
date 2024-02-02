package lesson9.hw.finance;

import lesson9.hw.documents.Documents;

import java.util.Date;

public class Finance extends Documents {
    private Integer amountInMonth;
    private Integer codeDepartment;

    public Finance(String docNumber, Integer amountInMonth, Date docDate, Integer codeDepartment) {
        super(docNumber, docDate);
        this.amountInMonth = amountInMonth;
        this.codeDepartment = codeDepartment;
    }

    public Finance(String docNumber, Date docDate) {
        super(docNumber, docDate);
    }

    public Finance() {
    }

    @Override
    public String toString() {
        return "Finance{" +
                "amountInMonth=" + amountInMonth +
                ", docDate=" + this.getDocDate() +
                ", docNumber=" + this.getDocNumber() +
                ", codeDepartment=" + codeDepartment +
                '}';
    }

}
