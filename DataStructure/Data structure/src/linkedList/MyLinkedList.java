package linkedList;

import nodeRemove.Node;

public class MyLinkedList<E>{

	Node<E> head;	// 연결리스트의 첫번째 노드를 가리킴.
	int size = 0;
	
	public MyLinkedList() {
		head = null;
		size = 0;
	}
	
	public int searchE(E data) {
		Node h = head;
		for(int i = 0; i <=size; i++) {
			if(h.getItem().compareTo(data) == 0) {
				return i;
			}
			h = h.getNext();
		}
		return -1;	//실패한 경우
	}

	public void insertA(E newItem, Node n) {
		n.setNext(new Node(newItem, n.getNext()));
		size++;
	}
	
	public void insertB(E newItem, int index) {
		Node h= head;
		Node temp = head;
		for(int i = 1; i < index; i ++) {
			h = h.getNext();
		}
		temp = h;
		h = new Node(newItem, h);
		h.setItem(temp);
		size++;
			
	}
	
	public boolean insert(int index, E item) {
		if(index > size || index < 0) {
			return false;
		}
		Node h = head;
		
		for(int i = 0; i <= size; i++) {
			if(index == i) {
				h.setNext(new Node<E>(item, h));
				size++;
			}
			h = h.getNext();
		}
	}
	
}
