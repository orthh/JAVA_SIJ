import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> musicList = new ArrayList<>();
		int mode;
		int addMusicMode;
		int deleteMode;
		int addMusicIndex;

		while (true) {
			do {
				System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
				mode = sc.nextInt();
			} while (mode <= 0 || mode >= 4);
			if (mode == 3) {
				// 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else if (mode == 1) {
				// 노래 추가
				// 재생 목록
				System.out.println("=========== 현재 재생 목록 ===========");
				if (musicList.isEmpty()) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					printMusicList(musicList);
				}
				System.out.println("==================================");

				// 노래 추가

				do {
					System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
					addMusicMode = sc.nextInt();
				} while (addMusicMode <= 0 || addMusicMode >= 3);

				if (addMusicMode == 1) {
					System.out.print("추가 할 노래 입력 : ");
//					String addMusicName = sc.nextLine();
					sc.nextLine(); // 남은 엔터키 처리
					musicList.add(sc.nextLine());
					System.out.println("추가가 완료되었습니다.");
				} else {
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine(); // 남은 엔터 처리
					String addMusicName = sc.nextLine();
					System.out.print("추가할 위치 입력 >> ");
					addMusicIndex = sc.nextInt();
					musicList.add(addMusicIndex - 1, addMusicName);
					System.out.println("추가가 완료되었습니다.");
				}
			} else if (mode == 2) {
				// 노래 삭제
				// 재생 목록
				System.out.println("=========== 현재 재생 목록 ===========");
				if (musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
					System.out.println("===================================");
					continue;
				} else {
					printMusicList(musicList);
				}
				System.out.println("===================================");

				// 삭제 방법

				do {
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					deleteMode = sc.nextInt();
				} while (deleteMode <= 0 || deleteMode >= 3);

				if (deleteMode == 1) {
					// 선택삭제
					System.out.print("삭제할 노래 선택 >> ");
//					deleteNum = sc.nextInt();
					musicList.remove(sc.nextInt() - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else {
					musicList.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}
			}

		}

	}
	public static void printMusicList(ArrayList<String> ml) {
		for (int i = 0; i < ml.size(); i++) {
			System.out.println(i + 1 + "." + ml.get(i));
		}
	}


}
