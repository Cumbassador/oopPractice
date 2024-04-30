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

    public void add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length *3/2 +1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            //вставка массива
        }
        array[realSize++] = o;

    }
    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null && array[i].equals(o)){
                delIndex = i;
                break;
            }
        }
        for (int i = delIndex; i < array.length - 1 ; i++) {
            array[i] =array[i+1];

        }
        if (delIndex == -1){
            return false;
        } else{
            realSize--;
            return true;
        }

    }

    public void clear() {
        Object object = null;
        for (int i = 0; i < array.length; i++) {
            array[i]=object;
        }
        realSize=0;
    }

    public Object get(int index) {
        for (int i = 0; i < array.length; i++) {
            if( index == i) {
                return array[i];
            }

        }
        return "Такого индекса не существует.";
    }

    public Object set(int index, Object element) {
        for (int i = 0; i < array.length; i++) {
            if (index==i){
                array[i]=element;

            }
        }
        return "Нет такого индекса.";
    }

    public void add(int index, Object element) {
        realSize++;
        if (index > 0)
        {
            System.arraycopy(array, index, array, index+1, realSize - index);
        }
        array[index] = element;





//        if (realSize == array.length) {
//            Object[] resArray = new Object[array.length *3/2 +1];
//            //копирование массива
//            System.arraycopy(array, 0, resArray, 0, array.length);
//            array = resArray;
//            //вставка массива
//        }
//        for (int i = index; i < array.length-1; i++) {
//            if (index==i){
//                realSize++;
//            }
//            if(array[i]==null){
//                array[i]=element;
//            }
//        }
//        int shift = 1;
//        for (int s = 0; s < shift; s++) {
//            Object temp = array[array.length-1];
//            for (int i = array.length - 1; i > index; i--) {
//                    array[i] = array[i - 1];
//
//            }
//            array[array.length-1] = temp;
//
//
//        }
//        realSize++;




    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if(!isCorrectIndex(index)){
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index){
        if ((index>-1) || (index<realSize)){
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o==array[i]){
                System.out.println("Индекс обьекта равен " + i);
            }
        }
        return 0 ;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length-1; i>=0; i--) {
            if (o==array[i]){
                System.out.println("Индекс последнего обьекта равен " + i);
                break;
            }

        }
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
