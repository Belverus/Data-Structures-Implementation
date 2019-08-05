/**
 * ArrayListQueue extends ArrayList Class .
 */
public class ArrayListQueue<V> extends ArrayList {

    //Instance variables ---------------------------------------------------------------------------
    /*Front and Rear nodes will be used to mark the first element and the last element in the arraylist. */
    protected int front = 0;
    protected int rear;

    //Constructors  --------------------------------------------------------------------------------
    /*Using the constructor of the arraylist. */
    protected ArrayListQueue () {
        super();
    }

    //Accessors and Mutators -----------------------------------------------------------------------
    /*Push method is the same as the stack. Holding the top of the stack as rear. */
    public void enqueue(V value) {
        super.add(value);
        rear = size;
    }

    public void dequeue() {
        if(front == rear) {
            throw new ArrayIndexOutOfBoundsException("Array is already empty!");
        }
        arraylist[front] = null;
        front++;
    }

    public void getRear() {
        System.out.println("Rear index: " + (rear-1) + " Rear element: " + arraylist[rear-1]);
    }

    public void getFront() {
        System.out.println("Front index: " + front + " Front element " + arraylist[front]);
    }




}
