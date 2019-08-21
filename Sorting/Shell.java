class ShellSort 
{
    public static void main(String args[]) 
    {
        int[] arr = new int[] {35,51,22,7,1};
        System.out.println("Array before sorting is:");
		for(int i=0;i 0; inc /= 2)
    {
		for (int i = inc; i < arr.length; i++)
    {
			k = arr[i];
			for (j = i; j >= inc; j -= inc) 
      {
				if (k < arr[j - inc]) 
        {
					arr[j] = arr[j - inc];
				} else break;
			}
			arr[j] = k;
		}
  	}
	System.out.println("After Sorting is ");
   for (int i = 0; i < 5; i++) 
  {
		System.out.println(arr[i]);
  }
  }//main end
}
