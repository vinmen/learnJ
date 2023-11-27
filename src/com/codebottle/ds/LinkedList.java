package com.codebottle.ds;

public class LinkedList<T> {

	private LinkedList<T> head = null;
	private LinkedList<T> next = null;
	private T data;

	public LinkedList() {
		super();
	}

	public void append(T input) {
		LinkedList<T> temp = new LinkedList<T>();
		temp.data = input;

		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	public boolean find(T input) {
		if (size() > 0) {
			LinkedList<T> list = head;
			while (list.next != null) {
				if (list.data == input) {
					return true;
				}
				list = list.next;
			}
		}
		return false;
	}

	public void delete(T input) {
		if (size() > 0) {
			LinkedList<T> list = head;
			LinkedList<T> previous = null;
			while (list.next != null) {
				if (list.data == input) {
					if (previous != null) {
						previous.next = list.next;
					} else {
						head = null;
					}
					return;
				}
				previous = list;
				list = list.next;
			}
		}
		return;
	}

	public void insertLast(T input) {
		LinkedList<T> temp = new LinkedList<T>();
		temp.data = input;

		if (head == null) {
			head = temp;
		} else {
			LinkedList<T> list = head;
			while (list.next != null) {
				list = list.next;
			}
			list.next = temp;
		}
	}

	public void print() {
		if (size() == 0) {
			System.out.println("Empty List");
			return;
		}
		LinkedList<T> list = head;
		while (list.next != null) {
			System.out.println(list.data);
			list = list.next;
		}
	}

	public int size() {
		int index = 0;
		if (head != null) {
			LinkedList<T> list = head;
			while (list.next != null) {
				index++;
				list = list.next;
			}
		}
		return index;
	}

}
