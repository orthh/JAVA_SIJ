package 큐;

public class IntQueueYJ {
	private int[] queue; //큐용 배열
	private int capacity; //큐 용량
	private int front; //맨 앞의 요소 커서
	private int rear; //맨 뒤의 요소 커서
	private int num;  //현재 데이터 개수
	
	//생성자
	public IntQueueYJ(int maxlen) { //최대 크기 지정해서 큐 생성
		num = front = rear = 0; //생성할 때는 데이터 개수와 커서는 0을 지정
		capacity = maxlen; //지정한 크기로 스택==큐 용량 설정
		queue = new int[capacity]; //지정한 크기의 정수형 배열 생성
	}
	
	//데이터 삽입 (인큐) -> 맨 뒤를 가리키는 포인터의 위치가 변해야 함
	public int enque(int x) { //넣을 값 지정
		
		if(num>=capacity) { //용량이 가득 찬 경우
			System.out.println("큐가 가득찼습니다");
			return -1; //값 삽입이 불가능하도록 메서드 나감
		}
		
		queue[rear++] = x; //맨 뒤를 가리키는 포인터가 가리키는 위치에 값 넣은 후 포인터 1증가
		                   //다음 숫자는 다음 위치에 들어가야 하므로!
		num++; //데이터 개수 1 증가
		if(rear==capacity) { //맨 뒤를 가리키는 포인터가 배열의 범위를 넘어간 경우
			rear = 0; //0으로 포인터 수정 (다음데이터는 0번부터 들어갈 수 있도록)
		}
		return x;  //넣은 값 반환
	}
	
	//데이터 삭제 (디큐) -> 맨 앞을 가리키는 포인터의 위치가 변해야 함
	public int deque() {
		
		if(num<=0) { //큐가 비어있을 때
			System.out.println("큐가 비었습니다");
			return -1; //값 삭제가 불가능하도록 메서드 나감
		}
		int x = queue[front++]; //맨 앞을 가리키는 포인터가 가리키는 위치의 값을 변수에 저장 후 포인터 1 증가
		num--; //데이터 개수 1 감스
		if(front == capacity) { //맨 앞을 가리키는 포인터가 배열의 범위를 벗어난 경우
			front = 0; //0으로 포인터 수정 (다음데이터는 0번부터 삭제될 수 있도록)
		}
		return x; //삭제 된 값 반환
	}
	
	public int peek() { //맨 첫번째 값 확인
		return queue[front]; //맨 앞을 가리키는 포인터가 가리키는 위치의 값 반환
	}
	
	public void clear() { //큐 비우기
		num = front = rear = 0; // num 이 0보다 작거나 같으면 큐가 비어있다고 생각함
		                        //초기 상태로 값 초기화
	}
	
	public int indexOf(int x) { //특정 값 위치 찾기
		for(int i = 0; i<num; i++) { //top 위치부터 bottom 까지 차례대로 찾기
			//if front 2 : 2 3 4 0 1
			int idx = (i+front) % capacity; //실제 데이터가 들어간 인덱스 순서 구하기
			if(queue[idx]==x) {
				return idx;
			}
		}
		return -1; //찾는 값이 없으면 -1 반환
	}
	
	public int size() { //큐에 쌓여있는 데이터 개수 반환
		return num;
	}
	
	public boolean isEmpty() { //큐가 비어있는지 확인하기
		return num <= 0; //데이터 개수가 0보다 같거나 작은값 가지고 있는 경우
	}
	
	public boolean isFull() { //큐가 가득 차있는지 확인하기
		return num >= capacity; //데이터 개수가 용량보다 같거나 큰 값을 가진 경우
	}
	
	public void dump() { //큐안의 모든 데이터를 front -> rear 순서로 출력
		if(num <= 0) { //스택안이 비어잇는 경우
			System.out.println("큐가 비어 있습니다.");
		}else {
			for(int i=0; i< num; i++) {
				System.out.print(queue[(i+front)%capacity]+ " ");
			}
			System.out.println();
		}
	}
}
