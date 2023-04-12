package 링크드리스트;

public class Node {
	
	private String data; //실제 데이터
	private Node next; //다음 노드의 주소값
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
