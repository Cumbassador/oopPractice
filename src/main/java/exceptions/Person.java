package exceptions;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public Person(String name, int age){

        this.name = name;
        this.age = age;


    }
    public void checkAge()throws AgeNotValible{
        if(age>150||age<0){
            throw new AgeNotValible("Возраст не действительный" + age);
        }
    }



}
