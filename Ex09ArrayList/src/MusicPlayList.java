import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {
	public static void printMusicList(ArrayList<String> ml) {
		for(int i=0; i<ml.size(); i++) {
			System.out.println(i + 1 + "." + ml.get(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> musicList = new ArrayList<>();
		
		while(true) {
			int mode;
			do {
				System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
				mode = sc.nextInt();
			} while (mode <=0 || mode >=4);
			if(mode == 3) {
				//종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}else if(mode == 1) {
				//노래 추가
				//재생 목록
				System.out.println("=========== 현재 재생 목록 ===========");
				if(musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				}else {
					printMusicList(musicList);
				}
				System.out.println("===================================");
				
				//노래 추가
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int addMusicMode = sc.nextInt();
				
				if(addMusicMode == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String addMusicName = sc.next();
					musicList.add(addMusicName);
					System.out.println("추가가 완료되었습니다.");
				}else {
					System.out.print("추가 할 노래 입력 : ");
					String addMusicName = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int addMusicIndex = sc.nextInt();
					musicList.add(addMusicIndex - 1,addMusicName);
					System.out.println("추가가 완료되었습니다.");
				}
			}else if(mode == 2) {
				//노래 삭제
				//재생 목록
				System.out.println("=========== 현재 재생 목록 ===========");
				if(musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
					System.out.println("===================================");
					continue;
				}else {
					printMusicList(musicList);
				}
				System.out.println("===================================");
				
				// 삭제 방법
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int deleteMode = sc.nextInt();
				if(deleteMode == 1) {
					//선택삭제
					System.out.print("삭제할 노래 선택 >> ");
					int deleteNum = sc.nextInt();
					musicList.remove(deleteNum - 1);
					System.out.println("노래가 삭제되었습니다.");
				}else {
					musicList.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}
			}
			
		}
		

	}

	

}
