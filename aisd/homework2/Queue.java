package aisd.homework2;

public class Queue {
    private QueueNode firstNode;
    private QueueNode lastNode;
    private int totalCount;

    public Queue() {
        this.firstNode = null;
        this.lastNode = null;
        this.totalCount = 0;
    }

    public void addToEnd(QueueNode newNode) {
        if (this.lastNode == null) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            this.lastNode.setNext(newNode);
            this.lastNode = newNode;
        }
        this.totalCount++;
    }

    public QueueNode takeFromFront() {
        if (this.firstNode == null) {
            return null;
        }
        QueueNode takenNode = this.firstNode;
        this.firstNode = this.firstNode.getNext();
        if (this.firstNode == null) {
            this.lastNode = null;
        }
        this.totalCount--;
        takenNode.setNext(null);
        return takenNode;
    }

    public QueueNode lookAtFirst() {
        return this.firstNode;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean isEmpty() {
        return this.totalCount == 0;
    }
}