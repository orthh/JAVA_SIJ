package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		//num2가 num1의 약수인지 아닌지?
		//num1이 num2의 배수인지 아닌지?
		//num2가 num1을 나누어 떨어지게 하는지?
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println("--------구분선--------");
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		System.out.println("--------구분선--------");
		int num = 20;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		getDivisor(num);
		
		System.out.println("--------구분선--------");
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2);
		
		System.out.println("--------구분선--------");
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
		
	}
	//1.isDivisor(a,b) : b가 a의 약수인지 아닌지 확인 약수면true, 아니면 false
	public static boolean isDivisor(int num1, int num2) {
		//num2 가 num1 의 약수인지 ? 
		//약수라면 true 약수가 아니면 false
		//return num1 % num2 == 0 ? true : false;
		if(num1 % num2 == 0 ) {
			return true;
		}else {
			return false;
		}
		
		//is라는 키워드가 붙은 메서드는 결과값이(리턴타입이) boolean
	}
	
	//2.getDivisor(n) : 매개변수 num1 의 모든 약수 출력
	public static void getDivisor(int num1) {
		System.out.print(num1 + "의 약수 : ");
		for(int i = 1; i <= num1; i++) {
			//i가 num1의 약수인지 아닌지?
			if(isDivisor(num1,i)) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
	}
	
	//3.getSumOfDivisors(n) : 약수의합 반환하는 메서드
	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for(int i = 1; i <= num / 2; i++) {
			if(isDivisor(num,i)) {
				sum += i;
			}
		}

		return sum + num;
	}
	
	//4. 완전수인지 아닌지 판단해주는 isPerfectNumber()
	//완전수란?
	// : 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
	// 6 : 1 2 3 6 => 6 (완전수)
	//10 : 1 2 5 10 => 8(완전수가 아님)
	//28 : 1 2 4 7 14 => 28 (완전수)
	
	public static boolean isPerfectNumber(int num) {
		if(num  == getSumOfDivisors(num) - num) {
			return true;
		}else {
			return false;
		}

	}
	
	
	//5.getPerfectNumber : startValue~endValue까지의 숫자중
	// 완전수를 출력
	public static void getPerfectNumber(int s,int e) {
		System.out.print(s + "~" + e + "까지의 완전수 : ");
		for(int i = s; i<=e; i++) {
			if(isPerfectNumber(i)) {
				System.out.print(i + "  ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
