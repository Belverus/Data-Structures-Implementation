public class BinaryTreeSearch {
    //Instance variable
    BinaryTreeNode root;

    //Constructors  -----------------------------------------------------------------------------------------
    public BinaryTreeSearch() {
        this.root = null;
    }

    //Accessors and Mutators    -----------------------------------------------------------------------------
    /* "search" method searches the binary tree and returns the result if it is in your tree. */
    public void search(int key) {
        BinaryTreeNode tmp = root;
        while(tmp != null) {
            if(tmp.value == key) {
                System.out.println("value " + key +  " is in your tree");
                return;
            }
            if(key < tmp.value) {
                tmp = tmp.leftChild;
            } else {
                tmp = tmp.rightChild;
            }
        }
        System.out.println("value " + key + " is not in your tree");
    }

    /* "Insert" method adds an element to the binary tree.
    * Method recursively checks the element to be added to find the right node. */
    public void insert(int element) {
        root = callInsert(root, element);
    }
    /* recursive call operation */
    BinaryTreeNode callInsert(BinaryTreeNode root, int element) {
        if (root == null) {
            root = new BinaryTreeNode(element);
            return root;
        }
        if (element < root.value)
            root.leftChild = callInsert(root.leftChild, element);
        else if (element > root.value)
            root.rightChild = callInsert(root.rightChild, element);
        return root;
    }

    /* "delete" method searches and removes the target element from your binary search tree. */
    public void delete(int element) {
        root = callDelete(root, element);
    }
    /*recursive call to delete function.*/
    BinaryTreeNode callDelete(BinaryTreeNode root, int element) {
        if(root == null) {
            return root;        /*means tree is empty.*/
        }
        if(element < root.value) {
            root.leftChild = callDelete(root.leftChild, element);
        }
        else if (element > root.value) {
            root.rightChild = callDelete(root.rightChild, element);
        }
        else {
            if(root.leftChild == null) {
                return root.rightChild;
            }
            else if (root.rightChild == null) {
                return root.leftChild;
            }
            root.value = smallestVal(root.rightChild);
            root.rightChild = callDelete(root.rightChild, root.value);
        }
        return root;
    }
    /*call to smallestVal method to find the smallest element in the right subtree*/
    public int smallestVal(BinaryTreeNode root) {
        int minVal = root.value;
        while(root.leftChild != null) {
            minVal = root.leftChild.value;
            root = root.leftChild;
        }
        return minVal;
    }

    /*BinarySearchTree inorder traversal method.
    * This method recursively calls itself, starting from the root. */
    void inorderPrint()  {
        callInorder(root);
    }
    /* recursive call operation */
    void callInorder(BinaryTreeNode root) {
        if (root != null) {
            callInorder(root.leftChild);
            System.out.println(root.value);
            callInorder(root.rightChild);
        }
    }


}
