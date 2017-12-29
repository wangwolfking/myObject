package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.filechooser.FileSystemView;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	// d581fe22d0df89149c411489ba78fd1f
	// d581fe22d0df89149c411489ba78fd1f
	static Logger logger = LogManager.getLogger(Test.class.getName());

	public static void main(String[] args) throws Exception {
		// testSystem();
		// SystemPropertytest();
		// filetest();
		// System.out.println(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile());
		// System.out.println(MD5.getFileMD5String(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
		// System.out.println(MD5.getFileMD5StringMemory(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
		// System.out.println(MD5.getMD5String(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
		// String a="12222234_123";
		// System.out.println(a.substring(a.lastIndexOf("_")+1) );
		// String filePath =
		// Thread.currentThread().getContextClassLoader().getResource("").getPath();
		// System.out.println(123);
		MyApplication myApplication = new MyApplication();
		logger.trace("123");
		logger.info("Hello, World!");
		myApplication.doIt();
		hello();
		logger.error("Hello, World!");
		logger.trace("exit");

	}

	public static boolean hello() {
		logger.trace("entry"); // 等同于logger.entry();但此方法在新版本好像已经废弃
		logger.error("Did it again!");
		logger.info("这是info级信息");
		logger.debug("这是debug级信息");
		logger.warn("这是warn级信息");
		logger.fatal("严重错误");
		logger.trace("exit");
		return false;
	}

	public static void testSystem() {
		Date datetemp = new Date(System.currentTimeMillis() - (1000 * 60 * 60));
		System.out.println(datetemp);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24);
	}

	public static void filetest() {
		File f = new File("");
		System.out.println("filetest()" + File.separator);
	}

	public static File findFile(String directory, String fileName) {
		File file = new File(directory);
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				File result = findFile(f.getAbsolutePath(), fileName);
				if (result != null)
					return result;
			}
		} else {
			if (file.getName().toUpperCase().indexOf(fileName.toUpperCase()) >= 0) {
				return file;
			}
		}
		return null;
	}

	public static void SystemPropertytest() {
		System.out.println("java_vendor:" + System.getProperty("java.vendor"));
		System.out.println("java_vendor_url:" + System.getProperty("java.vendor.url"));
		System.out.println("java_home:" + System.getProperty("java.home"));
		System.out.println("java_class_version:" + System.getProperty("java.class.version"));
		System.out.println("java_class_path:" + System.getProperty("java.class.path"));
		System.out.println("os_name:" + System.getProperty("os.name"));
		System.out.println("os_arch:" + System.getProperty("os.arch"));
		System.out.println("os_version:" + System.getProperty("os.version"));
		System.out.println("user_name:" + System.getProperty("user.name"));
		System.out.println("user_home:" + System.getProperty("user.home"));
		System.out.println("user_dir:" + System.getProperty("user.dir"));
		System.out.println("java_vm_specification_version:" + System.getProperty("java.vm.specification.version"));
		System.out.println("java_vm_specification_vendor:" + System.getProperty("java.vm.specification.vendor"));
		System.out.println("java_vm_specification_name:" + System.getProperty("java.vm.specification.name"));
		System.out.println("java_vm_version:" + System.getProperty("java.vm.version"));
		System.out.println("java_vm_vendor:" + System.getProperty("java.vm.vendor"));
		System.out.println("java_vm_name:" + System.getProperty("java.vm.name"));
		System.out.println("java_ext_dirs:" + System.getProperty("java.ext.dirs"));
		System.out.println("file_separator:" + System.getProperty("file.separator"));
		System.out.println("path_separator:" + System.getProperty("path.separator"));
		System.out.println("line_separator:" + System.getProperty("line.separator"));
	}

	public void test1() {
		// File[] roots = File.listRoots();
		// for (int i = 0; i < roots.length; i++) {
		//
		// System.out.println(roots[i]);
		// }
		FileSystemView sys = FileSystemView.getFileSystemView();
		File[] list = File.listRoots();
		try {
			System.out.println(java.net.InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		for (File diskPartition : list) {
			double totalCapacity = diskPartition.getTotalSpace();
			double freePartitionSpace = diskPartition.getFreeSpace();
			System.out.println("------------" + diskPartition.getAbsoluteFile() + "---------------");
			System.out.println("总大小 : " + totalCapacity / (1024 * 1024 * 1024) + " GB");
			System.out.println("剩余: " + freePartitionSpace / (1024 * 1024 * 1024) + " GB");
			System.out.println("磁盘类型: " + sys.getSystemTypeDescription(diskPartition));
		}
	}

	public String test2() {
		String strIp = "";
		try {
			Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (allNetInterfaces.hasMoreElements()) {
				NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
				// System.out.println(netInterface.getName());
				Enumeration addresses = netInterface.getInetAddresses();
				while (addresses.hasMoreElements()) {
					ip = (InetAddress) addresses.nextElement();
					if (ip != null && ip instanceof Inet4Address) {
						if (!ip.getHostAddress().equals("127.0.0.1")) {
							System.out.println("本机的IP = " + ip.getHostAddress());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strIp;
	}

	public static String getMAC(String ipAddress) {
		String address = "ERROR";
		// if(ipAddress.equalsIgnoreCase("localhost")||ipAddress.equalsIgnoreCase("127.0.0.1")){
		// return address ;
		// }
		String os = System.getProperty("os.name");
		if (os != null && os.startsWith("Windows")) {
			try {
				String command = "cmd.exe /c nbtstat -a " + ipAddress;
				Process p = Runtime.getRuntime().exec(command);
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line;
				while ((line = br.readLine()) != null) {
					if (line.indexOf("MAC") > 0) {
						int index = line.indexOf("=");
						index += 2;
						address = line.substring(index);
						break;
					}
				}
				br.close();
				return address.trim();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return address;
	}

	public static String getMACAddress() {
		System.out.println(123);
		String address = "";
		String os = System.getProperty("os.name");
		if (os != null && os.startsWith("Windows")) {
			try {
				String command = "cmd.exe /c ipconfig /all";
				Process p = Runtime.getRuntime().exec(command);
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);// 此处使用打印出来是乱码应该是中文的关系。
					if (line.indexOf("Physical Address") > 0) {
						int index = line.indexOf(":");
						index += 2;
						address = line.substring(index);
						System.out.println(address);
						break;
					}
				}
				br.close();
				return address.trim();
			} catch (Exception e) {
			}
		}
		return address;
	}

}
