
public class Ex03배열선언과선언 {

	public static void main(String[] args) {
		
		//1. 배열 생성 + 배열의 크기(메모리에 몇개의 연속된 공간을 할당해줄것인지!)
		//레퍼런스 변수까지 선언해야지만 배열값에 접근 가능!
		int[] arr = new int[5];  //추천!
		int arr2[] = new int[5]; //이거도 가능!
		int arrA[] = {};
		
		int test1[] = {1,2,3};
		int test2[] = {1,2,3};
		
		System.out.println(test1.equals(test2));
		
		System.out.println(test1 == test2);
		
		
		//2. 배열에 값 저장
		arr[0] = 4; //arr이 가리키고 있는 배열의 0번 인덱스에 값 할당
		arr[1] = 20; //1번 인덱스에 값 저장;
		arr[2] = 12;
		arr[3] = 34;
		arr[4] = 40;
		//arr[5] = 30; //프로그램을 실행하기 전까지는 arr의 크기를 알 수가 없음.
		             //자바의 동적로딩 이라는 특징 때문 new int[5]실행하기전
		             //까지는 크기를 알수가 없기 떄문에 에러표시가 나오니 않음.
		//arr[5] = 10; //Index 5 out of bounds for length 5 배열초과에러
		int cnt = 0;
		for(int item : arr) {
			System.out.println("[" + cnt + "]" + " : " +item);
			cnt++;
		}
		System.out.println("--------------------------------");
		
		//3.배열에 저장된 값 출력하기
		System.out.println(arr[2]);
		
		//4. 0~4 모든 값 출력
		System.out.println(arr); //배열의 참조값 (heap 영역에 저장된
		                         //배열 찾아갈때)
		//참조값을 저장하고 있는 변수 -> 레퍼런스(참조) 변수
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------");
		int cnt2 = 0;
		while(cnt2<5) {
			System.out.println(arr[cnt2]);
			cnt2++;
		}
		System.out.println("--------------------------------");
		//5. 배열에 저장되어야 하는 값을 이미 알고 있을때
		int[] arr3 = {4,2,5,7,10};
		//정수형 데이터가 저장될 수 있는 5칸짜리 배열 생성하고 초기화!
		System.out.println(arr3[0]);
		
		//참조값(주소값) 할당
		int[] intArray = new int[5];
		int[] myArray = intArray;
		System.out.println(intArray == myArray); //true
		intArray[1] = 2;
		System.out.println(intArray[1]); //2
		myArray[1] = 6;
		System.out.println(intArray[1]); //6
		
		//배열의 크기
		
		
		
	}

}
