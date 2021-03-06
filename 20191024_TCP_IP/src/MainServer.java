import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// Instance serverSocket(port :8080)
			serverSocket = new ServerSocket(8080);
			System.out.println("서버가 준비되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		InputStream is;
		OutputStream os;

		try {
			System.out.println("연결 요청을 기다립니다.");
			// Allow the connect of client
			socket = serverSocket.accept();
			System.out.println(socket.getInetAddress() + " 로부터 연결 요청");
			
			// Get client's stream for sending message
			os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os),true);
			
			// Sending a data to remote socket
			pw.println("Success connection to server");
			System.out.println("데이터 전송 완료");
			
			while (true) {
				// Save the message of client for return
				is = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String answer = br.readLine();
				
				if(answer=="exit") break;
				
				pw.println("ECHO : " + answer);
				System.out.println("재전송_Echo : " + answer);
			}
			is.close();
			os.close();
			socket.close();
			serverSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
