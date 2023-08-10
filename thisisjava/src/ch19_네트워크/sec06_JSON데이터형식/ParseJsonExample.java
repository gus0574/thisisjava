package ch19_네트워크.sec06_JSON데이터형식;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//파일로부터 JSON 읽기. BufferedReader은 Reader 스트림 객체가 들어와야함
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/member.json", Charset.forName("UTF-8")));
		String json = br.readLine();
		br.close();
		
		JSONObject root = new JSONObject(json);
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("name"));
		System.out.println("age: " + root.getInt("age"));
		System.out.println("student: " + root.getBoolean("student"));
		
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: "+tel.getString("home"));
		System.out.println("mobile: " + tel.getString("mobile"));
		
		JSONArray skill = root.getJSONArray("skill");
		System.out.printf("skill : ");
		for(int i=0; i<skill.length(); i++) {
			System.out.print(skill.get(i) + ", ");
		}
	}

}
