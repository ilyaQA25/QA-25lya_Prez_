package lesson2;

public class TemperatureOutside {
    public static void main(String[] args) {
        int temperature = -56;

        if (temperature>-5){
            System.out.println("warm");
        }else if (temperature<=-5 && temperature>=-20){
            System.out.println("normal temperature");
        }else if ( temperature<=-20){
            System.out.println("cold");

        }
    }
}
