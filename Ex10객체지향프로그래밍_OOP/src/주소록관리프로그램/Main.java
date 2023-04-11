package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// 배열 전체 순회 전체 출력문 리턴
	public static String getListString(ArrayList<Address> addressList) {
		String temp = "";
		for (int i = 0; i < addressList.size(); i++) {
			temp += getString(addressList, i) + "\n";
		}
		// 마지막 개행 제거
		temp = temp.substring(0, temp.length() - 1);

		return temp;
	}

	// 단일값 출력문 리턴
	public static String getString(ArrayList<Address> addressList, int idx) {
		String temp = "";
		temp += idx + 1 + ". ";
		temp += addressList.get(idx).getName();
		temp += "(" + addressList.get(idx).getAge() + "세) : ";
		temp += addressList.get(idx).getPhoneNumber();
		return temp;
	}

	// 검색시 검색성공시 index 리턴, 실패시 -1리턴
	public static int isExist(ArrayList<Address> addressList, String searchName) {
		int result = -1;

		for (int i = 0; i < addressList.size(); i++) {
			if (addressList.get(i).getName().equals(searchName)) {
				result = i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<>();

		String name;
		int age;
		String phoneNumber;
		int deleteNum;
		String searchName;
		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int mode = sc.nextInt();

			if (mode == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (mode == 1) {
				// 추가
				sc.nextLine(); // 캐시 제거
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("나이 : ");
				age = sc.nextInt();
				sc.nextLine(); // 캐시 제거
				System.out.print("전화번호 : ");
				phoneNumber = sc.nextLine();
				addressList.add(new Address(name, age, phoneNumber));

			} else if (mode == 2) {
				// 조회
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					System.out.println(getListString(addressList));
				}
			} else if (mode == 3) {
				// 삭제
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					System.out.println(getListString(addressList));
					System.out.print("삭제할 번호 입력 : ");
					deleteNum = sc.nextInt();
					addressList.remove(deleteNum - 1);
				}
			} else if (mode == 4) {
				// 검색
				System.out.print("검색할 이름 입력 : ");
				searchName = sc.next();
				int resultIndex = isExist(addressList, searchName);
				if (resultIndex == -1) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				} else {
					System.out.println(getString(addressList, resultIndex));
				}
			}
		}

	}

}
