public class Tree<T extends Comparable<T>> {

    public class Node {
	private T value;
	private Node left;
	private Node right;

	public Node(T value, Node left, Node right) {
	    this.value = value;
	    this.left = left;
	    this.right = right;
	}

	public void printHelp() {
	    if (root.left == null) {
		System.out.println(root.value);
		if (root.right == null) {
		    System.out.println(root.value);
		} else {
		    (root.right).printHelp();
		}
	    } else {
		(root.left).printHelp();
	    }
	}
    }

    private Node root;

    public Tree() {
	this.root = null;
    }

    public void printInOrder() {
	(root.left).printHelp();
	System.out.println(root.value);
	(root.right).printHelp();
    }
}
