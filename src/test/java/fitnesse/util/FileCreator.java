package fitnesse.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreator {

	private String directory;

	private String fileName;
	private String content;

	public FileCreator(String directory) {
		this.directory = directory;
		if (!new File(directory).exists()) {
			new File(directory).mkdir();
		}
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String createFile() {
		try {
			PrintWriter writer = new PrintWriter(directory + File.separator
					+ fileName, "UTF-8");
			writer.println(content);
			writer.close();
		} catch (IOException e) {
			return e.getMessage();
		}
		return "success";
	}

}
