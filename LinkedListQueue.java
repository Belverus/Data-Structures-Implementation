import java.util.EmptyStackException;

/**LinkedListQueue extends the LinkedList class.
 * I will store the data in the form of node and use these nodes with queue rules (FIFO).*/
public class LinkedListQueue<V> extends LinkedList {

    //Instance variables ------------------------------------------------------------------------------------------
    /* Queue class inherits node type head element from LinkedList class and I will use it as "next" in queue
      structure.
     * In order to reach to the first element (queue acts FIFO) I will keep prev and next. */
    protected Node<V> tail;

    //Constructors ------------------------------------------------------------------------------------------------
    /*I will use  the constructor of LinkedList class and head will point null at default. */
    public LinkedListQueue() {
        this.tail = null;
    }

    //Accessors and Mutators --------------------------------------------------------------------------------------
    /* "enqueue" method adds an element to queue. */
    public void enqueue(Object value) {
        Node newNode = new Node(value);
          if(head == null) {
              head = newNode;
          } else {
              tail.next = newNode;
          }
          tail = newNode;

    }

    /* "dequeue" method removes an element based on FIFO structure. */
    public V dequeue() {
        if(head==null) {
            throw new EmptyStackException();
        }
        V storeVal = (V) head.value;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        System.out.println("Value: " + storeVal + " is removed.");
        return storeVal;
    }

    @Override
    public void print() {
        super.print();
    }
}
