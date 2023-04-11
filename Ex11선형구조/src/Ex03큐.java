import java.util.LinkedList;
import java.util.Queue;

public class Ex03큐 {

	public static void main(String[] args) {
		
		// 메모리 공간을 효율적으로 활용하기 위해 
		// 큐는 링크드리스트를 활용한다!
		Queue<Integer> q = new LinkedList<Integer>();
		
		// 2. 큐에 요소 삽입
		q.add(1);
		q.add(2);
		q.add(3);
		
		// 3. 가장 먼저 나갈 데이터를 반환
		System.out.println(q.peek()); //1

		// 4. 요소 삭제
		System.out.println(q.remove()); //1
		
		// 다음 데이터 확인
		System.out.println(q.peek()); //2
	}

}
