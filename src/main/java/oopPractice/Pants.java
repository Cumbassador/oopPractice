package oopPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@AllArgsConstructor
@Data
public class Pants {
    private String color;
    private int size;
//    public Pants (String color,int size){
//        this.color = color;
//        this.size = size;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; // ебьект сравнивает сам себя(рефлексивность)
//        if (o == null || getClass() != o.getClass()) return false; // обьект сравнивает себя с нулем при равенстве возвращает 0
//        Pants pants = (Pants) o; // проверка ттого, действительно ли обьект принадлежит к нужному классу
//        return size == pants.size && Objects.equals(color, pants.color); // сравнение интовых и стринговых параметров
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color, size); // возвращает хэшкод
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
}