package lesson10.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
    public String task2(String value) {
        String firstPart = null;
        String secondPart = null;
        String thirdPart = null;
        String fourthPart = null;
        String fivePart = null;
        var array = value.split("-");

        for (int i = 0; i < array.length; i++) {
            firstPart = array[0];
            secondPart = array[1];
            thirdPart = array[2];
            fourthPart = array[3];
            fivePart = array[4];
        }

        char b = '*';
        var newval1 = secondPart.toCharArray();
        for (int i = 0; i < newval1.length; i++) {
            newval1[i]=b;
            System.out.print(newval1[i]);

        }

        /*String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
// [a, b, c, d, e]*/


        System.out.println();
        char a = '*';
        var newval2 = fourthPart.toCharArray();
        for (int i = 0; i < newval2.length; i++) {
            newval2[i]= a;
            System.out.print(newval2[i]);
        }

        System.out.println();
        return firstPart+"-" +Arrays.toString(newval1).replace("[", "").replace("]", "").replace(",", "").replace(" ","")
                +"-"+thirdPart+"-"+Arrays.toString(newval2).replace("[", "").replace("]", "").replace(",", "").replace(" ","")+"-"+fivePart;

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
        char b= ' ';
        var newval = thirdPart.toCharArray();

        for (int i = 0; i < newval.length; i++) {
            a= newval[1];
            b = newval[3];

        }


        return firstPart.toLowerCase() + "/" + secondPart.toLowerCase() + "/" + a + "/" + b;
        //как привести последние элементы к lowerCase хз ваще
    }

}
