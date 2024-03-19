package datastructure.list.doublelinkedlist;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> doubleLinkedList = new MyDoubleLinkedList<Integer>();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);

        for (int i = 0; i < doubleLinkedList.size(); i++) {
            System.out.print(doubleLinkedList.get(i) + " ");
        }
        System.out.println();

        doubleLinkedList.insert(2, 100);
        for (int i = 0; i < doubleLinkedList.size(); i++) {
            System.out.print(doubleLinkedList.get(i) + " ");
        }
        System.out.println();

        System.out.println(doubleLinkedList.contains(100));
        System.out.println(doubleLinkedList.indexOf(3));
    }
}
