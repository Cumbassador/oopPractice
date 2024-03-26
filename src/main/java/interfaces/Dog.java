package interfaces;

public class Dog implements Runable,Walkable,Swimable {


    @Override
    public void run() {
        System.out.println("Собака умеет бегать");


    }

    @Override
    public int maxRunDictance() {
        return 20;
    }

    @Override
    public void swim() {
        System.out.println("Собака плохо плавает ");

    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("Собака умеет ходить");

    }
}
