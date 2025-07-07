package training;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		//location of properties files
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//TestData//config.properties");
		
		//Loading properties files
		Properties propertiesobj= new Properties();
		propertiesobj.load(file);
		
		
		//Reading data from properties file
		String url=propertiesobj.getProperty("appurl");
		String mail=propertiesobj.getProperty("email");
		String pass=propertiesobj.getProperty("password");
		String order=propertiesobj.getProperty("orderid");
		String customer=propertiesobj.getProperty("customerid");
		
		System.out.println(url+"  "+mail+"  "+pass+"  "+order+"  "+customer);
		
		//Reading all the keys from properties file
		Set<String> keys=propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		//Reading all the values from properties file
		Collection<Object> value=propertiesobj.values();
		System.out.println(value);
		
	
	}

}
