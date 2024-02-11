package lesson11.hw;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] myArray;

    public MyArrayList(int length) {
        this.myArray = new Object[length];
    }

    public MyArrayList() {
    }

    public boolean add(T t) {
        if (getSize() == myArray.length) {
            increase(1);
        }
        myArray[getSize()] = t;
        return true;
    }

    private Object[] increase(int increaseOn) {
        int newLen = myArray.length + increaseOn;
        return myArray = Arrays.copyOf(myArray, newLen);
    }


    public boolean containsElement(T t) {
        for (int i = 0; i < myArray.length; i++) {
            if (t.equals(myArray[i])) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                counter++;
            } else {
                return counter;
            }

        }
        return counter;
    }



    public Object getElement(int index) {
        try {
            Object object = myArray[index];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "Invalid index: " + exception.getMessage();
        }
        return myArray[index];

    }

    public boolean remove(int index) {
        if (index <= myArray.length) {
            myArray[index] = null;
            return true;
        } else {
            return false;
        }
    }

    public void clearAll() {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                myArray[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}

