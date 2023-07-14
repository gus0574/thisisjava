package ch15_컬렉션프레임워크.sec4_Properties;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		//PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		//load 안의 매개값은 inputStream 형태이다.
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		//주어진 키에 대한 값 읽기, properties는 모두 String타입으로만 되어있기 때문에 String로 읽어야한다.
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("admin : "+admin);
	}

}
