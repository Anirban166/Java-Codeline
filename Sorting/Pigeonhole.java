import java.util.Arrays;

public class PigeonholeSortApp
{

public static void pigeonholesort(int arr[],int n)
{
int min=arr[0];
int max=arr[0];

for(int a=0;a<n;a++)
{
if(arr[a]>max)
max=arr[a];
if(arr[a]<min)
min=arr[a];
}

int range=max-min+1;
int[] phole=new int[range];
Arrays.fill(phole, 0);

for(int i=0;i<n;i++)
phole[arr[i]-min]++;

int index=0;

for(int j=0;j<range;j++)
 while(phole[j]-->0)
 arr[index++]=j+min;

}

public void printArray(int arr[])
{
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
            System.out.print(arr[i]+" ");
    }
   
@SuppressWarnings("static-access")
public static void main(String[] args)
{
   PigeonholeSortApp sort = new PigeonholeSortApp();
          int[] arr = {82,37,61,21,34,92,12,19,42,37,55,72,86}; //Hard-code custom array values.
          System.out.println(" Before sort: \n");
          sort.printArray(arr);
          System.out.println("\nAfter sort: ");
          sort.pigeonholesort(arr,arr.length);
          sort.printArray(arr);
}

}
