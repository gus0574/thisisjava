package ch19_네트워크.sec06_JSON데이터형식;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// JSON 객체 생성
		JSONObject root = new JSONObject();
		
		// JSON 표기법의 속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		// 객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);
		
		//JSON 배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill", skill);
		
		//JSON 얻기
		String json = root.toString();
		
		//콘솔 출력
		System.out.println(json);
		
		//파일로 저장 = 입출력 스트림 사용 - 설정정보 등을 만들 때 파일로 저장하는 등으로 사용한다
		Writer writer = new FileWriter("C:/Temp/member.json", Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
	}

}
