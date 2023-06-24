package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object K : keys) {
			String key = (String) K;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
			
		}
	}

}
