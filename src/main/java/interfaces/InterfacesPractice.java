package interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();
        Runable oleg = new Man();
        System.out.println("oleg.maxRunDictance() = " + oleg.maxRunDictance());
        Swimable manOleg = new Man();
        oleg.run();
        Swimable fishOlga = new Fish();
        fishOlga.maxSwimSpeed();
        Swimable dogVlad = new Dog();
        dogVlad.swim();
        badGin.canYouCreateWish();
    }
}
