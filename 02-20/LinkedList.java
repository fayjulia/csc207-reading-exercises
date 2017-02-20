import Node;

public class LinkedList {

    public LinkedList (Node first) {
	this.first = first;
    }

    public void addFirst (LinkedList list, Node first) {
	Node n = new Node(first, list.first);
	list.first = n;
    }

    public int size (LinkedList list) {
	int sz = 0;
	Node cur = list.first;
	while (cur != NULL) {
	    sz++;
	    cur = cur.next;
	}
	return sz;
    }

}
