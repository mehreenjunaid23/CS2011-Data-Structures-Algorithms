package linked_list;

public class list {
	node head;
	node tail;
	int n;
	
	public void add(Object x) {
		node a=new node();
		a.data=x;
		if (n==0) {
			tail=a;
			head=a;}
		
		tail.next=a;
		tail=a;
		n++;
	}
	
	public Object remove() {
		if (n==0)
			return null;
		Object temp= head.data;
		head=head.next;
		n--;
		if(n==0) {
			tail=null;
		}
		return temp;
		
	}

}
