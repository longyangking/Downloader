package Downloader;

public class Task{
	String url;
	int UserID;
	public Task(int UserID, String url){
		this.url = url;
		this.UserID = UserID;
	}
	public void Start(){
		DownloadTarget target = new DownloadTarget();
		new Thread(target,"Downloading process...(User ID: " + UserID + " ).").start(); 
	}
	private class DownloadTarget implements Runnable{
		NetSolver netsolver;
		public DownloadTarget(){
			netsolver = new NetSolver(url);
		}
		public void run(){
			//Just for test!
			//System.out.println(Thread.currentThread().getName());
		}
	}
}
