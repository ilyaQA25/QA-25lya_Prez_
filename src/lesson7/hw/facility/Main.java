package lesson7.hw.facility;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("director");
        System.out.println(director1.jobTitle);

        Worker worker1 = new Worker("worker");
        System.out.println(worker1.jobTitle);

        Accountant accountant1 = new Accountant("accountant");
        System.out.println(accountant1.jobTitle);
    }
}
