package oop.ch3.inheritance;

public class Driver04 {
    public static void main(String[] args) {
        Penguin2 pororo = new Penguin2();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showHabitat();

        Animal2 pingu = new Penguin2();

        pingu.name = "핑구";
        // pingu.habitat = "EBS";

        pingu.showName();
        // pingu.showHabitat();

        // Penguin2 happyfeet = new Animal();
    }
}
