package oopPractice;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);
        obj1.equals(obj2);
        obj1 = obj2;

        Pants jeans = new Pants("Blue",48);
        Pants jeans1 = new Pants("Yellow",50);
        Pants jeans2 = new Pants("Blue",48);
        System.out.println("jeans1.equals(jeans2) = " + jeans1.equals(jeans2));
        System.out.println("jeans.equals(jeans2) = " + jeans.equals(jeans2));
        System.out.println("jeans2.toString() = " + jeans2.toString());
        Person sergey = new Person("Sergey",17);
        sergey.birthday();
        System.out.println("sergey.takeBeer() = " + sergey.takeBeer());;
    }
}
