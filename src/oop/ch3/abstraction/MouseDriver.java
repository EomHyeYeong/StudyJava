package oop.ch3;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();

        // 객체명.countOfTail
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);

        // 클래스명.countOfTail
        System.out.println(Mouse.countOfTail);
    }
}
