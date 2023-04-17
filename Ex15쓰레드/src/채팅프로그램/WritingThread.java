package 채팅프로그램;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//채팅을 사용자가 작성하고 작성한 채팅 -> 서버로 보냄
public class WritingThread extends Thread{ // 멀티쓰레딩 -> 사용자들이 동시에 채팅 가능
	
	private Socket socket = null; // 클라이언트가 채팅을 보낼 서버의 소켓 정보 저장
					              // 목적지
	
	Scanner sc = new Scanner(System.in);
	
	public WritingThread(Socket socket) { // socket : 실제 서버 소켓 정보
		this.socket = socket;
	}
	
	// 쓰레드가 수행할 한가지 작업
	@Override
	public void run() { // 클라이언트가 작성한 채팅을 서버로 보내기
		
		// 클라이언트가 작성한 채팅(데이터)를 서버로 전송할 수 있는 통로(스트림)
		// 클라이언트 -> 서버로 나가는 것이기 때문에 Output
		try {
			OutputStream out = socket.getOutputStream();
			
			// 통로를 통해서 데이터(텍스트)를 출력할 때 쓰는 객체
			PrintWriter writer = new PrintWriter(out, true);   // true : autoflush (자동으로 버퍼에 쌓인 데이터를 전송)
			
			while(true) {
				// 키보드로 입력한 값을 내보내는 역할
				writer.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			// socket정보가 잘못됐을 경우에는 스트림이 정상적으로 생성되지 않을 수 있으므로
			// 예외처리 해줘야함!
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
