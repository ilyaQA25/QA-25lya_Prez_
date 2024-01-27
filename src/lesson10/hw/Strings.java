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
            newval1[i] = b;
        }


        System.out.println();
        char a = '*';
        var newval2 = fourthPart.toCharArray();
        for (int i = 0; i < newval2.length; i++) {
            newval2[i] = a;

        }

        return firstPart + "-" +
                Arrays.toString(newval1).replace("[", "").replace("]", "").replace(",", "").replace(" ", "")
                + "-" + thirdPart + "-" + Arrays.toString(newval2).replace("[", "").replace("]", "").replace(",", "").replace(" ", "") + "-" + fivePart;

    }


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
        System.out.println(Arrays.toString(newval));
        for (int i = 0; i < newval.length; i++) {
            a = newval[1];
            b = newval[3];

        }
        // cпросить, почему записи a = newval[1] и запись newval[1]=а не одно и тоже!

        return firstPart.toLowerCase() + "/" + secondPart.toLowerCase() + "/" + a + "/" + b;
        //как привести последние элементы к lowerCase хз ваще
    }

    public String task4(String value) {
        StringBuilder value1 = new StringBuilder(value);
        var array = value1.delete(0, 5).delete(3, 8).delete(8, 9).delete(9, 10);
        return array.toString().toUpperCase();
    }


    public String task5(String value) {
        if (value.contains("abc") || value.contains("ABC")) {
            System.out.println("abc is contained");
        }

        return value;

    }

    public String task6(String value) {
        if (value.startsWith("555")) {
            System.out.println("string start with 555");
        }

        return value+"/";
    }

    public String task7(String value) {
        if (value.endsWith("1a2b")) {
            System.out.println("string ended with 1a2b");
        }

        return value +"";
    }


}
