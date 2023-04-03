package second;

public class Q3_ScoreCount {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] scoreArr = score.split(",");
		String[] scoreName = {"A","B","C","D","F"};
		int[] scoreCount = new int[scoreName.length];
		
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

	}

}
