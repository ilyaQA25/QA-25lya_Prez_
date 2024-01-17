package lesson8.hw;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(37588,"Nokia",230);
        Phone phone2 = new Phone(298,"Samsung",200);
        Phone phone3 = new Phone(8028,"Sony Ericson",130);
        Phone phone4 = new Phone(7788,"Huawei",150);

        System.out.println(phone1.getNumber());

        int[] phones = new int[4];
        phones[0]=phone1.getNumber();
        phones[1]=phone2.getNumber();
        phones[2]=phone3.getNumber();
        phones[3]=phone4.getNumber();

        Phone.sendMessage(phones,"MCHS! Be careful");

//        var array = Phone.getArray(phone1, phone2, phone3, phone4);


     /*   System.out.println(phone1.reciveCall("Alik"));
        System.out.println(phone1.getNumber());
        System.out.println(phone1.reciveCall("Vlad", 8877));
*/


    }
}
