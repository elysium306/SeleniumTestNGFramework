package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {

	private static Properties properties;

	static {
		try {
			File file = new File("/TestNGFramework/src/test/resources/testdata/enc.properties");
			FileInputStream fis = new FileInputStream(file);
			properties = new Properties();
			properties.load(fis);
			properties.get("indeed_url");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.fillInStackTrace());
		} finally {
			System.out.println("This is 'finally' block");
		}
	}

	public static String getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
