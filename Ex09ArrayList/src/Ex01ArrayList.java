import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. ArrayList 생성 -> heap 영역
		// -> ArrayList 생성된 참조값 저장 -> 참조변수(레퍼런스 변수) 선언
		ArrayList<String> al = new ArrayList<String>();
		// ArrayList<E>(초기크기 -> 생략가능 default10);

		// 2. 요소 삽입
		al.add("Hello"); // al의 0번
		al.add("Hi"); // al의 1번
		al.add("Java"); // al의 2번

		// 3. 요소 개수
		System.out.println(al.size()); // 3
		System.out.println("-----------구분선------------");
		// 4. 요소 중간 삽입
		al.add(1, "Python");
		System.out.println(al.size()); // 4

		// 5. 특정 인덱스에 있는 요소 알아내기
		System.out.println(al.get(0)); // Hello
		System.out.println(al.get(1)); // Python
		System.out.println(al.get(2)); // Hi
		System.out.println(al.get(3)); // Java
//		System.out.println(al.get(4));  //out of bounds error

		System.out.println("-----------구분선------------");
		// for문
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "번 인덱스 : " + al.get(i));
		}
		System.out.println("-----------구분선------------");
		System.out.println("확장된 for 문");
		// 확장된for문
		for(String item : al) {
			System.out.println(item);
		}

		// 내장 forEach문
		System.out.println("-----------구분선------------");
		al.forEach(item -> {
			System.out.println("test");
			System.out.println("item : " + item);
			});

		// 6. 특정 요소 삭제
		System.out.println("-----------구분선------------");
		System.out.println("삭제");
		String a = al.remove(2); // 삭제한 요소 확인
		System.out.println(a); //Hi
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "번 인덱스 : " + al.get(i));
		}
		
		//al.remove(3); //out of bounds error
		
		//7. 모든 요소 삭제
		al.clear();
		System.out.println(al.size()); //0
		
		

	}

}
