package timeattack;

public class Q13 {

	public static void main(String[] args) {
		
		String score =  "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] arr = score.split(",");
		
		String[] group = {"A","B","C","D","F"};
		int[] result = new int[5];
		
		for(String item : arr) {
			switch (item) {
			case "A":
				result[0] ++;
				break;
			case "B":
				result[1] ++;
				break;
			case "C":
				result[2] ++;
				break;
			case "D":
				result[3] ++;
				break;
			case "F":
				result[4] ++;
				break;

			}
		}
		for(int i=0; i<group.length; i++) {
			System.out.println(group[i] + " : " + result[i] + "명 ");
		}

		

	}

}
