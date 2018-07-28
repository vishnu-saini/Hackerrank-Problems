package algorithms.graph_theory.Even_Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static int finalCount = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int vertices = Integer.parseInt(input[0]);
		int edges = Integer.parseInt(input[1]);

		Node root = new Node("1");
		List<Node> vertexes = new ArrayList<>();
		vertexes.add(root);

		for (int i = 0; i < edges; i++) {
			input = br.readLine().split(" ");
			String node1 = input[0];
			String node2 = input[1];

			if (root.getData().equals(node2)) {
				Node node = new Node(node1, root);
				root.getChildren().add(node);
				vertexes.add(node);
			} else {
				if (vertexes.contains(new Node(node2))) {
					int index = vertexes.indexOf(new Node(node2));
					Node parentNode = vertexes.get(index);
					Node node = new Node(node1, parentNode);
					parentNode.getChildren().add(node);
					if (!vertexes.contains(node)) {
						vertexes.add(node);
					}
				}
			}
		}

/*		for (Node node : vertexes) {
			System.out.println(node.getData() + "  --> " + node.getChildren());
		}

		System.out.println(countNodeInTree(root));*/

		isEageEligibleForRemove(root);
		System.out.println(--finalCount);

	}

	public static int countNodeInTree(Node root) {
		int count = 1;

		if (root.getChildren().size() == 0) {
			return count;
		} else {
			List<Node> childern = root.getChildren();
			for (Node node : childern) {
				count = count + countNodeInTree(node);
			}
		}
		return count;
	}

	public static boolean isNodeHasleafOnly(Node root) {
		for (Node node : root.getChildren()) {
			if (node.getChildren().size() > 0)
				return false;
		}
		return true;
	}

	public static boolean isEageEligibleForRemove(Node root) {

		if (root.getChildren().size() == 0) {
			return false;
		} else if (isNodeHasleafOnly(root) && countNodeInTree(root) % 2 == 0) {
			finalCount++;
			/*System.out.println("edge b/w -- > " + root.getData() + " and " + root.getParent().getData());*/
			return true;
		} else {
			int children = root.getChildren().size();
			for (Node node : root.getChildren()) {
				boolean flag = isEageEligibleForRemove(node);
				if (flag)
					children--;
			}

			if (children % 2 == 1) {
				finalCount = finalCount + 1;
				/*System.out.println("edge b/w -- > " + root.getData() +" and its parent");*/
				return true;
			} else {
				return false;
			}
		}

	}

}


class Node {
	private List<Node> children = new ArrayList<Node>();
	private Node parent = null;
	public Node getParent() {
		return parent;
	}

	private String data = null;

	public Node(String data) {
		this.data = data;
	}

	public Node(String data, Node parent) {
		this.data = data;
		this.parent = parent;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setParent(Node parent) {
		parent.addChild(this);
		this.parent = parent;
	}

	public void addChild(String data) {
		Node child = new Node(data);
		child.setParent(this);
		this.children.add(child);
	}

	public void addChild(Node child) {
		child.setParent(this);
		this.children.add(child);
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isRoot() {
		return (this.parent == null);
	}

	public boolean isLeaf() {
		if (this.children.size() == 0)
			return true;
		else
			return false;
	}

	public void removeParent() {
		this.parent = null;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Node)) {
			return false;
		} else {
			Node node = (Node) obj;
			if (node.data.equals(this.data))
				return true;
			else
				return false;
		}

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data;
	}
}