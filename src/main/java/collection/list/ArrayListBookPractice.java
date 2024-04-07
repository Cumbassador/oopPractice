package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBookPractice {
    public static void main(String[] args) {
        List<Book> emptyBoolList = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();
        Book redHat = new Book("RedHat","Unknown",50);
        Book evgenyOnegin = new Book("Evgeny_Onegin","Pushkin",300);
        Book warAndPiece = new Book("War_and_piece","Tolstoy",1500);
        Book janeAir = new Book("Jane Air","Sharlotte Bronte",1500);
        Book faust= new Book("Faust","Gete",800);
        Book odyssey = new Book("Odyssey","Gomer",1500);
        Book dune = new Book("Dune","Frank Gerbert",900);
        Book stalker = new Book("Stalker","Strugacki",840);
        Book clockworkOrange = new Book("Clockwork Orange","Antony B.",450);
        Book witcher = new Book("Witcher","Sapkowcki A.",1100);
        Book lordOfTheRing = new Book("Lord of the ring","Tolkien",1000);
        Book callOfCtulhu = new Book("Call of Ctulhu","Lovecraft H.",300);
        Book reborn = new Book("Reborn","King s",1500);
        Book bookOfBlood = new Book("Book of Blood","Barker C.",750);
        Book silenceOfLamb = new Book("Silence of Lamb","Harris T.",600);
        Book murdersRueStreet = new Book("The Murders in the Rue Morgue","Poe A.",200);
        Book forWhomTheBellTolls = new Book("For Whom the Bell Tolls","Hemingway",550);
        Book lolita = new Book("Lolita","Nabokov",450);
        Book trainspotting = new Book("Trainspotting","Welsh",500);
        Book threeComrades = new Book("Three Comrades","Remarque",800);
        bookList.add(redHat);
        bookList.add(evgenyOnegin);
        bookList.add(warAndPiece);
        bookList.add(janeAir);
        bookList.add(faust);
        bookList.add(odyssey);
        bookList.add(dune);
        bookList.add(stalker);
        bookList.add(clockworkOrange);
        bookList.add(witcher);
        bookList.add(lordOfTheRing);
        bookList.add(callOfCtulhu);
        bookList.add(reborn);
        bookList.add(bookOfBlood);
        bookList.add(silenceOfLamb);
        bookList.add(murdersRueStreet);
        bookList.add(forWhomTheBellTolls);
        bookList.add(lolita);
        bookList.add(trainspotting);
        bookList.add(threeComrades);
        System.out.println("bookList.toString() = " + bookList.toString());
        bookList.add(3,dune);
        System.out.println("bookList.get(3) = " + bookList.get(3));
        System.out.println("bookList.get(1) = " + bookList.get(1));
        bookList.add(1,dune);
        System.out.println("bookList.get(1) = " + bookList.get(1));
        emptyBoolList.addAll(bookList);
        System.out.println("emptyBoolList.toString() = " + emptyBoolList.toString());
        //2.
        emptyBoolList.get(1);
        System.out.println("emptyBoolList.get(1) = " + emptyBoolList.get(1));
        System.out.println("emptyBoolList.size() = " + emptyBoolList.size());

        System.out.println("emptyBoolList.get(21) = " + emptyBoolList.get(21));
        //3.
        emptyBoolList.remove(lolita);
        emptyBoolList.remove(10);
        System.out.println("emptyBoolList.size() = " + emptyBoolList.size());
        //4.
        System.out.println("emptyBoolList.contains(trainspotting) = " + emptyBoolList.contains(trainspotting));
        System.out.println("emptyBoolList.contains(lolita) = " + emptyBoolList.contains(lolita));
        //5.
        System.out.println("emptyBoolList.toString() = " + emptyBoolList.toString());


    }
}
