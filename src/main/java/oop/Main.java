package oop;

public class Main {
    public static void main(String[] args) {
        Lion scar = new Lion("Scar ", 14);
        Lion mufasa = new Lion("Mufasa ", 12);
        scar.sayR();
        mufasa.sayR();
        scar.ageLion();
        mufasa.ageLion();
        mufasa.sexOfLion();
        scar.sexOfLion();
        Man number1 = new Man("Sergey", 23);
        number1.hello();
        number1.hobbie();
    }
}