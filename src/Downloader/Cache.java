package Downloader;

public class Cache {
	private int startPos = 0;
	byte[] buffer;
	int state;
	public Cache(){
		this.buffer = new byte[Config.DiskCache];
	}
	public int getState(){
		return state;
	}
	public byte[] getData(){
		return buffer;
	}
	public int getBlankSpaceSize(){
		return Config.DiskCache - startPos + 1;
	}
	public boolean writeData(){
		return true;
	}
}
