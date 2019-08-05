/**LinkedListStack class extends LinkedList class.
 * I will store the data in the form of node and use these nodes with stack rules (LIFO).
 * */
public class LinkedListStack<V> extends LinkedList{

    //Instance variables    --------------------------------------------------------------------------------------
    /* Stack class does not have an instance variable. It inherits head from LinkedList class.
    * I will use the head element as "top" */

    //Constructor           --------------------------------------------------------------------------------------
    /* LinkedListStack class has only a default constructor which points top of the stack to null. */
    public LinkedListStack() {
        super();        /* this.head = null; */
    }

    //Accessors && Mutators --------------------------------------------------------------------------------------
    /* "push()" method pushes a node to the stack. Gets the value and creates a node with the new value.
    *  LinkedList acts like a stack when we want to add a node. Adds to top! So, I used its super add method.
    * "head" marks the top element whenever a node is added. */
    public void push(V value) {
        super.add(value);
        /* equals to:
         * Node<V> tmp = new Node<V>(value, head);
           or:
         * tmp.value = value;
         * tmp.next = head;
         * head = tmp;
        */
    }

    /* "pop" method pops a node from stack and new top points the ex-second element after pop operation */
    public void pop() {
        super.remove();
    }

    /* "print" method prints the stack elements starting from the top. */
    @Override
    public void print() {
        Node tmp = head;
        while(tmp != null) {
            System.out.println(tmp.value + " ");
            tmp = tmp.next;
        }
    }

}
