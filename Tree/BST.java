//implementation of binary search tree
class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BST {
	static Node root;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			insert(root, newNode);
		}
	}

	private static void insert(Node root, Node newNode) {
		if (root.data > newNode.data) {
			if (root.left == null) {
				root.left = newNode;
			} else {
				insert(root.left, newNode);
			}
		} else // (root.data >= newNode.data)
		{
			if (root.right == null) {
				root.right = newNode;
			} else {
				insert(root.right, newNode);
			}
		}
	}

	public void print() {
		if (root == null) {
			System.out.println("Empty Tree");
		} else {
			print(root);
		}
	}

	private void print(Node root) {
		if (root == null) {
			return;
		}
		print(root.left);
		print(root.right);
		System.out.print(root.data + " ");

		// System.out.println(root.data);
		// print(root);

	}

	public static void main(String[] args) {
	
		BST t = new BST();
		t.insert(3);
		t.insert(2);
		t.insert(1);
		t.insert(4);
		t.insert(5);
		t.insert(6);

		t.print();

	}

}
