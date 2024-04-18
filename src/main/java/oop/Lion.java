package oop;

import java.util.Random;

public class Lion {
    private String name;
    private int age;

    public Lion(String paramName,int paraAge) {
        this.name = paramName;
        this.age = paraAge;

    }

    public void sayR() {
        System.out.println(name +" " + "RRRRRRR");
    }

    public void ageLion() {

        System.out.println(age + " " +  " лет.");


    }

    public void sexOfLion() {
        Random random = new Random();
        int sex = random.nextInt(2);
        if (sex == 1) {
            System.out.println(" male");
        }
        System.out.println(" female");
    }
}
