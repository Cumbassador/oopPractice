package interfaces;

public class Fish implements Runable,Walkable,Flyable,Swimable {
    @Override
    public void fly() {
        System.out.println("Fish cant fly");

    }

    @Override
    public String flyMaxDistance() {
        System.out.println("Fish cant fly");
        return null;
    }

    @Override
    public void run() {
        System.out.println("Fish cant run");

    }

    @Override
    public int maxRunDictance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Fish is a good swimmer");

    }

    @Override
    public double maxSwimSpeed() {
        return 30;
    }

    @Override
    public void walk() {
        System.out.println("Fish cant walk");

    }
}
