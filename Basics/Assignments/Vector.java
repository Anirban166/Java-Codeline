package assignmentsByAnirban;

class Vector
{
    int x,y,z;
    
    Vector() 
    {
       x=y=z=0;
    }

    Vector(int x, int y, int z) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void Add(Vector ob2)
    {
        int x1= x+ob2.x;
        int y2= y+ob2.y;
        int z3= z+ob2.z;
        System.out.println("Additon :"+x1+"i+"+y2+"j+"+z3+"k");  
    }
        void DotProduct(Vector ob2)
        {
        
        int x2= x*ob2.x;
        int y2= y*ob2.y;
        int z2= z*ob2.z;
        int s=x2+y2+z2;
       
        System.out.println("Dot product :"+x2+"+"+y2+"+"+z2+"="+s);
         
    }
       void CrossProduct(Vector ob2)
       {
        
        int x3= y*ob2.z-z*ob2.y;
        int y3= z*ob2.x-x*ob2.z;
        int z3= x*ob2.y-y*ob2.x;
       
        System.out.println("Cross Product :"+x3+"i-"+y3+"j+"+z3+"k");
       }
        void ScalerMult(int p)
        {
        int x4= x*p;
        int y4= y*p;
        int z4= z*p;
        System.out.println("Final Vector :"+x4+"i+"+y4+"j+"+z4+"k"); 
        }
       void Compare(Vector ob2)
       {
    	   if(x==ob2.x &&y==ob2.y&&z==ob2.z)
    	   {
    		   System.out.println("The two vectors entered are equal");
    	   }
    	   else
    	   {
    		   System.out.println("The two vectors entered are not equal");
            
    	   }
       }
}
