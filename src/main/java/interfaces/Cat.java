package interfaces;

public class Cat implements Runable,Walkable,Flyable,Swimable{
    @Override
    public void fly() {
        System.out.println("Cat cant fly");

    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Cat can run");

    }

    @Override
    public int maxRunDictance() {
        return 17;
    }

    @Override
    public void swim() {
        System.out.println("Cat is a bad swimmer ");

    }

    @Override
    public double maxSwimSpeed() {
        return 2;
    }

    @Override
    public void walk() {
        System.out.println("Cat can walk");

    }
}
