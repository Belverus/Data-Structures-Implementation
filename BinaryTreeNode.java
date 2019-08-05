/**Similar to Node class, BinaryTreeNode will be used with has-a relationship.*/
public class BinaryTreeNode {
    //Instance variables ---------------------------------------------------------------------------
    /*Every node in binary tree has a value, a right child pointer and a left child pointer. */
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    int value;

    //Constructors ---------------------------------------------------------------------------------
    /*BinaryTreeNode has 3 constructors. You can create a null node, a node which has only a value, or
    * a node with its right and left child. */
    public BinaryTreeNode() {
        this.rightChild = null;
        this.leftChild = null;
    }

    public BinaryTreeNode(int value) {
        this.value = value;
        this.rightChild = null;
        this.leftChild = null;
    }

    public BinaryTreeNode(int value, BinaryTreeNode rightChild, BinaryTreeNode leftChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
