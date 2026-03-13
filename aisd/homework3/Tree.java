package aisd.homework3;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    //todo: реализовать в домашке
    // private int height;

    //todo: чтобы быстро создать конструктор или геттеры\сеттеры
    // можно нажать комбинацию клавиш alt + insert (на Mac -- cmd + n)

    public Tree() {
//        this.height = 0;
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
//        this.height = 1;
    }

    public void add(T value) {
        TreeNode<T> node = new TreeNode<>(value);

        if (this.root == null) {
            this.root = node;
//            this.height = 1;
        } else {
            add(this.root, value);
        }
    }

    private void add(TreeNode<T> current, T value) {
        // если текущая нода больше вставляемого значения
        // проверяем, есть ли левый потомок
        // если нет, то добавляем нового потомка
        // если есть, вызываем рекурсивный метод снова
        // если текущая нода меньше вставляемого значения
        // проверяем, есть ли правый потомок и делаем все то же самое
        //
        if (current.getValue().compareTo(value) > 0) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode<>(value));
            } else {
                add(current.getLeft(), value);
            }
        } else if (current.getValue().compareTo(value) <= 0) {
            if (current.getRight() == null) {
                current.setRight(new TreeNode<>(value));
            } else {
                add(current.getRight(), value);
            }
        }
    }
}