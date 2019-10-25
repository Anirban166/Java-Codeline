package assignmentsByAnirban;

import java.util.*;
import javax.swing.JFrame;
import assignmentsByAnirban.Compass.Direction;

public class MainTestClass 
{
	public static void main(String[] args) 
	{ 
	   //----------------------------------------| Assignment 1 |------------------------------------------------
	   /*
		Radio a=new Radio();
		a.on();
	   */	
	   //----------------------------------------| Assignment 2 |------------------------------------------------
	   /*
		while(true)
	       {  
	           System.out.println("--------------------| Compass Simulator |---------------------");
	           Scanner sc = new Scanner(System.in); 
	           //Set Default Direction -
	           Compass.Direction N=Direction.NORTH;
	           
	            if(Compass.Direction.NORTH==N) System.out.println("Compass is pointing to NORTH by default.");
	    		if(Compass.Direction.SOUTH==N) System.out.println("Compass is pointing to SOUTH by default.");
	    		if(Compass.Direction.WEST==N) System.out.println("Compass is pointing to WEST by default.");
	    		if(Compass.Direction.EAST==N) System.out.println("Compass is pointing to EAST by default.");
	    		
	    	   System.out.println();
	           System.out.println("Enter the operation you want to perform :\n1.Swing Compass in a Random Direction."
	           		+ "\n2.Rotate Compass by 90 degrees clockwise.\n3.Rotate Compass by 180 degrees clockwise."
	           		+ "\n4.Rotate Compass by 270 degrees clockwise.\n5"
	           		+ ".Check if Compass is horizontaly aligned (W/E).\n6.Check if Compass is vertically aligned (N/S).");
	           int choice=sc.nextInt();
	           switch(choice)
	           {
	               case 1:Compass.Direction D=Compass.Direction.randomDirection();
	            if(Compass.Direction.NORTH==D) System.out.println("Compass is pointing to NORTH.");
   	    		if(Compass.Direction.SOUTH==D) System.out.println("Compass is pointing to SOUTH.");
   	    		if(Compass.Direction.WEST==D) System.out.println("Compass is pointing to WEST.");
   	    		if(Compass.Direction.EAST==D) System.out.println("Compass is pointing to EAST.");
	                       break;
	                       
	               case 2: {
	                         N=N.rotate90();
	                         System.out.println("Compass rotated by 90 degrees.");
	         	       		if(Compass.Direction.NORTH==N) System.out.println("Compass is pointing to NORTH.");
	        	    		if(Compass.Direction.SOUTH==N) System.out.println("Compass is pointing to SOUTH.");
	        	    		if(Compass.Direction.WEST==N) System.out.println("Compass is pointing to WEST.");
	        	    		if(Compass.Direction.EAST==N) System.out.println("Compass is pointing to EAST.");
	                       break;
	                       }
	               case 3: { 
                   			 N=N.rotate180();
                   			 System.out.println("Compass rotated by 180 degrees.");
 	         	       		if(Compass.Direction.NORTH==N) System.out.println("Compass is pointing to NORTH.");
 	        	    		if(Compass.Direction.SOUTH==N) System.out.println("Compass is pointing to SOUTH.");
 	        	    		if(Compass.Direction.WEST==N) System.out.println("Compass is pointing to WEST.");
 	        	    		if(Compass.Direction.EAST==N) System.out.println("Compass is pointing to EAST.");
	                       break; 
	                       }
	                       
	               case 4: { 
         			 	     N=N.rotate270();
         			 	   System.out.println("Compass rotated by 270 degrees.");
	         	       		if(Compass.Direction.NORTH==N) System.out.println("Compass is pointing to NORTH.");
	        	    		if(Compass.Direction.SOUTH==N) System.out.println("Compass is pointing to SOUTH.");
	        	    		if(Compass.Direction.WEST==N) System.out.println("Compass is pointing to WEST.");
	        	    		if(Compass.Direction.EAST==N) System.out.println("Compass is pointing to EAST.");
         			 	    break; 
                     	   }
	               case 5: {
         			 	     if(N.isHorizontal()==true) System.out.println("Compass is aligned horizontally (W/E)"); else System.out.println("Compass is not aligned horizontally (W/E)");
         			 	    break; 
                           }
	               case 6: { Compass.Direction M=Direction.NORTH;
			 	     if(N.isVertical()==true) System.out.println("Compass is aligned vertically (N/S)"); else System.out.println("Compass is not aligned vertically (N/S)");
			 	    break; 
                           }
	               
	           }
	            System.out.println("Do you want to perform more of such operations? Press 'y' for more otherwise press any key to discontinue.");
	                    char k=sc.next().charAt(0);
	                    if(k!='y')
	                    {
	                        break; 
	                    }
	           }
	   */
	   //----------------------------------------| Assignment 3 |------------------------------------------------
	    /* 
		while(true)
	       {
	           System.out.println("Welcome!");
	           Scanner sc = new Scanner(System.in);
	                    System.out.println("Enter x,y and z co-ordinates of the first vector :");
	                    int a1 =sc.nextInt();
	                    int b1 =sc.nextInt();
	                    int c1 =sc.nextInt();
	                    System.out.println("Enter x,y and z co-ordinates of the second vector :");
	                    int a2 =sc.nextInt();
	                    int b2 =sc.nextInt();
	                    int c2 =sc.nextInt();
	                   Vector v1=new Vector(a1,b1,c1);
	                   Vector v2=new Vector(a2,b2,c2);
	           
	           System.out.println("Enter the operation you want to perform :\n1.Add the two entered vectors\n2.Dot Product of the two entered vectors\n3.Cross product of the two entered vectors\n4.Scalar Multiplication with first vector\n5.Compare the two vectors\nEnter 1/2/3/4/5:");
	           int ch=sc.nextInt();
	           switch(ch)
	           {
	               case 1:v1.Add(v2);
	                       break;
	               case 2:v1.DotProduct(v2);
	                       break;
	               case 3:v1.CrossProduct(v2);
	                       break;
	               case 4:
	                   System.out.println("Enter Scalar");
	                   int s=sc.nextInt();
	                   v1.ScalerMult(s);
	                       break;
	               case 5:v1.Compare(v2);
	                       break;
	           }
	            System.out.println("Do you want to perform more of such operations? Press 'y' for more otherwise press any key to discontinue.");
	                    char k=sc.next().charAt(0);
	                    if(k!='y')
	                    {
	                        break; 
	                    }
	           }
		*/
	   //----------------------------------------| Assignment 4 |------------------------------------------------
        /*
		//Example : p(x)=2x^5+4x^3+3x^2+3 ; q(x)=5x^3+6x^4+11x
		ADTPolynomial p1 = new ADTPolynomial(4,3);
    	ADTPolynomial p2 = new ADTPolynomial(3,2);
    	ADTPolynomial p3 = new ADTPolynomial(3,0);
    	ADTPolynomial p4 = new ADTPolynomial(2,5);
    	ADTPolynomial p = p1.Add(p2).Add(p3).Add(p4); //p(x)
    	//--------------------------------------------------------------------
    	ADTPolynomial q1 = new ADTPolynomial(6,4);
    	ADTPolynomial q2 = new ADTPolynomial(11,1);
    	ADTPolynomial q3 = new ADTPolynomial(5,3);
    	ADTPolynomial q = q1.Add(q2).Add(q3); //q(x)    
        //--------------------------------------------------------------------
    	ADTPolynomial r = p.Add(q);
    	ADTPolynomial s = p.Multiply(q);
    	ADTPolynomial t = p.Subtract(q);
        System.out.println("ADT Polynomial one, p(x) = "+p);
        System.out.println("ADT Polynomial two, q(x) = "+q);
        System.out.println("Addition of Polynomials one and two , p(x) + q(x) = "+r);
        System.out.println("Subtraction of Polynomials one and two , p(x) - q(x) = "+t);
        System.out.println("Multiplication of Polynomials one and two, p(x) * q(x) = "+s);
        */
	   //----------------------------------------| Assignment 5 |------------------------------------------------
		/*
		Scanner sc=new Scanner(System.in);
        double a=0;
        System.out.println("Enter Initial amount(min 1000)");
        double iB=sc.nextDouble();
        if(iB<1000)
        {
            System.out.println("Invalid initial balance. Enter Again");
            System.out.println("Enter Initial amount(min 1000)");
            iB=sc.nextDouble();   
        }
        
        final SavingsAccount sa=new SavingsAccount(iB,0.05);
        //CheckingAccount ca=new CheckingAccount(iB,2);

       while(true)
       {
        System.out.println("-------| Transaction Menu |-------|");
        System.out.println("1.Credit\n2.Debit");
        int ch=sc.nextInt();
        
        switch(ch)
        {
                case 1:
                   System.out.println("Enter balance");
                   double c=sc.nextDouble();
                   sa.Credit(c);
                   a=sa.CalculateInterest(c);
                   System.out.println("Interest "+a);
                   sa.Credit(a);
                   sa.GetBalance();
                   break;
                case 2:
                   System.out.println("Enter balance");
                   double d=sc.nextDouble();
                   sa.Debit(d);
                   sa.GetBalance();
                   sa.BankCharge();
                   sa.GetBalance(); break;  
        }
         System.out.println("Do you want to perform more? Enter y if yes, otherwise enter any no. :");
                 char k=sc.next().charAt(0);
                 if(k!='y')
                 {
                     break; 
                 }
       }
       */
	   //----------------------------------------| Assignment 6 |------------------------------------------------
	   /*
       JFrame f = new JFrame("Shapes");
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.getContentPane().add(new Drawing());
       f.setSize(290, 325);
       f.setLocation(550, 25);
       f.setVisible(true);
	   */
			
	}
}
