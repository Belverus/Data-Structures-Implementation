/**ArrayListStack extends ArrayList class*/
public class ArrayListStack<V> extends ArrayList {

    //Instance variables ---------------------------------------------------------------------------------------
    /* No instance variables required. /

    //Constructors  --------------------------------------------------------------------------------------------
    /*ArrayListStack uses the superclass constructor.*/
    public ArrayListStack() {
        super();
    }

    //Accessors and Mutators    --------------------------------------------------------------------------------
    /* "push" method pushes an element to the arraylist stack. */
    public void push(Object value) {
        super.add(value);
    }

    /* "pop" method removes an element from the top of the stack. */ //return et pop ettiklerini.
    public void pop() {
        super.remove();
    }

    /*You can check the ArrayListStack top*/
    protected void getTop() {
        System.out.println("Current top is: " + arraylist[size-1]);
    }

}
