package ru.itsjava.collections.lists;

import collection.list.arralist.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Класс MyArrayList должен: ")
public class MyArraListTest {
    public static final int REAL_SIZE = 2;
    public static final int DEFAULT_INT = 10;
    List<MyArrayList> mylist = new ArrayList<>();




    @Test
    @DisplayName("Должен вернуть массив")
    public void checkMyArrayList(){
        mylist = new ArrayList<>();
        mylist.size();
        Assertions.assertEquals(0,0);
    }
    @Test
    @DisplayName("Должен вернуть корректный размер REAL_SIZE")
    public void checkSize() {
        mylist = new ArrayList<>();


        Assertions.assertEquals(REAL_SIZE,mylist.size());
    }
    @Test
    @DisplayName("Должен вернуть корректный размер")
    public void checkIsEmpty(){
        mylist = new ArrayList<>();
        Assertions.assertTrue(mylist.isEmpty());

    }
    @Test
    @DisplayName("Должен вернуть ")
    public void checkContains(){
        Object[] array = new Object[]{123,234,567,2090};
        Assertions.assertEquals(123,array[0]);
    }
    @Test
    @DisplayName("Должен добавить элемент ")
    public void checkAdd(){
        mylist = new ArrayList<>();
        mylist.add("Hello");
        Assertions.assertEquals("Hello",mylist.get(0));
        mylist.add("Bye");
        Assertions.assertEquals("Bye",mylist.get(1));
    }
    @Test
    @DisplayName("Должен удалить элемент ")
    public void checkRemove(){
        mylist = new ArrayList<>();
        mylist.add("first");
        mylist.add("second");
        mylist.remove(1);
        Assertions.assertFalse(mylist.contains("second"));
    }
    @Test
    @DisplayName("Проверить indexOf")
    public void checkIsIndexOF(){
        mylist = new ArrayList<>();
        mylist.add("Первый");
        mylist.add("Второй");
        mylist.add("Тертий");
        mylist.add("Четвертый");
        Assertions.assertEquals(3,mylist.indexOf("Четвертый"));
    }
    @Test
    @DisplayName("Проверить метод lastIndexOF")
    public void checkLastIndexOf(){
        mylist = new ArrayList<>();
        mylist.add("Первый");
        mylist.add("Первый");
        mylist.add("Первый");
        mylist.add("Второй");
        mylist.add("Третий");
        mylist.add("Четвертый");
        Assertions.assertEquals(2,mylist.lastIndexOf("Первый"));
    }
    @Test
    @DisplayName("Прверить метод toString")
    public void checkToString(){
        mylist = new ArrayList<>();
        mylist.add("Первое");
        mylist.add("Первое2");
        mylist.add("Первое3");
        mylist.add("Первое4");
        mylist.add("Первое5");
        Assertions.assertEquals("[Первое, Первое2, Первое3, Первое4, Первое5]",mylist.toString());
    }










}
