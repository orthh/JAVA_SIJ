//package 숫자게임만들기;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class 강사님코드 {
//
//   public static void main(String[] args) {
//
//      // 개발자2
//      // : 사용자가 보여질 부분이 들어갈 곳
//      // 뷰~ 뷰
//      // GameDummy game = new GameDummy(); // 임시로 사용할 객체/기능
//      PlusGame game2 = new PlusGame();// --> 개발자1이 완성하면 교체할 객체
//      Scanner sc = new Scanner(System.in);
//      // Member자료형을 관리하는 ArrayList 선언/초기화
//      ArrayList<Member> members = new ArrayList<>();
//
//      // 게임은 5라운드까지 진행하기
//      // 틀린문제는 그대로 다음라운드에 출제하기
//
//      // + 회원가입/로그인
//
//      int round = 1;// 게임라운드 체크를 할수 있는 변수
//      boolean check = false; // 로그인을 성공/실패 변수
//      int cnt = 1; // 3번의 기회를 판단하는 변수
//      while (round < 6) {
//
//         if (check == false) {
//            System.out.print("[1]회원가입 [2]로그인 >> ");
//            int select1 = sc.nextInt();
//            if (select1 == 1) {
//               System.out.print("닉네임 : ");
//               String nick = sc.next();
//               System.out.print("비밀번호 : ");
//               String pw = sc.next();
//               Member mem = new Member(nick, pw);
//               members.add(mem);
//               System.out.println("회원가입 성공");
//               continue;
//            } else {
//               System.out.print("닉네임 : ");
//               String nick = sc.next();
//               System.out.print("비밀번호 : ");
//               String pw = sc.next();
//               for(int i = 0; i<members.size(); i++) {
//                  if (members.get(i).getNick().equals(nick) && members.get(i).getPw().equals(pw)) {
//                     System.out.println("로그인 성공");
//                     check = true;
//                  } else {
//                     System.out.println("로그인 실패");
//                  }
//               }
//               
//               
//
//            }
//
//         }
//
//         String quiz = game2.getQuizMsg();
//         System.out.print(round + "라운드 : " + quiz);
//         int ans = sc.nextInt();
//
//         check = game2.checkAnswer(ans);
//
//         if (check == false) {
//            while (cnt < 3) {
//
//               System.out.println("틀렸습니다!");
//               // 정답을 맞추지 못했을 경우
//               // 3번의 기회를 주고, 문제는 틀린 문제 그대로 출제!
//               System.out.print(round + "라운드 : " + quiz);
//               ans = sc.nextInt();
//               cnt++;
//
//               check = game2.checkAnswer(ans);
//
//               if (check == true) {
//                  break;
//               }
//            }
//
//            System.out.println("다음으로 넘어갑니다!!");
//            cnt = 1;
//
//         } else {
//            System.out.println("정답입니다!");
//         }
//
//         // 1라운드가 종료되면 다음 라운드로 증가!
//         round++;
//         System.out.println();
//
//      } // while문 종료
//
//   }
//
//}