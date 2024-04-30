package collection.list.linkedlist;

import java.util.List;

public class MyLinkedList  {

    private Node head;
    public int size() {
            int size = 0;
            // set the head as current note
            Node current = head;
            // while a current node is set
            while(current != null)
            {
                // increment site
                size++;
                // and set the next as current node
                current = current.getNext();
            }
            return size;
//        int count = 0;
////        while(head.getNext()!=null){
////            count++;
////        }
////
////        return count;
    }

    public boolean isEmpty() {

        return head==null;
    }

    public boolean contains(Object o) {
//        Node newNode = new Node(o,null);
        if (o== head.getValue()){
            return true;

        }
        else return false;
//        while (newNode != null)
//        {
//            if (newNode.equals(o))
//            {
//                return true;
//            }
//            newNode = head.getNext();
//        }
//        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o,null);
        if(head == null) {
            head = resNode;
            return true;
        }
        Node curNode = head;
        while (curNode.getNext()!=null){
            curNode = curNode.getNext();
        }

        curNode.setNext(resNode);
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}



