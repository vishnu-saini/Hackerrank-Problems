package interview_preparation.tree.BST_Lowest_Common_Ancestor;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class Solution {

	boolean checkBST(Node root) {
		return find(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean find(Node root, int min, int max) {
		if (root == null)return true;
		if (root.data < min || root.data > max)	return false;
		return find(root.left, min, root.data - 1) && find(root.right, root.data + 1, max);
	}

}