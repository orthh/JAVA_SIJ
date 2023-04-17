package 채팅프로그램;

import java.net.Socket;

public class SocketClientMain {

	public static void main(String[] args) {
		try {
	         //연결할 소켓 생성(서버소켓포트번호, 서버주소-ip)
	         Socket socket = new Socket("172.30.1.21",1234); //소켓 서버 접속
	         System.out.println("서버 접속 성공!");
	      
	         ListeningThread lt = new ListeningThread(socket);
	         WritingThread wt = new WritingThread(socket);
	         
	         lt.start();
	         wt.start();
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
		

	}

}
