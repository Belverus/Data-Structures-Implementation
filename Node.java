/**
 * Using "Node Class" with composition purposes (has -a).
 */
public class Node<V> {

    //Instance variables  -----------------------------------------------------------------------------------
    /* A node has a value and a Node type next which will be used to point another element*/
    protected V value;
    protected Node<V> next;

    //Constructors      -------------------------------------------------------------------------------------
    /* Node class has 3 constructors. A default constructor and 2 overloaded constructors.
     * Default constructor creates a node which points to null
     * Overloaded constructors gets a value and a next (pointer direction)*/
    public Node() {
        this.next = null;
    }

    public Node(V value) {
        this.value = value;
        this.next = null;
    }

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }

/*Node Class ends here*/
}
