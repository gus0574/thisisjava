package ch15_컬렉션프레임워크.sec4_Map컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장, 제네릭타입이 기본타입이여서 int->Integer박싱이 발생함 
		map.put("신용권", 85);	//Entry1
		map.put("홍길동", 65);	//Entry2 ...
		map.put("동장군", 80);
		map.put("홍길동", 75);	//이전에 저장한 65가 75로 저장됨
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);	//Integer->int 언박싱 발생
		System.out.println(key+": "+value);
		System.out.println();
		
		//Set컬렉션으로 변환하는 메소드 사용. 반복
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+": "+v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값 얻기 map에 들어있는게 Entry 구현객체이기 때문에 Entry 형태로 넣어줘야함
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+" : " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : "+map.size());
		System.out.println();
	}

}
