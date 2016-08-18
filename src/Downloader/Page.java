package Downloader;

//ToDo: Generate Pages Dynamically!
public class Page {
		public Page(){
		}
		private String Head(){
			return "HTTP/1.1 200 OK\n\n";
		}
		private String Content(){
			return "<html>"
					+ "<head>"
					+ "<title>Test Server!</title>"
					+ "</head>"
					+ "<body>"
					+ "Test Server"
					+ "</body>"
					+ "</html>";
		}
		public String Response(){
			return this.Head() + this.Content();
		}
}
