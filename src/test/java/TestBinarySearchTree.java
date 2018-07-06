import Tree.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearchTree {
    BinarySearchTree<String> tree = new BinarySearchTree<String>();

    @Test
    public void TestInsert() {
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Mark");
        tree.insert("Jones");
        tree.insert("Harry");
        int sort = tree.getSize();
        tree.inorder();
        Assert.assertEquals(5, sort);
    }
}
