package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		property.put("object", "selinum");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Data.properties");
		property.store(fos, "updated successfully");
		
		
	}

}