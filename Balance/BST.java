
public class BST {
	Node root;

	public BST() {
		root = null;
	}

	public static int height(Node n) {
		if (n == null) {
			return -1;
		}
		if (n.left == null && n.right == null) {
			return 0;
		}
		return 1 + Math.max(height(n.right), height(n.left));
	}

	public static int balance(Node n) {
		if (n.left == null && n.right == null) {
			return 0;
		}
		return height(n.right) - height(n.left);

	}

	public static Node insert(int x, Node n) {
		if (n == null) {
			return (new Node(x, null, null));
		} else if (x <= n.data) {
			n.left = insert(x, n.left);
			return n;
		} else {
			n.right = insert(x, n.right);
			return n;
		}
	}
}
