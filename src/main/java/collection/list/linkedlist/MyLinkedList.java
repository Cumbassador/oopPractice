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
        if (head == null) { //проверка на то если первый элемент не равен 0
            return false;
        }
        if (head.getValue().equals(o)){ //проверка если значение перывого эдемента равна обьекта равна,перекидываем указатель на следующий элемент
            head=head.getNext();
            return true;
        }
        if(head.getNext()==null)return false; // проверка если в списке нет больше элементов
        Node curNode = head;
        Node prevNode = head;
        while ((curNode=curNode.getNext())!=null){ //перемещаем curNode,пробегаемсЯ по всему списку в поиске совпадений,при нахождении выходим из цикла
            if (curNode.getValue().equals(o)){
                break;
            }
            prevNode=prevNode.getNext();   //перемещаем переменную дальше метом getNext()
        }
        if (curNode==null)return false; // если пробежались и не нашли нужного элемента
        prevNode.setNext(curNode.getNext());//ссылку с предыдущего обьекта перекидываем через обьект который нужно удалить
        curNode.setNext(null);// ссылку обьекта которого нужно удалить, мы делаем равным нулю

        return true;

    }

    public void clear() {

        Node newNode = head;
        while (newNode.getNext()!=null){
            newNode.setNext(null);
        }




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
        if (index == 0) {  //условие если индекс равен 0 то создаем ссылку на узел head, передаем значение null
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
        int count=0;

        if(head.getValue().equals(o)){
            return count;

        }
        Node curNode = head;
        while (curNode!=null){

            if(curNode.getValue().equals(o)){
                return count;
            }
            count++;
            curNode=curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int count = 0;
        int secondCount=-1;
        Node curNode = head;
        while (curNode!=null){
            if(curNode.getValue().equals(o)){
                secondCount=count;
            }
            count++;
            curNode=curNode.getNext();

        }

        return secondCount;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}



