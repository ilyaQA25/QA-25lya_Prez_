package lesson2;

// написать программу для вывода названия поры года по номерам месяца

public class seasonOfTheYear {
    public static void main(String[] args) {

        int numberofthemonth=1;

        switch (numberofthemonth){
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10:
                System.out.println("autumn");
                break;
            case 11:
                System.out.println("autumn");
                break;
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("wrong number");
                break;
        }

    }
}