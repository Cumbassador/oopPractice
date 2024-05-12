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

        System.out.println("list = " + list);
        list.add("Строчка1");
        list.add("Строчка2");
        list.add("Строчка3");
        System.out.println("list = " + list);
        System.out.println("list = " + list);
        list.add("Строчка1");
        list.add("Строчка2");
        list.add("Строчка3");
        System.out.println("list.contains(0) = " + list.contains("Строчка1"));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.set(1,\"Hello\") = " + list.set(1, "Строчка1"));
        System.out.println("list.set(2,\"Строчка1\") = " + list.set(2, "Строчка1"));
        System.out.println("list = " + list);
        System.out.println("list.indexOf(\"Строчка1\") = " + list.indexOf("Строчка1"));
        System.out.println("list.indexOf(\"Строчка2\") = " + list.indexOf("Строчка4"));
        System.out.println("list = " + list);
        System.out.println("list.lastIndexOf(\"Строчка1\") = " + list.lastIndexOf("Строчка"));
        System.out.println("list = " + list);
        list.add("Строчка3");
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());


    }
}
