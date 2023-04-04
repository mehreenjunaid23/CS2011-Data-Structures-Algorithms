
public class aplhabetical_order {
	public static void main(String[] args) {
		String[] m= {"amera","catherine","basma","dana","zoha","mehreen"};
	    selection_sort_alph(m);
	    for (int i=0; i<m.length;i++)
	    {
	        System.out.print(m[i]+" ");
	        
	    }}
	
		public static void selection_sort_alph(String[] a)
		{
			for(int i = 0;i<a.length;i++)
			{
				int minIndex = i;
				for(int j = i+1; j<a.length;j++)
				{
					if (a[j].compareTo(a[minIndex])<0)
						minIndex=j;
					
				}
				String temp = a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
			}
		}
}
