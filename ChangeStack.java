// Tapanga Witt
// Project 3
// CIS 2353
// Summer 2025
// Prof. John P. Baugh

package proj3;

public class ChangeStack {
    private int numElements;
    private Node top;

    // Node
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ChangeStack() {
        numElements = 0;
        top = null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        numElements++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Cannot pop from an empty stack");
        }
        int value = top.data;
        top = top.next;
        numElements--;
        return value;
    }

    public int peekTop() {
        if (isEmpty()) {
            throw new StackEmptyException("Cannot peek at an empty stack");
        }
        return top.data;
    }

    public void increaseValues(int k, int amount) {
        if (isEmpty()) return;

        ChangeStack stacc = new ChangeStack();

        while (!isEmpty()) {
            stacc.push(pop());
        }

        int count = 0;
        while (!stacc.isEmpty()) {
            int value = stacc.pop();
            if (count < k) {
                value += amount;
            }
            push(value);
            count++;
        }
    }

    public void decreaseValues(int k, int amount) {
        if (isEmpty()) return;

        ChangeStack stacc = new ChangeStack();

        while (!isEmpty()) {
            stacc.push(pop());
        }

        int count = 0;
        while (!stacc.isEmpty()) {
            int value = stacc.pop();
            if (count < k) {
                value -= amount;
            }
            push(value);
            count++;
        }
    }

    public int getSize() {
        return numElements;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
