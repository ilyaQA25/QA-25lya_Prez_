package lesson10.hw;

import java.util.Arrays;

public class Strings {


    public String task1(String value) {
        String firstPart = null;
        String secondPart = null;
        String[] array = value.split("-");


        firstPart = array[0];
        secondPart = array[2];

        return firstPart + secondPart;
    }

    public String task2(String value) {


        String firstPart = null;
        String secondPart = null;
        String thirdPart = null;
        String fourthPart = null;
        String fivePart = null;
        String[] array = value.split("-");


        firstPart = array[0];
        secondPart = array[1];
        thirdPart = array[2];
        fourthPart = array[3];
        fivePart = array[4];


        //String value = "5554-abc-5678-eDc-1a2b";
        StringBuffer strBuffer = new StringBuffer(secondPart);
        strBuffer.replace(0, 3, "***");

        StringBuffer strBuffer1 = new StringBuffer(fourthPart);
        strBuffer1.replace(0, 3, "***");


        return firstPart + "-" + strBuffer + "-" + thirdPart + "-" + strBuffer1 + "-" + fivePart;

    }

    public String task3(String value) {
        String firstPart = null;
        String secondPart = null;
        String thirdPart = null;
        String[] array = value.split("-");


        firstPart = array[1];
        secondPart = array[3];
        thirdPart = array[4];


        char a = ' ';
        char b = ' ';
        char[] newval = thirdPart.toCharArray();
        /*System.out.println(Arrays.toString(newval));*/
        a = newval[1];
        b = newval[3];

        //String value = "5554-abc-5678-eDc-1a2b";
        // cпросить, почему записи a = newval[1] и запись newval[1]=а не одно и тоже!

        return firstPart.toLowerCase() + "/" + secondPart.toLowerCase() + "/" + String.valueOf(a).toLowerCase() + "/" + String.valueOf(b).toLowerCase();
        //как привести последние элементы к lowerCase хз ваще
    }

    public String task4(String value) {
        /*StringBuilder value1 = new StringBuilder(value);
        StringBuilder[] array = new StringBuilder[]{value1.delete(0, 5).delete(3, 8).delete(8, 9).delete(9, 10)};
        return Arrays.deepToString(array).toUpperCase();*/

        String firstPart = null;
        String secondPart = null;
        String thirdPart = null;
        String[] array = value.split("-");


        firstPart = array[1];
        secondPart = array[3];
        thirdPart = array[4];

        StringBuilder val1 = new StringBuilder(firstPart);
        StringBuilder val2 = new StringBuilder(secondPart);
        StringBuilder val3 = new StringBuilder(thirdPart);
        val3.setCharAt(0, '/');
        val3.setCharAt(2, '/');

        return "Letters:" + val1.toString().toUpperCase() + "/" + val2.toString().toUpperCase() + val3.toString().toUpperCase();
    }


    public boolean task5(String value) {
        return value.toLowerCase().contains("abc");

    }

    public boolean task6(String value) {
        return value.startsWith("555");
    }

    public boolean task7(String value) {
        return value.endsWith("1a2b");

    }


}
