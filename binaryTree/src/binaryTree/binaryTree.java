package binaryTree;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class binaryTree {
	node root;
	
	public int size() {
		return size(root);
	}
	
	public int size(node n) {
		if(n==null)
			return 0;
		else 
			return 1+(size(n.left)+size(n.right));
		
	}
	
	public int height(node n) {
		if(n==null)
			return -1;
		else
			return 1+ Math.max(height(n.left),height(n.right));
	}
	public int height() {
		return height(root);
	}
	
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
	
	public void preOrder(node n) {
		if(n==null)
			return;
		else {
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	public void preOrder() {
		System.out.println("\npreOrder: ");
		preOrder(root);
	}
	public void postOrder(node n) {
		if(n==null)
			return;
		else {
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	public void postOrder() {
		System.out.println("\npostOrder: ");
		postOrder(root);
	}


}
