package Aufgabe2;

public class Node {
	
	private String data;
	private Node prevNode;
	private Node nextNode;
	
	public Node(String mData) {		
		data = mData;	
	}
	
	public String toString() {
		return data;
	}
	
	public void setPrevNode(Node node) {
		
		prevNode = node;
	}
	
	public void setNextNode(Node node) {
		
		nextNode = node;
	}
	
	public Node getPrevNode() {
		
		return prevNode;		
	}
	
	public Node getNextNode() {
		
		return nextNode;		
	}
	
	public String getValue() {
		return data;
	}
}