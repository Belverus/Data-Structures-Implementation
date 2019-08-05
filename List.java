abstract public class List<V> {

    /**Abstract List Class is used as a template for LinkedList and ArrayList classes.
     * No instance variables and constructors are used. (List is used as an interface).*/

    //Abstract methods     -----------------------------------------------------
    /* Main list classes will have 3 default methods: print, add, and remove.
    * LinkedList and ArrayList also have their specific methods. */
    abstract protected void print();
    abstract protected void add(V value);
    abstract protected void remove();


    /*Abstract List class ends here*/
}
