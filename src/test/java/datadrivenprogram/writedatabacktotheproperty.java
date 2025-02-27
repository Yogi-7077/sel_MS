package datadrivenprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class writedatabacktotheproperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties files=new Properties();
		files.load(fis);
		String username = files.getProperty("username");
		String password = files.getProperty("password");
	}

}
