package oop.ch3.inheritance;

public class Penguin extends Bird implements Swimable{
    Penguin() {
        myClass = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println(myClass + "수영 중. 푸악!!! 푸악!!!");
    }
}
