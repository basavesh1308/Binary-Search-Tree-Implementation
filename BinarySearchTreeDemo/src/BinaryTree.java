public class BinaryTree{
	Node root;

	class Node {

		int key;
		Node left;
		Node right;
		
		public Node(){
			left=null;
			right=null;
		}
		
		public Node(int value){
			key = value;
			left = null;
			right = null; 
		}
	}

	
	public void add(int key) {
		root = insert(root,key);
	}
	
	public void inorder() {
		inorderTree(root);
	}

	public void preorder() {
		preorderTree(root);
	}

	public void postorder() {
		postorderTree(root);
	}


	private void inorderTree(Node root) {
		if(root != null) {
			inorderTree(root.left);
			System.out.println(root.key + " ");
			inorderTree(root.right);
		}
		
	}
	
	private void preorderTree(Node root) {
		if(root != null) {
			System.out.println(root.key + " ");
			preorderTree(root.left);
			preorderTree(root.right);
		}
		
	}
	
	
	private void postorderTree(Node root) {
		if(root != null) {
			postorderTree(root.right);
			postorderTree(root.left);
			System.out.println(root.key + " ");
		}
		
	}

	private Node insert(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insert(root.left, key);
		}
		
		else if (key>root.key) {
			root.right = insert(root.right,key);
		}
		
		return root;
	}
	
	
}

