package collection.list.arralist;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static final int DEFAULT_INT = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_INT];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        StringBuilder stringBuilder = new StringBuilder();
        if (realSize > 0) {
            System.out.println(stringBuilder.append("Строка не пустая"));
        } else {
            System.out.println("\"Строка пустая\" - " + false);
        }
        return false;
    }

    public boolean contains(Object o) {
        for (Object object : array) {
            if (o == object) {
                System.out.println("Здесь содержиться элемент" + "  -" + object);
                break;
            }
        }
        return false;

    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            //вставка массива
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        Object object = null;
        for (int i = 0; i < array.length; i++) {
            array[i]=object;

        }
        realSize=0;


    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
