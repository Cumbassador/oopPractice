package collection.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man sergey = new Man("Sergey");
        Man danil = new Man("Danil");
        Set <Man> manSet = new HashSet<>(Arrays.asList(andrey,sergey,danil));
        System.out.println("manSet = " + manSet);
        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));


        Fruits banana = new Fruits("Banana",200);
        Fruits orange = new Fruits("Orange",150);
        Fruits apple = new Fruits("Apple",100);
        Set<Fruits> fruitSet = new HashSet<>(Arrays.asList(banana,orange,apple));
        Fruits pineapple = new Fruits("Pineapple",500);
        fruitSet.add(pineapple);
        System.out.println("fruitSet.add(pineapple) = " + fruitSet.add(pineapple));
        System.out.println("fruitSet = " + fruitSet);
        fruitSet.remove(apple);
        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple));


    }
}
