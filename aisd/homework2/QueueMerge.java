package aisd.homework2;

public class QueueMerge {
    public static Queue mergeSortedQueues(Queue q1, Queue q2) {
        Queue resultQueue = new Queue();
        QueueNode node1 = q1.takeFromFront();
        QueueNode node2 = q2.takeFromFront();

        while (node1 != null && node2 != null) {
            if (node1.getValue() < node2.getValue()) {
                resultQueue.addToEnd(new QueueNode(node1.getValue()));
                node1 = q1.takeFromFront();
            } else {
                resultQueue.addToEnd(new QueueNode(node2.getValue()));
                node2 = q2.takeFromFront();
            }
        }
        while (node1 != null) {
            resultQueue.addToEnd(new QueueNode(node1.getValue()));
            node1 = q1.takeFromFront();
        }
        while (node2 != null) {
            resultQueue.addToEnd(new QueueNode(node2.getValue()));
            node2 = q2.takeFromFront();
        }
        return resultQueue;
    }
}
