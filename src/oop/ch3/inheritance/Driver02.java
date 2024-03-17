package oop.ch3.inheritance;

public class Driver02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];
        animals[0] = new Animal();
        animals[1] = new Mammalia();
        animals[2] = new Bird();
        animals[3] = new Whale();
        animals[4] = new Bat();
        animals[5] = new Sparrow();
        animals[6] = new Penguin();

        for (int index = 0; index < animals.length; index++) {
            animals[index].showMe();
        }
    }
}
