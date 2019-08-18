public class BubbleSort 
{
	public static void main(String[] args)
	{  
		int[] arr={5,7,2,1,8,7};  
 
		System.out.println("Array before Bubble Sort:"); 
	  printArray(arr);
		bubbleSort(arr); //sort call
		System.out.println("Array after Bubble Sort:");  
		
		printArray(arr); 
 
	}  
 	static void bubbleSort(int[] array)
	{  
		int temp = 0;  
		for(int i=0 ; i < array.length ; i++) 
		{  System.out.println("Sort Pass Number "+(i+1)); 
			for(int j=1 ; j < (array.length-i) ; j++)
			{  
			    System.out.println("Comparing "+ array[j-1]+ " and " + array[j]);    
				if(array[j-1] > array[j])
				{   	    
					//swap elements  
					temp = array[j-1];  
					array[j-1] = array[j];  
					array[j] = temp;  
				    System.out.println(array[j]  + " is greater than " + array[j-1]);
				    System.out.println("Swapping Elements: New Array After Swap");
					printArray(array);
				}  
 
			}  
		}  
 
	} 
	
	static void printArray(int[] array)
  {  
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();	    
	}
}
