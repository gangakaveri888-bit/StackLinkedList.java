public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node top = null;
    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed into stack");
    }
    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }
    static void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }
    static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        peek();
        pop();
        display();
    }
}
OUTPUT:
10 pushed into stack
20 pushed into stack
30 pushed into stack
Stack elements:
30
20
10
Top element: 30
30 popped from stack
Stack elements:
20
10
