package Tree;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode root;
    protected int size;

    public BinarySearchTree() {
    }
    public BinarySearchTree(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean search(E e) {
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current=current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else return false;
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public boolean delete(E e) {
        return false;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }


    @Override
    public void preorder() {

    }

    @Override
    public void postorder() {

    }

    public void inorder(TreeNode<E> root) {
        if (root == null)
            return;
            inorder(root.left);
        System.out.println(root.element + "");
    }

        @Override
        public int getSize () {
            return size;
        }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

}
