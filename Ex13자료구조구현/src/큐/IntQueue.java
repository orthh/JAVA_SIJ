package 큐;

public class IntQueue {
	// 필드
	private int[] que;        // 큐용 배열
	private int capacity;     // 큐의 용량
	private int front;        // 맨 앞의 요소 커서
	private int rear;         // 맨 뒤의 요소 커서
	private int num;          // 현재 데이터 개수

	// 실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
			
		}
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {
			
		}
	}
	
	// 생성자
	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];   // 큐 본체용 배열을 생성
		}catch(OutOfMemoryError e) {   // 생성할 수 없음
			capacity = 0;
		}
	}
	// 인큐(데이터 삽입)
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= capacity) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x; // 리어 증가
		num ++;
		if(rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	// 디큐(데이터 삭제)
	public int deque() throws EmptyIntQueueException {
		if( num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++]; // 빼고 front 값 증가
		num --;
		if(front == capacity) {
			front= 0 ;
		}
		return x;
	}
	
	// peek : 맨 앞(첫번째)에 데이터 확인
	public int peek() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	// clear : 큐 비우기
	public void clear() {
		num = front = rear = 0;
	}
	// indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	// 큐의 용량을 반환
	public int getCapacity() {
		return capacity;
	}
	
	// size : 쌓여있는 데이터 개수
	public int size() {
		return num;
	}
	
	// isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// isFull : 큐가 가득차있는지 확인
	public boolean isFull() {
		return num >= capacity;
	}
	
	// dump : 큐안에 데이터를 front ~ rear 순서로 출력
	public void dump() {
		if(num <=0 ) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(i+front) % capacity] + " ");
			}
			System.out.println();
		}
	}
	
}
