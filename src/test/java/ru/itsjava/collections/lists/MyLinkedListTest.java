package ru.itsjava.collections.lists;

import collection.list.arralist.MyArrayList;
import collection.list.linkedlist.MyLinkedList;
import collection.list.linkedlist.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Data

public class MyLinkedListTest {



    private Node head;
    private Object value;
    private Node next;
    MyLinkedList list = new MyLinkedList();


    @Test
    @DisplayName("Должен вернуть корректный размер REAL_SIZE")
    public void checkSize() {
        list.add("first");
        Assertions.assertEquals(1,list.size());



    }

    @Test
    @DisplayName("Проверка на то пустой список или нет")
    public void checkIsEmpty() {
        list.add("first");
        Assertions.assertFalse(false);


    }

    @Test
    @DisplayName("Должен проверить содержиться ли элемент' в списке ")
    public void checkContains() {
        list.add("first");
        Assertions.assertEquals("first",list.contains("first"));

    }

    @Test
    @DisplayName("Должен роверить добавился ли элемент в список ")
    public void checkAdd() {
        list.add("second");
        Assertions.assertEquals("second",list.get(0));


    }

    @Test
    @DisplayName("Должен удалить элемент ")
    public void checkRemove() {
        list.add("first");
        list.add("second");
        list.add("third");
        list.remove(1);
        Assertions.assertEquals("third",list.get(1));

    }

    @Test
    @DisplayName("Должен сверить индекс ")
    public void checkIndexOf() {
        list.add("first");
        Assertions.assertEquals(0,list.indexOf("first"));


    }

    @Test
    @DisplayName("Проверить последний индекс повторяющегося элемента")
    public void checkLastIndexOf() {
        list.add("first");
        list.add("first");
        list.add("first");
        Assertions.assertEquals(2,list.lastIndexOf("first"));




    }


    }


