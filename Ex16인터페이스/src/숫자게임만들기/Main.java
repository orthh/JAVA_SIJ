package 숫자게임만들기;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      //개발자2
      // 사용자가 보여질 부분이 들어갈 곳
      //뷰를 완성하기
      
      PlusGame game = new PlusGame();
      MemberSystem login = new MemberSystem();
      
      int select;
      int select2;
      while(true) {
         System.out.println("========숫자게임========");
         System.out.print("[1]회원가입 [2]로그인 >> ");
         select = sc.nextInt();
         if(select==1) {//회원가입
            System.out.print("닉네임 : ");
            String id = sc.next();
            System.out.print("비밀번호 : ");
            String pwd = sc.next();
            if(login.signUp(id, pwd)) {
               System.out.println("회원가입이 완료되었습니다");
            }else {
               System.out.println("아이디가 중복됩니다. 다시 가입해주세요");
            }
            
         }else if(select==2) {//로그인
            System.out.print("닉네임 : ");
            String id = sc.next();
            System.out.print("비밀번호 : ");
            String pwd = sc.next();
            login.login(id, pwd);
            if(login.login(id, pwd)) {//로그인 성공
               System.out.println("----로그인 성공!----");
               System.out.println(id+"님 게임을선택해 주세요");
               
               while(true) {
                  System.out.println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 >> ");
                  select = sc.nextInt();
                  System.out.println("[1]초급 [2]중급 [3]고급 [4]지옥 >> ");
                  select2 = sc.nextInt();

                  printQuiz(select, select2, game);
                  
               }
               
            }else {//로그인 실패
               System.out.println("로그인에 실패하셨습니다.");
            }
            
         }else {
            System.out.println("숫자를 다시 입력하세요");
         }
         
      }
      
      
      
      

   }
   
   public static void printQuiz(int oper ,int select, PlusGame game) {
      Scanner sc = new Scanner(System.in);
      
      for(int i=1; i<=5; i++) {
         System.out.println(game.getQuiz(oper , select));
         if(game.checkAnswer(sc.nextInt())) {
            System.out.println("정답!");
         }else {
            System.out.println("오답입니다.");
            break;
         }
      }
   }
   

}