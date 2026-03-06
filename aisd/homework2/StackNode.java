package aisd.homework2;

public class StackNode {
    private StackNode previous;
    private final int value;

    public StackNode(int value) {
        this.value = value;
    }

    public StackNode(int value, StackNode previous) {  // (4)
        this.value = value;
        this.previous = previous;
    }

    public StackNode getPrevious() {
        return previous;
    }

    public void setPrevious(StackNode x) {
        this.previous = x;
    }

    public int getValue() {
        return value;
    }
}