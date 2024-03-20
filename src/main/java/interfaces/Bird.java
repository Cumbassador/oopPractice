package interfaces;

public class Bird implements Runable,Walkable,Flyable,Swimable{
    @Override
    public void fly() {
        System.out.println("Bird can fly");

    }

    @Override
    public String flyMaxDistance() {
        return "1000 km";
    }

    @Override
    public void run() {
        System.out.println("Bird cant fly");

    }

    @Override
    public int maxRunDictance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Bird cant swim");

    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Bird can walk ");

    }
}
