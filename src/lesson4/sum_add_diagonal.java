package lesson4;

public class sum_add_diagonal {
    public static void main(String[] args) {
        int[][] array ={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for (int i = array.length-1; i>=0 ; i--) {
            sum+=array[i][array.length-i-1];

            }
        System.out.println(sum);


        }

    }

//{{1,2,3}
//{4,5,6}
//{7,8,9}