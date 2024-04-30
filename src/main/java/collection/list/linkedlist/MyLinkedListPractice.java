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


    }
}
