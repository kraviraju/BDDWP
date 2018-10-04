package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	static Properties prop;
	FileReader input;
	
	public Property(){
		prop = new Properties();
		try {

			input = new FileReader("src\\test\\resources\\Config\\Application.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getPropery(String Name){
		String propValue = prop.getProperty(Name);
		return propValue;
	}
	
	
}