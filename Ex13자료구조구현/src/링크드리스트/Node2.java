package 링크드리스트;

public class Node2 {
	
	private String data; // 실제 데이터
	private Node2 next;    // 다음 노드의 참조값(주소값)
	
	public Node2(String data, Node2 next) {
		this.data = data;
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}
	
	
	
	
}
