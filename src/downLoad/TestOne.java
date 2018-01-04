package downLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOne {

	public static void main(String[] args) {
		// 源文件与目标文件
		File sourceFile = new File("D:/测试的文件/test/1", "test.txt");
		File targetFile = new File("D:/测试的文件/test/2", "test.txt");
		// 输入输出流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 数据缓冲区
		byte[] buf = new byte[1];

		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(targetFile);
			// 数据读写
			while (fis.read(buf) != -1) {
				System.out.println("write data...");
				fos.write(buf);
			}
		} catch (FileNotFoundException e) {
			System.out.println("指定文件不存在");
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				// 关闭输入输出流
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}