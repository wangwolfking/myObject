package test;

import java.io.File;
import java.util.Date;

public class Test {
//d581fe22d0df89149c411489ba78fd1f
//d581fe22d0df89149c411489ba78fd1f
	public static void main(String[] args) throws Exception {
//		testSystem();
//		SystemPropertytest();
//		filetest();
//		System.out.println(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile());
//		System.out.println(MD5.getFileMD5String(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
//		System.out.println(MD5.getFileMD5StringMemory(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
		//System.out.println(MD5.getMD5String(findFile("D:\\zip\\8d0d001dbfe69994478a0925a6ce0f06_2015100511981\\","rt.dat").getAbsoluteFile()));
		String a="12222234_123";
		System.out.println(a.substring(a.lastIndexOf("_")+1) );
		String filePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		System.out.println(filePath);
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
	public static File findFile(String directory,String fileName) {
		File file = new File ( directory ) ;
		if ( file.isDirectory()  ) {
			for( File f:file.listFiles()){
				File result =  findFile(f.getAbsolutePath(), fileName);
				if ( result != null ) return result ;
			}
		} else {
			if ( file.getName().toUpperCase().indexOf(fileName.toUpperCase()) >= 0 ) {
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

}
