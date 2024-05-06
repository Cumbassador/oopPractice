package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<Man,String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man zhdanov = new Man("Жданов");
        men.put(ivanov,"Футболка");
        men.put(sidorov,"Кепка");
        men.put(zhdanov,"Свитшот");
        for (Map.Entry<Man,String> pair:men.entrySet()) {
            System.out.println(  pair.getKey() + ":" + pair.getValue());

        }
        Map<Man,Fruits> fruitsMap = new HashMap<>();
        Fruits banana = new Fruits("Banana",200);
        Fruits orange = new Fruits("Orange",150);
        Fruits apple = new Fruits("Apple",100);
        Fruits pineapple = new Fruits("Pineapple",500);
        Fruits kiwi = new Fruits("Kiwi",80);
        fruitsMap.put(ivanov,banana);
        fruitsMap.put(sidorov,orange);
        fruitsMap.put(zhdanov,apple);
        System.out.println("fruitsMap.get(sidorov) = " + fruitsMap.get(sidorov));
        fruitsMap.remove(zhdanov);
        System.out.println("fruitsMap.size() = " + fruitsMap.size());
        System.out.println("fruitsMap.containsValue(apple) = " + fruitsMap.containsValue(orange));
        for(Map.Entry<Man,Fruits> pair :fruitsMap.entrySet()){
            System.out.println("pair.getKey()+\":\" + pair.getValue() = " + pair.getKey() + ":" + pair.getValue());
        }
        for(Man keyMan : fruitsMap.keySet()){
            System.out.println(  keyMan );
        }
        for(Man valueFruits: fruitsMap.keySet()){
            System.out.println(fruitsMap.get(valueFruits));

        }



    }
}
