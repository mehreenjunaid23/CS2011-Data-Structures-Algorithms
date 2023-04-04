package doubly_linked_list;

public class doubly_linkedlist {
	int n;
	node dummy;
	
	public doubly_linkedlist() {
		n=0;
		dummy=new node();
		dummy.previous=dummy;
		dummy.next=dummy;
		
	}
	
	public int size() {
		return n;
	}
	
	public node getNode(int i) {
		node m;
		if(i<n/2) {
			m=dummy.next;
			for(int j=0;j<i;j++) {
				m=m.next;}
			}
		else {
			m=dummy.previous;
			for(int j=n-1;j>i;j--) {
				m=m.previous;}
			}
		return m;
		}
	
	public Object get(int i) {
		node m=getNode(i);
		return m.data;
	}
	
	public void set(int i, Object x) {
		node m=getNode(i);
		m.data=x;
	}
	
	public void addbefore(node w, Object x) {
		node a= new node();
		a.data=x;
		
		
		a.previous=w.previous;
		a.next=w;
		w.previous=a;
		a.previous.next=a;
		
		n++;

	}

	public void add(int i, Object x) {
		node m= getNode(i);
		addbefore(m,x);
		
	}
	
	public void addFirst(Object x) {
		node n = getNode(0);
		addbefore(n,x);
	}
	public void removeFirst() {
		remove(0);
	}
	public void addLast(Object x) {
		node k = getNode(n);
		addbefore(k,x);}
	public void removeLast() {
		remove(n);
	}
	
	public void removeNode(node m ) {
		m.previous.next=m.next;
		m.next.previous=m.previous;
		n--;
	}
	
	
	public Object remove(int x) {
		node m= getNode(x);
		removeNode(m);
		return m.data;
	}
	
}

