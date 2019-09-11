class Spiral
  {   public static void main(String args[])
        {   int n=5;
        	for(int i=0;i<n;i++)
        	{ for(int j=0;j<n;j++) 
        	  {  int w=1,x=1+w,y=x+w,z=w+y,c=z;
        	  
        	      //filling positions thereafter according to matrix positions:
        		   //3x3 outer spiral
        	      if(i==n/2 && j==n/2-1) System.out.print(w);       		
                  else if(i==n/2-1 && j==n/2)System.out.print(x); 
                  else if(i==n/2 && j==n/2+1) System.out.print(y); 
                  else if(i==n/2+1 && j==n/2) System.out.print(z); 
        		  
              int r=w;
        		  //5x5 outer spiral
                  else if(i==n/2+1 && j==n/2-1) System.out.print(w+c*r+" "); 
                  else if(i==n/2 && j==n/2-2) System.out.print(x+c*r+" "); 
                  else if(i==n/2-1 && j==n/2-1) System.out.print(y+c*r+" "); 
                  else if(i==n/2-2 && j==n/2) System.out.print(z+c*r+" "); 
             r+=w;    
                  else if(i==n/2-1 && j==n/2+1) System.out.print(" "+(w+c*r)); 
                  else if(i==n/2 && j==n/2+2) System.out.print(" "+(x+c*r)); 
                  else if(i==n/2+1 && j==n/2+1) System.out.print(" "+(y+c*r)); 
                  else if(i==n/2+2 && j==n/2) System.out.print(" "+(z+c*r)); 
        	    
        	        else System.out.print(" "); // spaces for remaining matrix blocks to give the spiral look
        	  }
        	  System.out.println();        	
            }
     }
 } 
 // Complexity count 27
