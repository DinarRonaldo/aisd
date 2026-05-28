package aisd.homework6;

public class ex4 {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(25);
        walkTree(tree.getRoot());
    }
    public static int walkTree(TreeNode<Integer> node) {
        if (node.getLeft() != null && node.getRight() != null) {
            int sum = walkTree(node.getLeft()) + walkTree(node.getRight()) + node.getValue();
            System.out.println(sum);
            return sum;
        }
        if (node.getLeft() != null) {
            int sum = walkTree(node.getLeft()) + node.getValue();
            System.out.println(sum);
            return sum;
        }
        if (node.getRight() != null) {
            int sum = walkTree(node.getRight()) + node.getValue();
            System.out.println(sum);
            return sum;
        }
        int sum = node.getValue();
        System.out.println(sum);
        return sum;
    }
}