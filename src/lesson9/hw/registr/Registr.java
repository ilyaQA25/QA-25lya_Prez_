package lesson9.hw.registr;

import lesson9.hw.documents.Documents;
import lesson9.hw.exeptions.AlphNumSeqExeption;
import lesson9.hw.exeptions.AlphSeqExeption;
import lesson9.hw.exeptions.DocumentInvalidException;
import lesson9.hw.exeptions.NumrSeqExeption;

public class Registr {
    private String docNumber;
    public Documents[] array = new Documents[10];

    public String infoDoc(Documents document) {
        return document.toString();
    }

    public Documents[] saveDoc(Documents document) throws DocumentInvalidException {

        if (new AlphNumSeqExeption().methodExeption(document)) {
            throw new AlphNumSeqExeption();
        }
        if (new AlphSeqExeption().methodException(document)) {
            throw new AlphSeqExeption();
        }
        if (new NumrSeqExeption().methodExeption(document)) {
            throw new NumrSeqExeption();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = document;
            }
            break;
        }
        return array;


    }


}
