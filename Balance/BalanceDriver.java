/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/blob/master/Balance.java
 * COSC 311
 * HW 1107
 * FALL 2016
 */

public class BalanceDriver {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = BST.insert(10, tree.root);
		tree.root = BST.insert(5, tree.root);
		tree.root = BST.insert(15, tree.root);
		tree.root = BST.insert(3, tree.root);
		tree.root = BST.insert(13, tree.root);
		tree.root = BST.insert(17, tree.root);
		tree.root = BST.insert(18, tree.root);
		tree.root = BST.insert(22, tree.root);
		tree.root = BST.insert(21, tree.root);
		System.out.println(BST.balance(tree.root));
		System.out.println(BST.balance(tree.root.right));
		System.out.println(BST.balance(tree.root.left));
	}
}
// OUTPUT
// 3
// 3
// -1