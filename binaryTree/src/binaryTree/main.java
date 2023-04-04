package binaryTree;

public class main {
	public static void main(String arg[]) {
		binaryTree bn= new binaryTree();
		node n = new node("mehreen");
		bn.root=n;
		bn.root.left=new node("junaid");
		bn.root.right=new node("maliha");
		bn.root.right.left=new node("hamza");
		bn.root.right.right=new node("zoha");
		bn.root.left.right=new node("haneen");
		System.out.println(bn.size());
		System.out.println(bn.height(bn.root.left));
		bn.inOrder();
		bn.preOrder();
		bn.postOrder();
		
	
	}
}
