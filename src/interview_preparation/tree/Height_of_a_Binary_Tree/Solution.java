package interview_preparation.tree.Height_of_a_Binary_Tree;

import java.util.Scanner;

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
	/*
	 * class Node int data; Node left; Node right;
	 */
	public static int height(Node root) {
		if(isLeaf(root)) return 0;
		int leftHeight=0;
		int rightHeight=0;
		if(root.left != null) leftHeight = height(root.left);
		if(root.right != null) rightHeight = height(root.right);
		return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
	
	public static boolean isLeaf(Node root){
		return root.left == null && root.right == null;
	}
	
}