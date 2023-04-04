
public class decreasing {
	public static void main(String[] args) {
		int[] m= {3,1,5,9,8,6};
	    selection_sort_dec(m);
	    for (int i=0; i<m.length;i++)
	    {
	        System.out.print(m[i]+" ");
	        
	    }}
	
		public static void selection_sort_dec(int[] a)
		{
			for(int i = 0;i<a.length;i++)
			{
				int maxIndex = i;
				for(int j = i+1; j<a.length;j++)
				{
					if (a[j]>a[maxIndex])
						maxIndex=j;
					
				}
				int temp = a[i];
				a[i]=a[maxIndex];
				a[maxIndex]=temp;
			}
		}
			

			
}
