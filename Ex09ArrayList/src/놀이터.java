import java.util.ArrayList;
import java.util.Scanner;

public class 놀이터 {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>(1);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(System.identityHashCode(myList));
	

		System.out.println(x);
		x.add(1);
		System.out.println(x);
		x.add(1);
		System.out.println(x);

	}

}
