package oop.ch3.inheritance;

import oop.ch3.inheritance.Bird;
import oop.ch3.inheritance.Flyable;

public class Sparrow extends Bird implements Flyable {
    Sparrow() {
        myClass = "참새";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "날고 있삼... 허우적!!! 허우적!!!");
    }
}
