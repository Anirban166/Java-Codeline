public class SelectionSortAlgo 
{
	public static void main(String a[])
	{  
		int[] myArray = {1,2,1,3,7}; 
		
		System.out.println("Before Selection Sort:);
    printArray(myArray);
 
		selection(myArray);//sort
 
		System.out.println("After Selection Sort");  
	  printArray(myArray); 
	} 
	
		public static void selection(int[] array)
	{  
		for (int i = 0; i < array.length - 1; i++)  
		{ System.out.println("Sort Pass Number "+(i+1));
			int index = i;  
			for (int j = i + 1; j < array.length; j++)
			{   
			  System.out.println("Comparing "+ array[index]  + " and " + array[j]);  
				if (array[j] < array[index]){ 
				System.out.println(array[index]  + " is greater than " + array[j] );
					index = j;
				}  
			}  
			int smallerNumber = array[index];   
			array[index] = array[i];  
			array[i] = smallerNumber;  
			System.out.println("Swapping Elements: New Array After Swap");
			printArray(array);
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
