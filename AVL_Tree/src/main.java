
public class main {

public static void main(String[] args) {
	// TODO code application logic here
	AVL_Tree avl = new AVL_Tree();
	avl.insert(7); 
	avl.insert (20); 
	avl.insert(25); 
	avl.insert(9); 
	avl.insert(2); 
	avl.insert(4);
	node a= avl.search(25);
	System.out.println(a.data); 
	avl.inOrder();

}}