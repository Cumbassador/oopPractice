package collection.list.arralist;

public class MyArraListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Привет");
        list.add("Пока");

        System.out.println("После добавления " + list.size());
        list.add("Пока");
        list.add("Hello");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");

        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list.toString());
        list.isEmpty();
        list.contains("Hell");
        list.clear();
        System.out.println("list.toString() = " + list.toString());
        list.isEmpty();


    }
}
