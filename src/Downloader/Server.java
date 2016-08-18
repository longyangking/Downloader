package Downloader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintStream;

public class Server {
	final int port;
	ServerSocket server;
	public Server(int port) {
		this.port = port;
		try{
			this.server = new ServerSocket(port);
		}catch (IOException e){
			System.out.println("Error in creating Server!");
			new IOException(e);
		}
	}
	
	//ToDo: (1)AIO; (2)Handle and analyze the response
	public void Init(){
		while (true){
			try{
				Socket newlink = server.accept();
				System.out.println(newlink);
				Page page = new Page();
				PrintStream response = new PrintStream(newlink.getOutputStream());
				response.println(page.Response());
				response.close();
				newlink.close();			
			} catch (IOException e){
				System.out.println("Error in Server: Accept problems!");
				new IOException(e);
			}
		}
	}
	
}
