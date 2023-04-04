
package doubly_linked_list;

public class main {
	public static void main(String[] args) {
	doubly_linkedlist d = new doubly_linkedlist();
	d.add(0,"mehreen");
	d.add(0,"hamza");
	d.add(0,"zoha");
	d.add(2,"haneen");
	d.addFirst("addfirst");
	d.addLast("addlastt");
	d.removeFirst();
	d.removeLast();
	
	
	for(int i=0; i<d.size();i++) {
		System.out.println(d.get(i));
	}
	
	
}
	}