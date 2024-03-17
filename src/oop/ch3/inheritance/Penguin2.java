package oop.ch3.inheritance;

import oop.ch3.inheritance.Animal2;

public class Penguin2 extends Animal2 {
    public String habitat;

    public void showHabitat() {
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }
}
