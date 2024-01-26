package lesson10.hw;

public class Strings {

    public String task1(String value) {
        String firstPart = null;
        String secondPart = null;
        var array = value.split("-");

        for (int i = 0; i < array.length; i++) {
            firstPart = array[0];
            secondPart = array[2];
        }
        return firstPart + secondPart;
    }

//    public String task2withStars(String value) {
//        String firstPart = null;
//        String secondPart = null;
//        var array = value.split("-");
//
//        for (int i = 0; i < array.length; i++) {
//            firstPart = array[1];
//            secondPart = array[3];
//        }
//
//        char a = '*';
//
//        var neval1 = firstPart.toCharArray();
//        for (int i = 0; i < neval1.length; i++) {
//            neval1[i] = a;
//            System.out.print(neval1[i]);
//
//        }
//
//        System.out.print("/");
//        var neval2 = secondPart.toCharArray();
//        for (int i = 0; i < neval2.length; i++) {
//            neval2[i] = a;
//            System.out.print(neval2[i]);
//
//        }
//
//        return value;
//
//
//    }

    public String task2(String value) {
        var array = value.toCharArray();
        char a = '*';
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            ;
            if (b == 0) {
                array[0]= a;
                System.out.println(array[i]);
            }
        }
        return value;
    }

    /*    char a = ' ';
        char b = ' ';

        var newval = thirdPart.toCharArray();

            for (int i = 0; i < newval.length; i++) {
            a = newval[1];
            b = newval[3];
        }


            return firstPart + "/" + secondPart + "/" + a + "/" + b;
    }*/
    public String task3(String value) {
        String firstPart = null;
        String secondPart = null;
        String thirdPart = null;
        var array = value.split("-");

        for (int i = 0; i < array.length; i++) {
            firstPart = array[1];
            secondPart = array[3];
            thirdPart = array[4];
        }

        char a = ' ';
        char b = ' ';

        var newval = thirdPart.toCharArray();

        for (int i = 0; i < newval.length; i++) {
            a = newval[1];
            b = newval[3];
        }


        return firstPart + "/" + secondPart + "/" + a + "/" + b;
    }

}
