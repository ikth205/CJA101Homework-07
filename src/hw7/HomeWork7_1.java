package hw7;

import java.io.*;

public class HomeWork7_1 {

	public static void main(String[] args) {
		File file = new File("Sample.txt");

		long byteCount = 0;
		int charCount = 0;
		int lineCount = 0;

		try {

			byteCount = file.length();

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				lineCount++;
				charCount += line.length();
			}
			reader.close();

			System.out.println("Sample.txt 檔案共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");
		} catch (IOException e) {
			System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
		}
	}

}
