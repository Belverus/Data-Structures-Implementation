/** ArrayList class extends List class and uses its template methods.
 */
import java.util.Arrays;

public class ArrayList<V> extends List {

    //Instance variables    -----------------------------------------------------------------------------------------
    /* ArrayList class has three instance variables.
    * "Size" acts like both a checkpoint and index. It compares the empty locations with the array size.
    * DEFAULT_CAPACITY is the array initialization capacity and 10. */
    protected int size = 0; //we used this as top in our course slides.
    protected final int DEFAULT_CAPACITY = 10;
    protected Object[] arraylist;

    //Constructors          -----------------------------------------------------------------------------------------
    /* ArrayList has only a default constructor, which initializes the elements array with default capacity 10. */
    protected ArrayList() {
        this.arraylist = new Object[DEFAULT_CAPACITY];
    }

    //Accessors and mutators   --------------------------------------------------------------------------------------
    /* "add" method adds a new element to the ArrayList.
    *  checks if the ArrayList is full. If it is it goes to function increaseCapacity() to increase capacity.
    *  Size is used as the 0 index to store the arraylist values. */
    @Override
    protected void add(Object value){
        if(size == arraylist.length) {
            System.out.println("Array capacity is full. Increasing capacity...");
            increaseCapacity();
        }
        arraylist[size++] = value;
    }

    /* "insertAt" method inserts an element at the given index.
    * shifts the elements after given index by one.
    * doubles the size if the current capacity is full. */
    public void insertAt(int index, V newVal) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Given index is out of bounds!");
        }
        if(size == arraylist.length) {
            System.out.println("Array capacity is full. Increasing capacity...");
            increaseCapacity();
        }
        for(int i = size-1; i >= index; i--) {
            arraylist[i+1] = arraylist[i];
        }
        arraylist[index] = newVal;
        size++;
    }

    /*"increaseCapacity" doubles the current default size of the arraylist and copies the contents of it to a new
     double sized array.
     * User should not modify increaseCapacity method, that's why I made it private. */
    private void increaseCapacity() {
        int newSize = arraylist.length * 2;
        arraylist = Arrays.copyOf(arraylist, newSize);
    }


    /* "remove" method removes the last element of the array and decreases the size by 1. */
    protected void remove() {
        if(size < 1) {
            throw new ArrayIndexOutOfBoundsException("ArrayList is already empty!");
        } else {
            System.out.println("Removing element " + arraylist[size-1] + " at index " + (size-1));
            arraylist[size-1] = null;
            size--;
        }
    }

    /* "removeAt" removes the element at given index.
    * elements after removing the target are copied back starting from the empty position.
    * last element is equaled to null after removal and array size is decreased by one.  */
    protected void removeAt(int index) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Given index is out of bounds!");
        }
        if(size < 1) {
            throw new ArrayIndexOutOfBoundsException("ArrayList is already empty!");
        } else {
            System.out.println("Removing element " + arraylist[index] + " at index " + index);
            arraylist[index] = null;
            for(int i = index; i<size-1; i++){
                arraylist[i] = arraylist[i+1];
            }
            arraylist[size-1] = null;
            size--;
        }
    }

    /*As size shows the filled elements of the arraylist, "print()" function displays the elements of arraylist. */
    @Override
    protected void print() {
        for(int i = 0; i<size; i++) {
            System.out.print(arraylist[i] + " ");
        }
        System.out.println();
    }

    /*After overflow of the default capacity, you can check the new capacity of the arraylist. */
    protected void getCapAndSize() {
        System.out.println("Current capacity is: " + arraylist.length + ", current size is: " + size) ;
    }

/*End of ArrayList class.*/
}
