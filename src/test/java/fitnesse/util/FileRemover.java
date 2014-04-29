package fitnesse.util;

import java.io.File;

public class FileRemover {

	private String directory;
	private String fileName;

	public FileRemover(String directory) {
		this.directory = directory;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean removeFile() {
		return new File(directory + File.separator + fileName).delete();
	}

}
