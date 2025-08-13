// Tapanga Witt
// Project 3
// CIS 2353
// Summer 2025
// Prof. John P. Baugh

package proj3;

public class ChangeStackTest {
    public static void main(String[] args) {
        System.out.println("Testing ChangeStack\n");

        ChangeStack stack = new ChangeStack();

        // Push test
        System.out.println("Pushing: 10, 20, 30, 40, 50");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        System.out.println("Size: " + stack.getSize() + "\n");

        // Peektop test
        System.out.println("Peek top: " + stack.peekTop());
        stack.printStack();
        System.out.println();

        // Pop test
        System.out.println("Pop: " + stack.pop());
        stack.printStack();
        System.out.println("Size: " + stack.getSize() + "\n");

        // Increase values test
        System.out.println("Increase bottom 2 by 5:");
        stack.printStack();
        stack.increaseValues(2, 5);
        stack.printStack();
        System.out.println();

        // Decrease values test
        System.out.println("Decrease bottom 3 by 2:");
        stack.printStack();
        stack.decreaseValues(3, 2);
        stack.printStack();
        System.out.println();

        // k > stack size test
        System.out.println("Increase bottom 10 by 1 (only " + stack.getSize() + " elements):");
        stack.increaseValues(10, 1);
        stack.printStack();
        System.out.println();

        // Emptying the stack
        System.out.println("Emptying stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        stack.printStack();
        System.out.println();

        // Operations on empty stack
        System.out.println("Trying pop on empty stack:");
        try {
            stack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Stack: " + e.getMessage());
        }

        System.out.println("Trying peek on empty stack:");
        try {
            stack.peekTop();
        } catch (StackEmptyException e) {
            System.out.println("Stack: " + e.getMessage());
        }

        System.out.println("\nDone testing!");
    }
}
