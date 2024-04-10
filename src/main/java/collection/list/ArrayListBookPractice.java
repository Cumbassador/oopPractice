package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBookPractice {
    public static void main(String[] args) {
        List<Book> emptyBoolList = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();
        Book redHat = new Book("RedHat", "Unknown", 50);
        Book evgenyOnegin = new Book("Evgeny_Onegin", "Pushkin", 300);
        Book warAndPiece = new Book("War_and_piece", "Tolstoy", 1500);
        Book janeAir = new Book("Jane Air", "Sharlotte Bronte", 1500);
        Book faust = new Book("Faust", "Gete", 800);
        Book odyssey = new Book("Odyssey", "Gomer", 1500);
        Book dune = new Book("Dune", "Frank Gerbert", 900);
        Book stalker = new Book("Stalker", "Strugacki", 840);
        Book clockworkOrange = new Book("Clockwork Orange", "Antony B.", 450);
        Book witcher = new Book("Witcher", "Sapkowcki A.", 1100);
        Book lordOfTheRing = new Book("Lord of the ring", "Tolkien", 1000);
        Book callOfCtulhu = new Book("Call of Ctulhu", "Lovecraft H.", 300);
        Book reborn = new Book("Reborn", "King s", 1500);
        Book bookOfBlood = new Book("Book of Blood", "Barker C.", 750);
        Book silenceOfLamb = new Book("Silence of Lamb", "Harris T.", 600);
        Book murdersRueStreet = new Book("The Murders in the Rue Morgue", "Poe A.", 200);
        Book forWhomTheBellTolls = new Book("For Whom the Bell Tolls", "Hemingway", 550);
        Book lolita = new Book("Lolita", "Nabokov", 450);
        Book trainspotting = new Book("Trainspotting", "Welsh", 500);
        Book threeComrades = new Book("Three Comrades", "Remarque", 800);
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
        bookList.add(3, dune);
        System.out.println("bookList.get(3) = " + bookList.get(3));
        System.out.println("bookList.get(1) = " + bookList.get(1));
        bookList.add(1, dune);
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
        //6.
        Book java1 = new Book("Java", "Jones", 211);
        Book java2 = new Book("Java", "Bridges", 360);
        Book java3 = new Book("Java", "Arthur", 480);
        Book java4 = new Book("Java", "Sam", 730);
        emptyBoolList.add(java1);
        emptyBoolList.add(java2);
        emptyBoolList.add(java3);
        emptyBoolList.add(java4);
        System.out.println("Вывести книги индекс которых делиться на 3");
        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (i % 3 == 0) {
                System.out.println("emptyBoolList.get(i) = " + emptyBoolList.get(i));
            }
        }
        System.out.println("Название равно Java");
        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (emptyBoolList.get(i).getTitle().equals("Java")) {
                System.out.println("emptyBoolList.get(i) = " + emptyBoolList.get(i));
            }

        }
        //7.
        System.out.printf("Пропустить первые 3 книги");
        System.out.printf(" ");
        int countDown = 0;
        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (i > 3) {
                System.out.println(" emptyBoolList.get(i) = " + emptyBoolList.get(i));
            } else countDown++;
        }
        //6+7.
        System.out.printf(" Пропустить первые 2 книги, которые равные Java");
        System.out.printf(" ");
        int countDown1 = 0;
        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (countDown1 < 2 && emptyBoolList.get(i).getTitle().equals("Java")) {

                countDown1++;
            } else System.out.println(" emptyBoolList.get(i) = " + emptyBoolList.get(i));

        }
        //8.
        System.out.println("Вернуть первый подходящий элемент:\nВозвращаем первую книгу, длина автора которого делится на 3.");

        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (emptyBoolList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(emptyBoolList.get(i));
                break;
            }

        }
        //9.
        System.out.println("Возвращаем все элементы удовлетворяющие условию:\nВозвращаем все книги, длина автора которых делится на 3.");

        for (int i = 0; i < emptyBoolList.size(); i++) {
            if (emptyBoolList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(emptyBoolList.get(i));
            }
        }
        //10.
        System.out.println("10. Создать класс Person.( Поля: имя, возраст и пол isMale )\n" +
                "\n" +
                "Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");
        Person jack = new Person("Джэк", 23, "Male");
        Person maria = new Person("Мария", 20, "Female");
        Person barbara = new Person("Барбара", 21, "Female");
        Person anastasia = new Person("Анастасия", 19, "Female");
        Person nick = new Person("Ник", 21, "Male");
        Person mike = new Person("Майк", 26, "Male");
        Person jora = new Person("Жора", 27, "Male");
        Person lida = new Person("Лида", 31, "Female");
        Person dainl = new Person("Данил", 20, "Male");
        Person oksana = new Person("Оксана", 28, "Female");
        Person nina = new Person("Нина", 29, "Female");
        Person vasya = new Person("Вася", 24, "Male");
        Person sergey = new Person("Сергей", 28, "Male");
        Person angelina = new Person("Ангелина", 29, "Female");
        List<Person> personList = new ArrayList<>(Arrays.asList(jack, maria, barbara, anastasia, nick, mike, jora, lida, dainl, oksana, nina, vasya, sergey, angelina));
        for (int i = 0; i < personList.size(); i++) {
            if ((personList.get(i).getAge() > 18) && (personList.get(i).getAge() < 27) && (personList.get(i).getIsMale().equals("Male") && personList.get(i).getName().charAt(0) == 'Н')) {
                System.out.println(personList.get(i));


            }

        }
        //10.
        int allAge = 0;
        int countFemale = 0;
        System.out.println(" Найти средний возраст всех женщин.");
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getIsMale().equals("Female")) {
                countFemale++;
                allAge += personList.get(i).getAge();

            }
        }
        int average = allAge / countFemale;
        System.out.println("Средний возраст женищин: " + " " + average);

    }

}