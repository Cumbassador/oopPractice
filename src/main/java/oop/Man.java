package oop;

public class Man {
    private int age;
    private String name;

    public Man(String name, int age) {
        this.name = name;
        this.age = 27;

    }

    public void hello() {
        System.out.println("Привет я, " + name + " " + age);
    }

    public void hobbie() {
        System.out.println(name + " " + age + " " + "Collect vinyl records");
    }
}
