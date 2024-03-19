package datastructure.list.arraylist;

import java.util.Arrays;
import datastructure.list.arraylist.IList;


public class MyArrayList<T> implements IList<T> {
    private static final int DEFAULT_SIZE = 50;

    // 삽입된 데이터의 개수
    private int size;

    // 데이터를 저장하는 공간
    private T[] elements;

    public MyArrayList() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(T t) {
        if (this.size == this.elements.length) {    // 배열이 꽉 찼을 경우 새 배열 공간을 할당하여 데이터 이동
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[this.size++] = t;
    }

    @Override
    public void insert(int index, T t) {
        if (this.size == this.elements.length) {    // 배열이 꽉 찼을 경우 새 배열 공간을 할당하여 데이터 이동
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        for (int i = this.size; i > index; i--) {   // 데이터 뒤로 밀기
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = t;
        this.size++;
    }

    @Override
    public void clear() {   // 리스트 전체 삭제 (초기화)
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];

    }

    @Override
    public boolean delete(T t) {
        for (int i = 0; i < this.size; i++) {   // 리스트를 순회하며 삭제할 데이터가 존재하는지 확인
            if (this.elements[i].equals(t)) {   // 존재하면 해당 인덱스 데이터부터 앞으로 밀기
                for (int j = i; j < this.size -1; j++) {
                    this.elements[j] = this.elements[j + 1];
                }
                this.size --;
                return true;
            }
        }
        return false;   // t가 리스트에 존재하지 않는 경우 false 반환
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index < 0 || index > this.size - 1) {   // 잘못된 입력값이 들어온 경우
            return false;
        }

        for (int i = index; i < this.size - 1; i++) {   // 데이터 앞으로 밀기
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > this.size - 1) {   // 잘못된 입력값이 들어온 경우
            throw new IndexOutOfBoundsException();  // 에러 반환
        }

        return this.elements[index];
    }

    @Override
    public int indexOf(T t) {       // t가 리스트에 존재할 때 index 반환
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T t) {  // t가 리스트에 존재하는지 여부
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
