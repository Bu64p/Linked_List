package test;

import linkedList.linkedList;

public class linkedList_tester {

	public static void main(String[] args) throws Exception {
		linkedList myLinkedList = new linkedList();
		myLinkedList.add("a");
		myLinkedList.add("b");
		myLinkedList.add("c");
		myLinkedList.add("d");
		myLinkedList.add("e");
		myLinkedList.add("f");
		
		for (int i = 0; i < myLinkedList.getSize(); i++) {
			System.out.println(myLinkedList.getValue(i));
		}
		
		myLinkedList.deleteIndex(4);
		System.out.println(myLinkedList.getIndex("f"));
		myLinkedList.deleteValue("a");
		System.out.println(myLinkedList.getIndex("f"));
		
		
		for (int i = 0; i < myLinkedList.getSize(); i++) {
			System.out.println(myLinkedList.getValue(i));
		}
		
		// and also many more!
	}

}
