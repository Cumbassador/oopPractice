package collection.iterators;

import collection.maps.Fruits;
import collection.maps.Man;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<Man,String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man zhdanov = new Man("Жданов");
        men.put(ivanov,"Футболка");
        men.put(sidorov,"Кепка");
        men.put(zhdanov,"Свитшот");
        Map<Man, Fruits> fruitsMap = new HashMap<>();
        Fruits banana = new Fruits("Banana", 200);
        Fruits orange = new Fruits("Orange", 150);
        Fruits apple = new Fruits("Apple", 100);
        Fruits pineapple = new Fruits("Pineapple", 500);
        Fruits kiwi = new Fruits("Kiwi", 80);
        fruitsMap.put(ivanov, banana);
        fruitsMap.put(sidorov, orange);
        fruitsMap.put(zhdanov, apple);

        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey()+":"+pair.getValue());
        }
        for(Map.Entry<Man,Fruits>pair: fruitsMap.entrySet()){
            int count = 0;
            if (pair.getValue().getTitle().equals("Orange")){
                count++;
                System.out.println("count="+count+":"+pair.getKey());
            }
        }

        for(Map.Entry<Man,Fruits>pair: fruitsMap.entrySet()){
            int count = 0;
            ArrayList<String> newArray = new ArrayList<>();
            if (pair.getKey().getName().length()>5){
                System.out.println("pair.getKey().toString() = " + pair.getKey().toString());
                count++;
                newArray.add(pair.getKey().getName());
            }
            System.out.println(count+ newArray.toString());

        }










    }
}
