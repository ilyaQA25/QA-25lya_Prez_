package lesson7.hw.facility;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director();
        System.out.println(director1.printJobTitle());

        Worker worker1 = new Worker();
        System.out.println(worker1.printJobTitle());



        Accountant accountant1 = new Accountant();
        System.out.println(accountant1.printJobTitle());
    }
}
