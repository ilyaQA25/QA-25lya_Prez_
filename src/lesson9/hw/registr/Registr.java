package lesson9.hw.registr;

import lesson9.hw.documents.Documents;

public class Registr {

    public Documents[] array = new Documents[10];

    public String infoDoc(Documents document) {
        return document.toString();
    }

    public Documents[] saveDoc(Documents document) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = document;
            }
            break;
        }
        return array;
    }

}
