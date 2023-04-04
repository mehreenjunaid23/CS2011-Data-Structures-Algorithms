package lect3;

public class Arraylist {

	Object m[];
	int s;
	
	public Arraylist() {
		m= new Object[10];
		s=0;
	}
	
	public int getsize() {
		return s;
	}
	
	public Object get(int i) {
		return m[i];
	}
	
	public void set(int i , Object x) {
		m[i]=x;
	}
	
	public void add(int i , Object x) {
		if (s==m.length) {
		
				resize();
			
		}
		else {
			for( int j=s;j>i;j-- ) {
				m[j]=m[j-1];
			}
			m[i]=x;
			s=s+1;
		}
		
	}
	public Object remove(int i) {
		if (s==0) {
			System.out.println("list is empty, sorry ...");
		}
		else {
			for( int j=i;j<s-1;j++ ) {
				m[j]=m[j+1];
			}
			s=s-1;
		}
		if (s<m.length/3) {
			resize();
		}
		return m;
	}
	public void resize() {
		Object [] b = new Object [2*s];
		for ( int i=0; i<s ; i++) {
			b[i]=m[i];
		}
		m=b;
	}
}
