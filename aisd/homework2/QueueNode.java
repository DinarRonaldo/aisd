package aisd.homework2;

public class QueueNode {
    private QueueNode next;
    private final int value;

    public QueueNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return this.value;
    }

    public QueueNode getNext() {
        return this.next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}