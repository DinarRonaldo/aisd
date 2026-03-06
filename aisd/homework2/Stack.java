package aisd.homework2;

public class Stack {
    private StackNode topNode;
    private int totalItems;

    public Stack() {
        this.totalItems = 0;
        this.topNode = null;
    }

    public void insert(StackNode newNode) {
        newNode.setPrevious(this.topNode);
        this.topNode = newNode;
        this.totalItems++;
    }

    public StackNode extract() {
        if (this.topNode == null) {
            return null;
        }
        StackNode extractedNode = this.topNode;
        this.topNode = this.topNode.getPrevious();
        this.totalItems--;
        return extractedNode;
    }

    public int getTotalItems() {
        return this.totalItems;
    }
}

