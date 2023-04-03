package last;

import java.util.Arrays;

public class Q13_scoreCount {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] scoreArr = score.split(",");
		String[] scoreName = {"A","B","C","D","F"};
		int[] scoreCount = new int[scoreName.length];

		
		//ASCII 코드로 풀이
		int[] scoreCount2 = new int[scoreName.length + 1];
		char[] scoreName2 = new char[(int)'F' - (int)'A' + 1];
		for(int i=0; i< scoreName2.length; i++) {
			scoreName2[i] = (char)('A' + i);
		}
		for(String item : scoreArr) {
			scoreCount2[(int)item.charAt(0) - (int)'A']++;
		}

		//
		for(String item : scoreArr) {
			switch (item) {
			case "A":
				scoreCount[0] ++;
				break;
			case "B":
				scoreCount[1] ++;
				break;

			case "C":
				scoreCount[2] ++;
				break;

			case "D":
				scoreCount[3] ++;
				break;

			case "F":
				scoreCount[4] ++;
				break;

			 //no default
			}
		}
		
		for(int i=0; i<scoreCount.length; i++) {
			System.out.println(scoreName[i] + " : " + scoreCount[i] + "명");
		}
		System.out.println("----------------구분선-----------------");
		//ASCII 
		for(int i=0; i<scoreCount2.length; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(scoreName2[i] + " : " + scoreCount2[i] + "명");
		}
	}

}
