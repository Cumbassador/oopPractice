package ru.itsjava.collections.lists;

import oopPractice.Pants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Pants должен: ")

public class PantsTest {

    public static final String DEFAULT_COLOR = "blue";
    public static final int DEFAULT_SIZE = 52;
    public static final String NEW_COLOR = "желтый";

    @DisplayName("Создаваться конструктором.")

    @Test
    public void shouldHaveCorrectConstructor() {
        Pants actualPants = new Pants(DEFAULT_COLOR, DEFAULT_SIZE);

        Assertions.assertEquals(DEFAULT_COLOR, actualPants.getColor());
        Assertions.assertEquals(DEFAULT_SIZE, actualPants.getSize());



    }

    @DisplayName("корректно изменять цвет")
    @Test
    public void shouldHaveCorrectUpdatePants() {
        Pants actualPants = new Pants(DEFAULT_COLOR, DEFAULT_SIZE);

        actualPants.setColor(NEW_COLOR);
        Assertions.assertEquals(NEW_COLOR, actualPants.getColor());
    }

}
