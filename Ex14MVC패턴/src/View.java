import java.util.Scanner;

public class View {
	
	public static void main(String[] args) {
		// View 역할 수행 : 사용자 인터페이스 (화면, 선택할 수 있게 하는 기능)
		
		// 재생, 정지, 다음곡, 이전곡, 종료
		
		Scanner sc = new Scanner(System.in);
		
		// Controller의 기능에 접근할 수 있도록 객체 생성!
		Controller c = new Controller();
		
		int menu; // 사용자가 선택한 메뉴
		
		

        
System.out.println("                        o                             .oPYo. 8                            ");
System.out.println("                                                      8    8 8                            ");
System.out.println("odYo. .oPYo. o   o   o o8 .oPYo. .oPYo. odYo. .oPYo. o8YooP' 8 .oPYo. o    o .oPYo. oPYo. ");
System.out.println("8' `8 8oooo8 Y. .P. .P  8 8oooo8 .oooo8 8' `8 Yb..    8      8 .oooo8 8    8 8oooo8 8  `' ");
System.out.println("8   8 8.     `b.d'b.d'  8 8.     8    8 8   8   'Yb.  8      8 8    8 8    8 8.     8     ");
System.out.println("8   8 `Yooo'  `Y' `Y'   8 `Yooo' `YooP8 8   8 `YooP'  8      8 `YooP8 `YooP8 `Yooo' 8     ");
System.out.println("..::..:.....:::..::..:::8 :.....::.....:..::..:.....::..:::::..:.....::....8 :.....:..::::");
System.out.println(":::::::::::::::::::::::oP ::::::::::::::::::::::::::::::::::::::::::::::ooP'.:::::::::::::");
System.out.println(":::::::::::::::::::::::..:::::::::::::::::::::::::::::::::::::::::::::::...:::::::::::::::");


		while(true) {
			do {
				System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
				menu = sc.nextInt();
			} while (menu <=0 || menu >=6);
			
			
			if(menu == 1) {
				// index가 가리키고 있는 위치에 음악을 재생
				c.play();
			}else if(menu == 2) {
				// 정지
				c.stop();
			}else if(menu == 3) {
				c.next();
			}else if(menu == 4) {
				c.pre();
			}else { // menu == 5
				break;
			}
		}
		
	}
	
}
