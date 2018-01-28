package Aufgabe2;

public class DLList {

	public Node firstNode;
	private Node currentNode;

	public DLList() {
	}

	public boolean isEmpty() {

		return firstNode == null;

	}

	// prints the content for each element
	public void display() {

		if (!isEmpty()) {
			for (Node n = firstNode; n != null; n = n.getNextNode()) {
				System.out.println(n.getValue());
			}
		}
		
		else 
		{
			System.out.println("DLList is empty!");
		}
	}

	// adds element at the given position
	public void add(int pos, String content) {

		int i = 0;

		if (isEmpty()) {
			firstNode = new Node(content);
			currentNode = firstNode;
		} 
		
		else {

			currentNode = firstNode;
			while (currentNode != null && i != pos) {
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

	// adds element
	public void add(String content) {

		if (firstNode == null) {
			firstNode = new Node(content);
			currentNode = firstNode;
		} 
		
		else {

			currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(new Node(content));
			currentNode.getNextNode().setPrevNode(currentNode);
			currentNode = currentNode.getNextNode();
		}
	}

	// removes specific element
	public void remove(String content) {

		boolean deleted = false;
		currentNode = firstNode;

		while (currentNode != null && deleted != true) {
			if (currentNode.getValue().equals(content)) {
				currentNode.getNextNode()
						.setPrevNode(currentNode.getPrevNode());
				currentNode.getPrevNode()
						.setNextNode(currentNode.getNextNode());
				currentNode = null;
				deleted = true;
			} 
			
			else {
				currentNode = currentNode.getNextNode();
			}
		}

		if (deleted == false) {
			System.out.println("element not found");
		}
	}

	// removes the head
	public void removeFirst() {

		if (firstNode != null && firstNode.getNextNode() != null) {
			firstNode.getNextNode().setPrevNode(null);
			firstNode = firstNode.getNextNode();
		} 
		
		else {
			firstNode = null;
		}

	}

	// removes the last element
	public void removeLast() {

		currentNode = firstNode;
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}

		if (currentNode.getPrevNode() != null) {
			currentNode.getPrevNode().setNextNode(null);
			currentNode.setPrevNode(null);
			currentNode = currentNode.getPrevNode();
		} 
		
		else {
			firstNode = null;
		}
	}

	// deletes all elements
	public void clear() {

		while (firstNode != null) {
			removeLast();
		}

	}

	// returns the head-node
	public String getFirst() {

		if (firstNode != null) {
			return firstNode.getValue();
		}
		return "null";
	}

	// returns the last element
	public String getLast() {

		if (firstNode == null) {
			return "null";
		}
		currentNode = firstNode;
		
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		
		return currentNode.getValue();
	}

	// returns content of a specific element
	public String get(int pos) {

		int i = 0;
		currentNode = firstNode;
		
		while (currentNode != null) {
			
			if (i != pos) {
				currentNode = currentNode.getNextNode();
				i++;
			} 
			
			else {
				return currentNode.getValue();
			}
		}
		return "null";
	}

	// concatenates two lists
	public void concat(DLList mList) {

		if (firstNode == null) {
			firstNode = mList.firstNode;
		} 
		
		else {
			currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(mList.firstNode);
		}
	}

	// returns the position of a searched element
	public int find(String content) {

		int pos = 0;
		currentNode = firstNode;
		
		while (currentNode != null) {
			if (currentNode.getValue().equals(content)) {
				return pos;
			}

			currentNode = currentNode.getNextNode();
			pos++;
		}
		return -1;
	}

	// checks if a node with given content exists
	public boolean contains(String content) {
		if (find(content) == -1) {
			return false;
		} 
		
		else
			return true;
	}

	// returns the lists size
	public int size() {

		int currentSize = 0;
		if (firstNode == null) {
			return currentSize;
		}
		for (Node n =currentNode ;n!= null; n = n.getNextNode()) {
			currentNode.getNextNode();
			currentSize++;
		}

		return currentSize;
	}

}