
public class iterative {



		public int iterative_binarySearch(int a[], int x ) {
			int low=0;
			int high=a.length-1;
			
			
			while(high>=low) {
				int mid= (high+low)/2;
				if(a[mid]==x) {
					return mid;
				}
				else if(a[mid]>x) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			return -1;
		}
		

	 
	    // Method 2
	    // Main driver method
	    public static void main(String args[])
	    {
	 
	        iterative ob = new iterative();
	 
	        // Input array
	        int arr[] = { 2, 3, 4, 10, 40 };
	        // Length of array
	        int n = arr.length;
	        // Element to be checked if present or not
	        int x = 10;
	 
	        // Calling the method 1 and
	        // storing result
	        int result = ob.iterative_binarySearch(arr, x);
	 
	        // Element present
	        if (result == -1)
	 
	            // Print statement
	            System.out.println("Element not present");
	 
	        // Element not present
	        else
	 
	            // Print statement
	            System.out.println("Element found at index "
	                               + result);
	    }
	
	}


