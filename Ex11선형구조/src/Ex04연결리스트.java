import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1);   // 가장 앞에 데이터 추가 0
		list.addLast(2);    // 가장 뒤에 데이터 추가 1
		list.add(1, 5);
		
		list.forEach(item -> {
			System.out.println(item);
		});
		
		for(int item : list) {
			System.out.println(item);
		}
		
		System.out.println(list.get(0));    //1
		System.out.println(list.get(1));    //5
		
		list.removeFirst(); // 가장 앞에 데이터 삭제
		System.out.println(list.size());    //2
		list.removeLast();  // 가장 뒤에 데이터 삭제
		System.out.println(list.size());    //1
		list.remove(0);   // 0번 인덱스 삭제  0번부터 시작
		//list.remove()   // 0번 데이터 삭제
		
		list.clear(); //모든 값 제거
		
		
	}

}
