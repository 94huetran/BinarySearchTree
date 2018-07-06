package Tree;

public class BinaryClient {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<String>();
        tree.insert("Linh");
        tree.insert("Nga");
        tree.insert("Hieu");
        tree.insert("Kien");
        System.out.println("Sort: " ); tree.inorder();
        System.out.println("The number of nodes is: "+ tree.getSize());

    }

}
