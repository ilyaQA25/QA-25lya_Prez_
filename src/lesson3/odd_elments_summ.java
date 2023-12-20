package lesson3;

public class odd_elments_summ {
    public static void main(String[] args) {
        int sum=0;
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        for (int i = 0; i < mas.length; i++) {
            if (i%2!=0){
                sum+=mas[i]; // в данной строчке мы в переменную sum вписываем суммы нечетных
                //элементов массива. данной строчкой мы приравниваем массив к int
                //запись mas[i] - без указанаия в скобках i сравнить с int не вышло бы
                System.out.println(mas[i]);
            }
        }
        System.out.println(sum);
    }
}
