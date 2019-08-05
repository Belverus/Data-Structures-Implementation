import java.util.NoSuchElementException;

/**
 * LinkedList class extends List class and uses its template methods.
 * Uses Node class with has-a relationship.
 */
public class LinkedList<V> extends List {


    //Instance variables    -----------------------------------------------------------------------------------
    /*LinkedList class has only one variable, which is a node type head.
     * Head is an empty element which always point the first element in the linked list. */
    protected Node<V> head;


    //Constructors          -----------------------------------------------------------------------------------
    /*LinkedList class has only a default constructor which points head to null
     * In a default condition, our linked list has no elements and head should point to null.*/
    public LinkedList() {
        this.head = null;
    }

    //Accessors and mutators      -----------------------------------------------------------------------------
    /* "add" method creates a new node and adds to the head element of the LinkedList.
     * After adding a node, head will point this node and new node will point to null (ex-head point loc.)*/
    @Override
    public void add(Object value) {
        Node<V> newNode = new Node(value, head);
        head = newNode;
    }

    /* "addAfter" adds a given value after a given target. It adds after the first occurrence of the given target
    * Using a for loop with a tmp starting to point from head to last element. I use tmp as counter here.
    * when target is found, I create a new node and insert it to that location. */
    public void addAfter(V target, V value) {
        if(head == null) {
            System.out.println("Linked List is empty! You can not use addAfter method!");
        }
        for(Node tmp = head; tmp!=null; tmp = tmp.next) {
            if (tmp.value.equals(target)) {
                 Node newNode = new Node(value, tmp.next);
                 tmp.next = newNode;
                 return;
             }
         }
    }

    /* "removes" the element pointed by head.
    * Head points the next element and the first element is garbage collected. */
    public void remove() {
        if(head != null) {
            System.out.println(head.value + " is removed");
            head = head.next;
        }
        else System.out.println("LinkedList is already empty. You cannot remove an element!");
    }

    /* "removeAt" methods the first occurrence of the given target at the list.
    * tmp and prev acts like a double for loop, one chases another.
    * fist if clause checks if the head already points the target. */
    public void removeValue(V target) {
        Node prev = null;
        Node tmp = head;
        if(tmp != null && tmp.value == target) {
            head = tmp.next;
            return;
        }
        while (tmp != null && tmp.value != target) {
            prev = tmp;
            tmp = tmp.next;
        }
        if(tmp == null) throw new NoSuchElementException("Element is not on your list!");
        prev.next = tmp.next;
    }

    /* "print" method creates a temporary pointer, which points the same location head points (first element
       of the LinkedList).
     * Each node has a value and next. "tmp.value" means the first nodes value because tmp is the first nodes
       pointer.
     * "tmp.next" means the nodes pointer which shows the next element. From now on tmp points the second element
        of the LinkedList. This cycle continues until tmp points to null. */
    @Override
    public void print() {
        if(head==null) {
            System.out.println("there is nothing to print.");
        }
        Node tmp = head;
        while(tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        boolean result = false;
        if(head == null) {
            result = true;
            return result;
        } else
            return result;
    }


}
