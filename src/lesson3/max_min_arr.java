package lesson3;

public class max_min_arr {
    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]<min){
                min=mas[i];
            }
            if (mas[i]>max){
                max=mas[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
