import java.util.Array;
public class StackArray {

    public static void main(String[] args) {
        StackArray myStackArray = new StackArray(5); //max size of stack 5 declared.

        myStackArray.push(5);
        myStackArray.push(6);
        myStackArray.push(7);
        myStackArray.push(8);
        myStackArray.push(9);

        System.out.println(myStackArray.isEmpty()); // return false
        System.out.println(myStackArray.isFull()); // return true
        System.out.println(myStackArray.peek()); //  9
        System.out.println(myStackArray.pop()); //  9
        System.out.println(myStackArray.peek()); //  8
    }

    private int maxSize; //maximum size of stack
    private int[] stackArray; //array declaration
    private int top; //top element
    public StackArray(int size) //constructor
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) 
    {
        if (!isFull()) // Checks for a full stack
        { 
            top++;
            stackArray[top] = value;
        } else 
        {
            resize(maxSize * 2);
            push(value); // push after resizing
        }
    }

    public int pop() 
    {
        if (!isEmpty()) 
        { 
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop(); //pop after resizing
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    public int peek() 
    {
        if (!isEmpty()) 
        {
            return stackArray[top];
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    private void resize(int newSize) 
    {
        // private int[] transferArray = new int[newSize]; we can't put modifiers here.
        int[] transferArray = new int[newSize];

        // for(int i = 0; i < stackArray.length(); i++){ the length isn't a method.
        for (int i = 0; i < stackArray.length; i++) 
        {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }
        maxSize = newSize;
    }

    public boolean isEmpty() //return true if stack is empty.
    {
        return (top == -1);
    }

    public boolean isFull() 
    {
        return (top + 1 == maxSize);
    }

    //Delete everything in stack.
    public void makeEmpty() // Doesn't delete elements in the array but if you call push method after calling makeEmpty it will overwrite previous values
    { 
        top = -1;             
    }
}
