package lesson10;


import java.util.Scanner;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//        Вывести найденные строки и их длину.
//
//        ● для вывода результат используйте StringBuilder
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scan.nextInt();

        Scanner newScan= new Scanner(System.in);
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = newScan.nextLine();
        }

        String maxLength = strings[0];
        String minLength = strings[0];


        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength.length()) {
                maxLength = strings[i];
            }
            if (strings[i].length() < minLength.length()) {
               minLength= strings[i];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(minLength).append(" ").append(minLength.length()).append("\n").append(maxLength).append(" ").append(maxLength.length());
        String sttrr = stringBuilder.toString();
        System.out.println(sttrr);
    }
}

