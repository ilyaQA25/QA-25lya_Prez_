package lesson9.hw.documents;

import java.util.Date;

public abstract class Documents {
    private String docNumber;

    private Date docDate;

    public Date getDocDate() {
        return docDate;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Documents(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public Documents() {
    }
}
