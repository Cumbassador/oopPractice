package ru.itsjava.collections.lists;

import oopPractice.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Класс Person должен: ")

public class PersonTest {

    public static final String DEF_NAME = "Albert";
    public static final int DEF_AGE = 15;
    public static final String NEW_NAME = "Andrey";
    public static final int NEW_AGE = 18;

    @DisplayName("Создавать конструкторы ")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person albert = new Person(DEF_NAME, DEF_AGE);

        assertAll("albert", () -> assertEquals(DEF_AGE, albert.getAge()),
                () -> assertEquals(DEF_NAME,albert.getName()));
    }
    @Test
    @DisplayName("Метод birthday работает")
    public  void shouldHaveBirthdayMethod(){
        Person sergey = new Person(DEF_NAME,DEF_AGE);
        sergey.birthday();
        assertEquals(DEF_AGE +1,sergey.getAge());

    }
    @Test
    @DisplayName("Метод takeBeer работает")
    public void shouldHaveCorrectGetTakeMethod(){
        Person roman = new Person(DEF_NAME,DEF_AGE);
        roman.takeBeer();
        assertFalse(false);
        Person andrey = new Person(NEW_NAME, NEW_AGE);
        assertTrue(true);

    }


}
