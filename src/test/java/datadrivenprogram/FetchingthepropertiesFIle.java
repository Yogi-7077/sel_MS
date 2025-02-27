package datadrivenprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingthepropertiesFIle {

	public static void main(String[] args) throws IOException {
		//step1: Convert the physical file into java obj;
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		//create a empty property file obj
		Properties files=new Properties();
		//load the java obj
		files.load(fis);
		String data = files.getProperty("browser");
		String data2 = files.getProperty("username");
		String data3 = files.getProperty("password");
		String data4 = files.getProperty("time");
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}
