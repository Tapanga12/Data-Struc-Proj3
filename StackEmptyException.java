// Tapanga Witt
// Project 3
// CIS 2353
// Summer 2025
// Prof. John P. Baugh

package proj3;

public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        super("Stack is empty");
    }
    
    public StackEmptyException(String message) {
        super(message);
    }
}
