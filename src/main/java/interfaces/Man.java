package interfaces;

public class Man implements Walkable, Flyable,Runable,Swimable{

    @Override
    public void walk() {
        System.out.println("Человек ходит");
    }

    @Override
    public void fly() {
        System.out.println("Не может летать");

    }

    @Override
    public String flyMaxDistance() {
        System.out.println("не может летать");

        return null;
    }

    @Override
    public void run() {
        System.out.println("Человек умеет бегать");

    }

    @Override
    public int maxRunDictance() {

        return 15 ;
    }

    @Override
    public void swim() {
        System.out.println("умеет плавать но не глубоко");

    }

    @Override
    public double maxSwimSpeed() {
        return 10;
    }
}
