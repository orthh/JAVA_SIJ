package 링크드리스트;

public class LinkList {
	
	private Node head; //head 포인터 (첫번째 시작점의 주소값 저장할 노드)
	private Node crnt; //선택 포인터 (검색에 사용)
	
	public LinkList() {
		head = crnt = null; //초기상태
	}
	
	//노드 검색
	public String search(String input) {
		Node ptr = head; // 현재 스캔중인 노드
		
		while(ptr != null) {
			System.out.println("이동");
			if(ptr.getData().equals(input)) { //같은 데이터를 찾은 경우
				crnt = ptr; //선택 포인터 이동
				return ptr.getData();
			}
			ptr = ptr.getNext(); //못찾은 경우 다음 노드로 이동
		}
		
		return null; //검색 실패
	}
	
	//머리에 노드 삽입
	public void addFirst(String input) {
		Node ptr = head; 
		head = crnt = new Node(input, ptr);//헤드가 가리키고 있는 주소를 주소부에 저장
		                                   //헤드가 지금 생성된 노드를 가리키게 변경
	}
	
	//꼬리에 노드 삽입
	public void addLast(String input) {
		if(head == null) { //비어있으면 addFirst로 호출
			addFirst(input);
		}else {
			Node ptr = head;
			while(ptr.getNext()!= null) { // 헤드부터 주소부가 비어잇는 노드 찾음
				ptr = ptr.getNext();
			}
			crnt = new Node(input, null); //새 노드 생성 후 포인터 수정
			ptr.setNext(crnt); //원래 마지막이었던 노드 주소부에 새 노드 주소 저장
		}
	}
	
	// 머리 노드 삭제
	public void removeFirst() {
		if(head!=null) { //리스트가 비어있지 않을 경우
			head = crnt = head.getNext(); // 첫번째 노드의 주소부로 헤드 수정
		}
	}
	
	// 꼬리 노드 삭제
	public void removeLast() {
		if(head!=null) { //리스트가 비어있지 않을 경우
			if(head.getNext()==null) { //하나밖에 없을경우
				removeFirst(); //removeFirst 대신 호출
			}else {
				Node ptr = head; //스캔중인 노드
				Node pre = head; //스캔 중인 노드의 앞쪽 노드
				
				while(ptr.getNext()!=null) { //뒤에 데이터가 없는 노드 찾을 때까지
					pre = ptr;
					ptr = ptr.getNext(); //뒤쪽으로 이동
				}
				pre.setNext(null); //마지막 노드의 주소 지움
				crnt = pre; //선택 포인터 변경
			}
		}
	}
	
	//특정 노드 삭제
	public void remove(Node p) {
		if(head!=null) { //리스트가 비어있지 않을 때
			if(p==head) { //찾는 노드가 헤드이면
				removeFirst(); //removeFirst 사용
			}else {
				Node ptr = head;

				while(ptr.getNext() != p) { //같은 노드 찾지 못함
					ptr = ptr.getNext(); //그다음 노드 주소 찾기
					if(ptr == null) { //그다음 노드가 없으면 메서드 끝내기
						return ;
					}
				}
				ptr.setNext(p.getNext()); //한 주소부를 건너뛰도록 저장
				crnt = ptr;
			}
		}
	}
	
	//선택 노드 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	//모든 노드 삭제
	public void clear() {
		while(head!=null) {
			removeFirst();
		}
		crnt = null;
	}
	
	//선택 노드 출력
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("선택한 노드가 없습니다.");
		}else {
			System.out.println(crnt.getData());
		}
	}
	//모든 노드 출력
	public void dump() {
		Node ptr = head;
		
		while(ptr != null) {
			System.out.print(ptr.getData()+" ");
			ptr = ptr.getNext();
		}
	}
}

