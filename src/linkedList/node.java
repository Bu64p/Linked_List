package linkedList;

public class node {
	node prev;
	node next;
	Object value;

	public node(node prev, Object value, node next) {
		this.prev = prev;
		this.value = value;
		this.next = next;
	}

	public node(node prev, Object value) {
		this.prev = prev;
		this.value = value;
	}

	public node() {
	}
}
