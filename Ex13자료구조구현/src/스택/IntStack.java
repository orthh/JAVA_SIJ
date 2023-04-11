package 스택;

public class IntStack {

	// 필드
	private int[] stk; // 값을 저장할 배열
	private int capacity; // 스택의 용량 ( 최대 몇개의 데이터가 저장될 수 있는지 )
	private int ptr; // 스택 포인터 ( 현재까지 쌓여 있는 데이터의 수 나타냄 )
						// 비어있으면 -> 0 / 가득 차있으면 -> capacity

	// 생성자
	public IntStack(int maxlen) { // 스택을 생성할 때 크기를 지정할 수 있도록!
		stk = new int[maxlen]; // 지정된 크기의 정수형 배열 생성 -> 참조값(주소값)을 stk 변수에 저장
		capacity = maxlen; // 지정된 크기로 스택 용량 설정
		ptr = 0; // 최초로 스택이 생성되었을 때는 비어있음!
	}

	// 메서드(getter, setter, toString)
	// 데이터 삽입 : 위(뒤)쪽에서만 삽입 가능
	public int push(int x) { // 원하는 값(x) 를 스택에 삽입, 0번 인덱스부터 차근차근 채우기
		stk[ptr++] = x; // 포인터가 가리키는 위치에 값을 삽입한 후 포인터를 1증가
						// ptr++ : 데이터 개수 카운팅, 그 다음 데이터는 그 다음칸에 들어갈 수 있도록 함.

		return x; // 삽입된 데이터 반환
	}

	// 데이터 꺼내기 : 위(뒤)쪽에서만 꺼내는 작업 가능
	public int pop() {
		return stk[--ptr]; // 포인터가 가르키는 값 -1 먼저 시킨 후 데이터 반환
	}

	// 제일 위에 있는 데이터 확인
	public int peek() {
		return stk[ptr - 1]; // ptr(현재까지 데이터 수) 바꾸면 안됨
	}

	// 스택 비우기
	public void clear() { // 모든 데이터 전체 삭제
		ptr = 0; // 포인터를 0으로 해서 전체가 삭제된것처럼 보이게함(다시 할당)
	}

	// 특정 값 몇 번 인덱스에 있는지 찾기 : TOP(위에서부터)!!
	// 스택에서 데이터 찾을 때에는 top 부터 검색
	public int indexOf(int x) { // x : 찾고 싶은 값
		for (int i = ptr - 1; i >= 0; i--) { // 제일 위에 있는 데이터~ 0번데이터 까지 1칸씩 내려오면서 탐색
			if (stk[i] == x) { // 찾고자 하는 데이터와 같은 값을 발견했을 때
				return i; // 그 데이터가 있는 인덱스 반환
			}
		}
		return -1; // 찾고자하는 값이 스택에 없는경우에만 -1 반환
	}

	// 스택에 쌓여있는 총 데이터 개수 반환
	public int size() {
		return ptr;
	}

	// 스택이 현재 비어있는지 확인
	public boolean isEmpty() {
		return ptr == 0; // ptr이 0이면(데이터가 없으면) -> true 반환 / 0이 아니면 false반환
	}

	// 스택이 가득 차있는지 확인
	public boolean isFull() {
		return ptr == capacity; // ptr 이 capacity와 같으면 (가득차있으면) -> true 반환
								// capacity 와 다른경우 -> false반환
	}

	// 스택안에 있는 모든 데이터 출력
	public void dump() {
		if (ptr == 0) { // 스택이 비어있는 경우
			System.out.println("스택이 비어있습니다!");
		}else {
			for(int i=0; i<ptr; i++) { // 0번 인덱스부터 마지막 데이터가 있는 자리까지~!
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

}
