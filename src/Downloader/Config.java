package Downloader;

public class Config {
	//System Info
	static final int ServerPort = 80;
	static final int DiskCache = 8*1024*1024; /* unit of byte */
	static final int DownloadSize = 1024;
	static final int DiskPoolNum = 5;
	
	//Cache Info
	static final int CacheFull = 1;
	static final int CacheNotFull = -1;
	
	//Task Info
	static final int DownloadState_Finish = 1;
	static final int DownloadState_Processing = 0;
	static final int DownloadState_Init = -1;	
}
