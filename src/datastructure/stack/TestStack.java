package datastructure.stack;

public class TestStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);

        System.out.println("peek: " + myStack.peek());
        System.out.println("pop: " + myStack.pop());
        System.out.println("pop: " + myStack.pop());
        System.out.println("pop: " + myStack.pop());
        System.out.println("pop: " + myStack.pop());
    }
}
