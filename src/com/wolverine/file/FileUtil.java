package com.wolverine.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	public static Properties getProperties(String param_fileName){
		Properties pps = new Properties();
		try {
			pps.load(new FileInputStream(param_fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pps;
	}

}
