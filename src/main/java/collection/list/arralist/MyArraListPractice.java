package collection.list.arralist;

public class MyArraListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
//        list.add("Привет");
//        list.add("Пока");
//
//        System.out.println("После добавления " + list.size());
//        list.add("Пока");
//        list.add("Hello");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.toString() = " + list.toString());
//        list.isEmpty();
//        list.contains("Hell");
//
//        System.out.println("list.toString() = " + list.toString());
//        list.remove("Привет");
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list = " + list);
//        System.out.println("list.get(3) = " + list.get(2));
//        System.out.println("list = " + list);
//        list.add("Как_дела");
//        list.add("В_чем_дело");
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list.get(10) = " + list.get(10));
//        System.out.println("list = " + list);
//        list.set(9,"Здрасьте.");
//        System.out.println("list = " + list);
//        System.out.println("list = " + list);
//        list.indexOf("В чем дело");
//
//
//        System.out.println("list.size() = " + list.size());
//        list.lastIndexOf("Пока");
//        list.add(5,"Хаюшки");
//        System.out.println("list = " + list);
//        System.out.println("list.size() = " + list.size());
//        list.add("Привки");
//        list.add("Привки1");
//        System.out.println("list.size() = " + list.size());

        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");
        list.add("Шестой");
        list.add("Седьмой");
        list.add("Восьмой");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        list.add("Девятый");
        list.add("Десятый");
        System.out.println("list = " + list);
        list.add("Одинадцатый");
        System.out.println("list = " + list);
        list.add(6,"Прикольный");
        System.out.println("list = " + list);
        list.lastIndexOf("Десятый");


    }
}
