package collection.list.linkedlist;

import java.util.List;

public class MyLinkedList {

    private Node head;

    public int size() {
        int size = 0;
        // set the head as current note
        Node current = head;
        // while a current node is set
        while (current != null) {
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

        return head == null;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode.getNext()!=null){
            if(curNode.getValue().equals(o)){
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
            return true;
        }
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        curNode.setNext(resNode);
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            return head.getValue();
        }
        int count = 0;
        Node curNode = head;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
        }

        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        int count=0;
        Node newNode = head;
        while (count<index){
            newNode = newNode.getNext();
            count++;

        }
        newNode.setValue(element);
        return newNode.getValue();
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        checkIndex(index);//проверка есть ли в списке такой индекс
        if (index == 0) {  //условие если индекс равен 0 то создаем узел,передаем туда значение head и передаем значение null
            Object resValue = head.getValue();
            if (head.getNext() == null) {// если ссылка равна null то head равен null
                head = null;
            } else {
                head = head.getNext(); //иначе передаем значени. head значение след элемента, то есть первый элемент удаляется
            }
            return resValue;
        }
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {//бежим до нужного нам элемента
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext(); //предыдузие значение
        }
        if (curNode.getNext() == null) {//если нужно удалить последний эдемент
            Object resValue = curNode.getValue();
            prevNode.setNext(null);
            return resValue;
        }
        prevNode.setNext(curNode.getNext());//перенаправил значение ссылки
        curNode.setNext(null);//значение второго элемента делаю равным null
        Object resValue = curNode.getValue();
        return resValue;

    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
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



