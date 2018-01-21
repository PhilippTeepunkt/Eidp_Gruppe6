package Aufgabe2;

public class DLList {
	
	public Node firstNode;
	private Node currentNode;
	
	public DLList() {
		
		
		
	}
	
	public boolean isEmpty() {
		
		if(firstNode==null) {
			return true;
		}
		return false;
		
	}
	
	public void display() {
		
		if(firstNode!=null) {
			System.out.println(firstNode.getValue());
			currentNode = firstNode.getNextNode();
			while(currentNode!=null) {
				
				System.out.println(currentNode.getValue());
				currentNode = currentNode.getNextNode();
			}
		}
		else {
			System.out.println("DLList is empty!");
		}
	}
	
	public void add(int pos, String content) {
		
		int i = 0;
		
		if(isEmpty()) {
			firstNode = new Node(content);
			currentNode=firstNode;
		}
		else {
			
			currentNode = firstNode;
			while(currentNode!=null&&i!=pos) {
				currentNode = currentNode.getNextNode();	
				i++;
			}
			
			Node temp = new Node(content);
			currentNode.getPrevNode().setNextNode(temp);
			currentNode.setPrevNode(temp);
			temp.setPrevNode(currentNode.getPrevNode());
			temp.setNextNode(currentNode);
			
		}
	}
	
	public void add(String content) {
		
		if(firstNode==null) {
			firstNode = new Node(content);
			currentNode=firstNode;
		}
		else {
			
			currentNode = firstNode;
			while(currentNode.getNextNode()!=null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(new Node(content));
			currentNode.getNextNode().setPrevNode(currentNode);
			currentNode = currentNode.getNextNode();	
		}
	}
	
	public void remove(String content) {
		
		boolean deleted = false;
		currentNode = firstNode;
		
		while(currentNode!=null&&deleted!=true) {
			if(currentNode.getValue().equals(content)) {
				currentNode.getNextNode().setPrevNode(currentNode.getPrevNode());
				currentNode.getPrevNode().setNextNode(currentNode.getNextNode());
				currentNode = null;
				deleted = true;
			}
			else {
				currentNode = currentNode.getNextNode();
			}
		}
		
		if(deleted==false) {
			System.out.println("element not found");
		}
	}
	
	public void removeFirst() {
		
		if(firstNode!=null&&firstNode.getNextNode()!=null) {
			firstNode.getNextNode().setPrevNode(null);
			firstNode = firstNode.getNextNode();
		}
		else {
			firstNode = null;
		}
		
	}
	
	public void removeLast() {
		
		currentNode = firstNode;
		while(currentNode.getNextNode()!=null) {
			currentNode = currentNode.getNextNode();
		}
		
		if(currentNode.getPrevNode()!=null) {
			currentNode.getPrevNode().setNextNode(null);
			currentNode.setPrevNode(null);
			currentNode = currentNode.getPrevNode();
		}
		else 
		{firstNode = null;}
	}
	
	public void clear() {
		
		while(firstNode!=null) {
			removeLast();
		}
		
	}
	
	public String getFirst() {
		
		if(firstNode!=null) {
			return firstNode.getValue();
		}
		return "null";
	}
	
	public String getLast() {
		
		if(firstNode == null) {
			return "null";
		}
		currentNode = firstNode;
		while(currentNode.getNextNode()!=null) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode.getValue();
		
	}
	
	public String get(int pos) {
		
		int i = 0;
		currentNode = firstNode;
		while(currentNode!=null) {
			if(i!=pos) {
				currentNode = currentNode.getNextNode();
				i++;
			}
			else {
				return currentNode.getValue();
			}
		} 
		return "null";
	}
	
	public void concat(DLList mList) {
		
		if(firstNode == null) {
			firstNode = mList.firstNode;
		}
		else {
			currentNode = firstNode;
			while(currentNode.getNextNode()!=null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(mList.firstNode);
		}			
	}
	
	public int find(String content) {
		
		int pos = 0;
		currentNode = firstNode;
		while(currentNode!=null) {
			if(currentNode.getValue().equals(content)){
				return pos;
			}
			
			currentNode = currentNode.getNextNode();
			pos++;
		}
		return -1;
		
	}
	
	public boolean contains(String content) {
		if(find(content)==-1) {
			return false;
		}
		else return true;
	}
	
	public int size() {
		
		int currentSize=0;		
		if(firstNode==null) {
			return currentSize;
		}
		while(currentNode!=null){
			currentNode.getNextNode();
			currentSize++;}
		
		return currentSize;
	}

}