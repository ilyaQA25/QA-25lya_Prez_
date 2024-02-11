package lesson11.hw;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>(5);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(9);
        myList.add(1);

        System.out.println(myList);
        System.out.println(myList.containsElement(5));
        System.out.println(myList.getSize());
        System.out.println(myList.getElement(3));
        System.out.println(myList.remove(3));
        myList.clearAll();
        System.out.println(myList);
    }
}
