package linkedList;

public class linkedList {
	private node head;
	private node tail;
	private int size = 0;

	public linkedList() {
		head = new node();
		tail = head;
	}

	public void add(Object value) {
		if (size == 0) {
			head = new node(tail, value, head);
			tail = head;
		} else {
			head.next = new node(head, value, null);
			head = head.next;
		}
		size++;
	}

	public int getSize() {
		return size;
	}

	public Object getValue(int i) throws Exception {
		node x = tail;
		int j = 0;
		if (i + 1 > size || i < 0) {
			throw new Exception("\n " + i + " is out of range! \n Input must be between 0 and " + (size - 1) + ".");
		}
		while (x != null) {
			if (i == j) {
				return x.value;
			} else {
				x = x.next;
			}
			j++;
		}
		return null;
	}

	public int getIndex(Object value) throws Exception {
		node x = tail;
		int j = 0;
		while (x != null) {
			if (x.value == value) {
				return j;
			} else {
				x = x.next;
			}
			j++;
		}
		throw new Exception("\n (" + value + ") is NOT in Linked List!");
	}

	public void deleteIndex(int i) throws Exception {
		if (i >= 0 && i < size) {
			if (i == 0) {
				tail.next.prev = null;
				tail = tail.next;
			} else if (i == (size - 1)) {
				head.prev.next = null;
				head = head.prev;
			} else {
				node x = getNode(i);
				x.prev.next = x.next;
				x.next.prev = x.prev;
				for (int j = 0; j < i; j++) {
					x = x.prev;
				}
				tail = x;
			}
			size--;
		} else {
			throw new Exception("\n " + i + " is out of range! \n Input must be between 0 and " + (size - 1) + ".");
		}
	}

	public void deleteValue(Object value) throws Exception {
		int i = getIndex(value);
		if (i == -1) {
			throw new Exception("\n (" + value + ") is NOT in Linked List!");
		}
		if (i == 0) {
			tail.next.prev = null;
			tail = tail.next;
		} else if (i == (size - 1)) {
			head.prev.next = null;
			head = head.prev;
		} else {
			node x = getNode(i);
			x.prev.next = x.next;
			x.next.prev = x.prev;
			for (int j = 0; j < i; j++) {
				x = x.prev;
			}
			tail = x;
		}
		size--;
	}

	private node getNode(int i) {
		node x = tail;
		int j = 0;
		while (x != null) {
			if (i == j) {
				return x;
			} else {
				x = x.next;
			}
			j++;
		}
		return null;
	}
}
