

public class AVL_Tree {
	node root;
	
	public void update_height(node n) {
		n.height=1+ Math.max(height(n.left),height(n.right));
	}
	
	public int height(node n) {
		if(n==null)
			return -1;
		else
			return n.height;
	}
	
	public int getBalance(node n){
		if(n==null)
			return -1;
		else
			return height(n.right)-height(n.left);
	}
	
	public node rotate_right(node y) {
		node x=y.left;
		node z=x.right;
		x.right=y;
		y.left=z;
		update_height(y);
		update_height(x);
		return x;
	}
	
	public node rotate_left(node y) {
		node x=y.right;
		node z=x.left;
		x.left=y;
		y.right=z;
		update_height(y);
		update_height(x);
		return x;
	}
	
	public node rebalance (node z) {
		update_height(z); 
		int balance = getBalance(z); 
		if (balance > 1) { 
			if (height(z.right.right) > height(z.right. left)) {
		z = rotate_left(z); } 
			else {
		z.right = rotate_right(z.right);
		z = rotate_left(z);} }
		
		else if (balance < -1) { 
			if (height (z. left. left) > height(z.left.right)) {
				z = rotate_right(z); }
			else {
				z. left = rotate_left(z. left); z = rotate_right(z);}}
		return z;}
	
	public node insert(node node, int key) {
		if(node==null) {
			return new node(key);
		}else if(node.data>key) {
			node.left=insert(node.left,key);
		}else if(node.data<key) {
			node.right=insert(node.right,key);
		}
		return rebalance(node);
	}
	public void insert(int key) {
		root=insert(root,key);
	}
	public node search(int data) {
		return search(root, data);}
	
	public node search (node n, int data) {
	if(n.data==data || n==null)
	return n;
	else if (n.data>data)
	return search(n. left, data);
	else
	return search(n.right, data);}
	
	public void inOrder(node n) {
		if(n==null)
			return;
		else {
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	public void inOrder() {
		System.out.println("\ninOrder: ");
		inOrder(root);
	}
}
