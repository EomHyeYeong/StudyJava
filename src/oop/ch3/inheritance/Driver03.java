package oop.ch3.inheritance;

public class Driver03 {
    public static void main(String[] args) {
        Flyable flyer1 = new Bat();
        flyer1.fly();

        Flyable flyer2 = new Sparrow();
        flyer2.fly();

        Swimable[] swimmers = new Swimable[2];
        swimmers[0] = new Whale();
        swimmers[1] = new Penguin();

        for (Swimable swimmer : swimmers) {
            swimmer.swim();
        }
    }
}
