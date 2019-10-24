import java.io.*;
class Node
{
   public int exp,coeff;
   public Node next;
   public Node(int x,int y)
   {
     coeff=x;
     exp=y;
   }
   public void displayNode()
   {
     if(coeff<0)
      System.out.print(coeff+"x^"+exp);
     else
      System.out.print("+"+coeff+"x^"+exp);
   }
}
class LinkList
{
   public Node first;
   public Node last;
   public LinkList()
   {
     first=null;
     last=null;
   }
   public void insertLast(int x,int y)
   {
     Node newNode=new Node(x,y);
     if(isEmpty())
       first=newNode;
     else
       last.next=newNode;
     last=newNode;
   }
   public boolean isEmpty()
   {
     return(first==null);
   }
   public void display()
   {
     Node current=first;
     while(current != null)
     {
       current.displayNode();
       current=current.next;
     }
     System.out.println();
   }
}
class Polynomial
{
   private LinkList l1;
   public Polynomial()
   {
     l1=new LinkList();
   }
   public void insert(int x,int y)
   {
     l1.insertLast(x,y);
   }
   public void displayPoly()
   {
     l1.display();
   }
   public void add(Polynomial poly1,Polynomial poly2)
   {
     int x,y;
     Node current1=poly1.l1.first;
     Node current2=poly2.l1.first;
     while(current1!=null&&current2!=null)
     {
       if(current1.exp==current2.exp)
       {
         x=current1.coeff+current2.coeff;
         y=current1.exp;
         current1=current1.next;
         current2=current2.next;
       }
       else if(current1.exp>current2.exp)
       {
         x=current1.coeff;
         y=current1.exp;
         current1=current1.next;
       }
       else
       {
         x=current2.coeff;
         y=current2.exp;
         current2=current2.next;
       }
       l1.insertLast(x,y);
     }
     while(current1!=null)
     {
       x=current1.coeff;
       y=current1.exp;
       current1=current1.next;
       l1.insertLast(x,y);
     }
     while(current2!=null)
     {
       x=current2.coeff;
       y=current2.exp;
       current2=current2.next;
       l1.insertLast(x,y);
     }
   }
}
class PolyAdd
{
   public static void main(String args[])throws IOException
   {
     String ch="y";
     DataInputStream inp=new DataInputStream(System.in);
     int n,co,ex=1;
     while(ch.equals("y"))
     {
       Polynomial p1=new Polynomial();
       Polynomial p2=new Polynomial();
       Polynomial p3=new Polynomial();
       System.out.println("Enter the 1st polynomial");
       while(ex!=0)
       {
         System.out.println("Enter the coefficent ");
         co=Integer.parseInt(inp.readLine());
         System.out.println("Enter the exponent");
         ex=Integer.parseInt(inp.readLine());
         p1.insert(co,ex);
       }
       ex=1;
       System.out.println("Enter the 2nd polynomial");
       while(ex!=0)
       {
         System.out.println("Enter the coefficent ");
         co=Integer.parseInt(inp.readLine());
         System.out.println("Enter the exponent");
         ex=Integer.parseInt(inp.readLine());
         p2.insert(co,ex);
       }
       System.out.print("1st Polynomial:-  ");
       p1.displayPoly();
       System.out.print("2nd Polynomial:-  ");
       p2.displayPoly();
       p3.add(p1,p2);
       System.out.print("Added Polynomial:-  ");
       p3.displayPoly();
       System.out.print("Enter y to continue ");
       ch=inp.readLine();
      }
   }
}
