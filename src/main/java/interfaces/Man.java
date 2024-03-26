package interfaces;

public class Man implements Walkable,Runable,Swimable,Eatable,Talkable{

    @Override
    public void walk() {
        System.out.println("Человек ходит");
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
    public void eat(){
        System.out.println("man can eat");

    }
    public void talk(){
        System.out.println("man can talk");
    }
}
