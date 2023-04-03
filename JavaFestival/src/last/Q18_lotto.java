package last;

import java.util.Random;

public class Q18_lotto {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] answer = new int[6];
		
		for(int i=0; i<answer.length; i++) {
			int num;
			while(true) {
				num = rd.nextInt(45) + 1;
			    if(!isDuplicate(answer,num)) {
			    	answer[i] = num;
					break;
				}

				
			}
			
		}
		
		for(int item: answer) {
			System.out.println("행운의 숫자 : " + item);
		}

		
	}
	
	public static boolean isDuplicate(int[] arr,int target) {
		for(int item : arr) {
			if(item == target) {
				return true;
			}
		}
		
		return false;
	}

}
