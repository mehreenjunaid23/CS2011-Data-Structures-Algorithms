package bubble_sort;

public class compare {
	
	static int comparisons=0;
	public static void compare(int[] a) {
		for( int i=0; i<a.length; i++) {
			int minIndex=i;
			int swaps=0;
			for( int j = i+1; j<a.length; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
					
				}
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
				swaps++;
			}
			comparisons++;
		}
	}
	
	public static void main(String args[])
    {
        // Input array
        int[] arr = { 2, 6, 4, 10, 40,1,23,15 };
        
        // Print statement
        System.out.println("unsorted array: ");
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        compare(arr);
        
        System.out.println("\nsorted array (increasing): ");
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("\ncomparisons: " + comparisons  );
        
}}
