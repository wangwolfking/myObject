package test.fileOpretor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import test.md5.MD5;

public class Test_one {

	public static void main(String[] args) throws Exception {
		try {
//			readZipFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981.zip");
			 test1("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981.zip");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readZipFile(String file) throws Exception {
		ZipFile zf = new ZipFile(file);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ZipInputStream zin = new ZipInputStream(in);
		ZipEntry ze;
		while ((ze = zin.getNextEntry()) != null) {
			zin.closeEntry();
			if (ze.isDirectory()) {
			} else {
				ze.setMethod(ZipEntry.STORED);//
				System.err.println("file - " + ze.getName() + " : " + ze.getSize() + " bytes");
				long size = ze.getSize();
				if (size < 0) { // 使用时要修改此处
					BufferedReader br = new BufferedReader(new InputStreamReader(zf.getInputStream(ze)));
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();
				}
				System.out.println();
			}
		}
		zin.closeEntry();
	}

	public static void test1(String filepath) throws IOException {
		ZipInputStream zipIn = new ZipInputStream(new FileInputStream(filepath));
		ZipEntry zipEntry;
		while ((zipEntry = zipIn.getNextEntry()) != null) {
			zipIn.closeEntry();
			if (!zipEntry.isDirectory()) {
				String name = zipEntry.getName();
//				File f = new File(name);
//				System.out.printf(MD5.getFileMD5String(f));
				long size = zipEntry.getSize();
				long compd = zipEntry.getCompressedSize();
				System.out.printf("%s , size=%d, compressed size=%d\r\n", name, size, compd);
			}
		}
		zipIn.close();
	}
}
