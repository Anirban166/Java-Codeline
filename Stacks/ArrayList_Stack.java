// LIFO ArrayList
Import java.util.ArrayList; 

public class StackArrayList 
{
    public static void main(String[] args) 
    {
        
        StackArrayList myStackArrayList = new StackArrayList();
        
//Insertions: myStackArrayList.push(10);  myStackArrayList.push(11);

     System.out.println(myStackArrayList.isEmpty()); // return false if not empty.
     System.out.println(myStackArrayList.peek()); // 11 
     System.out.println(myStackArrayList.pop()); // 11
     System.out.println(myStackArrayList.peek()); // 10
     System.out.println(myStackArrayList.pop()); // 10
    }

    //ArrayList representation of the stack : specifier ArrayList<type> name;
    public ArrayList<Integer> stackList;

    //Constructor :
    public StackArrayList() 
    { stackList = new ArrayList<>(); }

        //Add to end of list:    
        public void push(int value) 
        { stackList.add(value); }

    //pops top element: (last inserted)
    public int pop() 
        {
        if (!isEmpty()) //if stack empty
        { 
            int popValue = stackList.get(stackList.size() - 1);
            stackList.remove(stackList.size() - 1);  // removes popped element
            return popValue;
        }
        System.out.print("The stack is already empty!");
        return -1;
       }

    //Empty stack check
    public boolean isEmpty() 
    { return stackList.isEmpty(); }

   //Return top element:
    public int peek() 
    {
        return stackList.get(stackList.size() - 1);
    } 
}
