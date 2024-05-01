package collection.list.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("Строчка1");
        list.add("Строчка2");
        list.add("Строчка3");
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(\"Строчка1\") = " + list.contains("Строчка1"));
        list.remove(2);
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);
        list.add("Строчка1");
        list.add("Строчка2");
        list.add("Строчка3");
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);
        list.add("Строчка1");
        list.add("Строчка2");
        list.add("Строчка3");
        System.out.println("list.contains(0) = " + list.contains("Строчка1"));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.set(1,\"Hello\") = " + list.set(1, "Hello"));
        System.out.println("list = " + list);


    }
}
