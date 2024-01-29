package lesson9.hw.documents;

public abstract class Documents {
    private String docNumber;

    public String getDocNumber() {
        return docNumber;
    }


    public Documents(String docNumber) {
        this.docNumber = docNumber;
    }
}
