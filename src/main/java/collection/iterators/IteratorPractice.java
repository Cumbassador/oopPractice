package collection.iterators;

import collection.maps.Fruits;
import collection.maps.Man;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man zhdanov = new Man("Жданов");
        Man zhukov = new Man("Жуков");
        Man stepanov = new Man("Степанов");
        men.put(ivanov, "Футболка");
        men.put(sidorov, "Кепка");
        men.put(zhdanov, "Свитшот");
        Map<Man, Fruits> fruitsMap = new HashMap<>();
        Fruits banana = new Fruits("Banana", 200);
        Fruits orange = new Fruits("Orange", 150);
        Fruits apple = new Fruits("Apple", 100);
        Fruits watermelon = new Fruits("Watermelon", 500);
        Fruits kiwi = new Fruits("Kiwi", 80);
        fruitsMap.put(ivanov, banana);
        fruitsMap.put(sidorov, orange);
        fruitsMap.put(zhdanov, apple);
        fruitsMap.put(zhukov, watermelon);
        fruitsMap.put(stepanov, kiwi);

        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

        int count = 0;
        for (Map.Entry<Man, Fruits> pair : fruitsMap.entrySet()) {
            if (pair.getKey().getName().length() > 5) {
                count++;

            }
        }
        System.out.println(count);
        count = 0;
        for (Map.Entry<Man, Fruits> pair : fruitsMap.entrySet()) {
            if (pair.getValue().getTitle().equals("Orange")) {
                count++;
                System.out.println(count);
            }
        }
        for (Map.Entry<Man, Fruits> pair : fruitsMap.entrySet()) {
            if (pair.getValue().getTitle() != "Watermelon") {
                System.out.println(pair.getKey() + ":" + pair.getValue().getTitle());
            }
        }
        System.out.println(" ");

        for (Map.Entry<Man, Fruits> pair : fruitsMap.entrySet()) {
            if (pair.getValue().getTitle().startsWith("A")) {
                continue;
            }
            System.out.println(pair.getKey() + pair.getValue().getTitle());
        }
        System.out.println("");
        for (Map.Entry<Man, Fruits> pair : fruitsMap.entrySet()){
            if(pair.getValue().getTitle().equalsIgnoreCase("watermelon")){
                System.out.println(pair.getKey().getName()+":"+pair.getValue().getTitle());
            }
        }
        System.out.println("");
        Map<Man,Fruits>newMap = new HashMap<>();
        for (Map.Entry<Man,Fruits>pair:fruitsMap.entrySet()){
            if (pair.getValue().getTitle().equalsIgnoreCase("watermelon")||pair.getValue().getTitle().equalsIgnoreCase("apple")){
                newMap.put(pair.getKey(),pair.getValue());
            }
        }
        System.out.println("newMap.toString() = " + newMap.toString());
        System.out.println("");
        int totalWeight = 0;
        int countFruit = 0;


        for(Map.Entry<Man,Fruits>pair:fruitsMap.entrySet()){
            countFruit++;
            totalWeight=+pair.getValue().getWeight();
        }

        System.out.println(totalWeight/countFruit);
    }
}
