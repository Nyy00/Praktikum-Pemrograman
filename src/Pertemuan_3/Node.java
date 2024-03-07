package Pertemuan_3;

public class Node {
	private double data;
	private Node next;

	/* inisialisasi atribut node */
	
	public Node (double data) {
		this.data = data;
	}

	public double getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}