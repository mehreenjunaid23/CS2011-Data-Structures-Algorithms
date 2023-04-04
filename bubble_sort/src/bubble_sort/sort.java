package bubble_sort;

public class sort {
	public static void sort_inc(int[] a) {
		for( int i=0; i<a.length; i++) {
			int minIndex=i;
			for( int j = i+1; j<a.length; j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
					
				}
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void sort_dec(int[] a) {
		for( int i=0; i<a.length; i++) {
			int maxIndex=i;
			for( int j = i+1; j<a.length; j++) {
				if(a[j]>a[maxIndex]) {
					maxIndex=j;
					
				}
				int temp=a[maxIndex];
				a[maxIndex]=a[i];
				a[i]=temp;
			}
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
        
        // storing result
        sort_inc(arr);
        // Print statement
        System.out.println("\nsorted array (increasing): ");
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
  
        
        // storing result
        sort_dec(arr);
        // Print statement
        System.out.println("\nsorted array (non-increasing): ");
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        
        
    }

}

