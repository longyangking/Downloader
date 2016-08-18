package test;
import Downloader.*;

public class AllTests {
	public static void main(String[] args){
		System.out.println("Test Stars!");
		//TestServer();
		TestTasks();
	}
	public static void TestServer(){
		Server testserver = new Server(80);
		System.out.println("Server on!");
		testserver.Init();
		//Use Web Browser to View
	}
	public static void TestTasks(){
		for (int i = 0; i<10; i++){
			new Task(i,"Test task!").Start();
		}
	}
}
