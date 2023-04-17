package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

// 다른 사용자들이 작성한 채팅 받는 기능
public class ListeningThread extends Thread{
	
	private Socket socket = null; // 서버 소켓 정보 저장
	
	public ListeningThread(Socket socket) {
		this.socket = socket;
	}

	// 다른 사람이 입력한 채팅 가져오기
	@Override
	public void run() {
		
		try {
			// 데이터가 들어올 수 있는 통로 (스트림)
			InputStream input = socket.getInputStream();
			
			// InputStreamReader : 스트리믈 통해 들어온 데이터읽기
			// BufferReader : 읽은 데이터를 임시적으로 저장할 공간
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			while(true) { // 버퍼에 저장된 값을 모두 가져올 때까지 수행하기 위해
				// 버퍼안에 있는 데이터 가져와서 출력 -> 반복
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
