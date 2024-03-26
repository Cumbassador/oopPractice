package interfaces;

public class Fish implements Flyable,Swimable {
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
    public void swim() {
        System.out.println("Fish is a good swimmer");

    }

    @Override
    public double maxSwimSpeed() {
        return 30;
    }


}
