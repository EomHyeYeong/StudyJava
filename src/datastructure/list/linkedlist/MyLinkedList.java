package datastructure.list.linkedlist;

import datastructure.list.arraylist.IList;

public class MyLinkedList<T> implements IList<T> {

    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new Node(null); // dummy head node
    }

    @Override
    public void add(T t) {
        Node curr = this.head;
        while (curr.next != null) { // linked list의 끝까지 node 순회
            curr = curr.next;
        }
        Node node = new Node(t);    // 삽입할 node를 생성한 후 맨 끝에 삽입
        curr.next = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        if (index > this.size || index < 0) { // 올바르지 않은 index 값 입력
            throw new IndexOutOfBoundsException();
        }

        Node prev = this.head;  // 이전 node
        Node curr = prev.next;  // 현재 node

        int i = 0;
        while (i++ < index) {   // index에 도달할 때까지 node 순회
            prev = prev.next;
            curr = curr.next;
        }
        Node node = new Node(t, curr);
        prev.next = node;
        this.size++;
    }

    @Override
    public void clear() {   // linked list 초기화
        this.size = 0;
        this.head.next = null;
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head;
        Node curr = prev.next;
        while (curr != null) {          // linked list의 끝까지 node 순회
            if (curr.data.equals(t)) {  // t와 일치하는 node를 찾으면 지우는 연산 수행
                prev.next = curr.next;
                curr.next = null;
                this.size--;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index >= this.size || index < 0) { // 올바르지 않은 index 값 입력
            throw new IndexOutOfBoundsException();
        }

        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while (i++ < index) {   // index까지 node 순회
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;
        size--;
        return true;
    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0) { // 올바르지 않은 index 값 입력
            throw new IndexOutOfBoundsException();
        }

        Node curr = this.head.next;
        int i = 0;
        while (i++ < index) {
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        Node curr = this.head.next;
        int index = 0;
        while (curr != null) {
            if (t.equals(curr.data)) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public boolean contains(T t) {
        Node curr = this.head.next;
        while (curr != null) {
            if (t.equals(curr.data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
