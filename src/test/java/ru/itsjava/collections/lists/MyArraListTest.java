package ru.itsjava.collections.lists;

import collection.list.Book;
import collection.list.arralist.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Класс MyArrayList должен: ")
public class MyArraListTest {
    public static final int REAL_SIZE = 2;

    MyArrayList mylist = new MyArrayList();



    @Test
    @DisplayName("Должен вернуть корректный размер REAL_SIZE")
    public void checkSize() {
        mylist = new MyArrayList();


        Assertions.assertEquals(REAL_SIZE,2);
    }
    @Test
    @DisplayName("Проверка на то пустой список или нет")
    public void checkIsEmpty(){
        mylist = new MyArrayList();
        Assertions.assertFalse(mylist.isEmpty());

    }
    @Test
    @DisplayName("Должен проверить содержиться ли массив в списке ")
    public void checkContains(){
        mylist  = new MyArrayList();
        mylist.add("first");
        mylist.add("second");
        Assertions.assertEquals("first",mylist.get(0));
    }
    @Test
    @DisplayName("Должен роверить добавился ли элемент в список ")
    public void checkAdd(){
        mylist = new MyArrayList();
        mylist.add("first");
        Assertions.assertEquals("first",mylist.get(0));

    }
    @Test
    @DisplayName("Должен удалить элемент ")
    public void checkRemove(){
        mylist = new MyArrayList(){};
        mylist.add("first");
        mylist.add("second");

        mylist.remove(1);
        Assertions.assertFalse(mylist.contains("second"));
    }
    @Test
    @DisplayName("Должен сверить индекс ")
    public void checkIndexOf(){
        mylist = new MyArrayList();
        mylist.add("first");
        mylist.add("second");
        mylist.add("third");
        Assertions.assertEquals(1,mylist.indexOf("second"));

    }

    @Test
    @DisplayName("Проверить последний индекс повторяющегося элемента")
    public void checkLastIndexOf(){
        mylist = new MyArrayList();
        mylist.add("first");
        mylist.add("forth");
        mylist.add("forth");

        Assertions.assertEquals(2,mylist.lastIndexOf("forth"));
    }
    @Test
    @DisplayName("Прверить метод toString")
    public void checkToString(){
        mylist = new MyArrayList();
        mylist.add("first");
        mylist.add("first");
        mylist.add("first");

        Assertions.assertEquals("MyArrayList{first first first }",mylist.toString());
    }










}
