package datastructure.list.arraylist;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.insert(5, 100);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println(arrayList.indexOf(5));
        System.out.println(arrayList.contains(200));
    }
}
