package fitnesse;

import java.io.File;

public class FileChecker {

	private String fileName;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean fileExists() {
		return new File(fileName).exists();
	}

}
