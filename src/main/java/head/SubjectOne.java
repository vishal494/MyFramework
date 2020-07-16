package head;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;

public class SubjectOne {

	public static void main(String[] args) throws URISyntaxException {
		//System.out.println(checkIfServerIsRunnning(4723));
		
		System.out.println(1/0);
		
	}
	public static boolean checkIfServerIsRunnning(int port) throws URISyntaxException {
		
		
		//TCPClient tcpClient = new TCPClient()

			
			//"http://0.0.0.0:4723/wd/hub/status"
			
			System.out.println();
			
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			// If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
}
