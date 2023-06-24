package ch12.sec12;

import java.lang.reflect.Method;

public class 어노테이션사용예제 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//리플렉션 얻기
		Method[] declaredMethods = 어노테이션예제용클래스.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//어노테이션 얻기, 이 어노테이션이 있는지 확인 없으면  NULL 리턴
			어노테이션생성 printAnnotation = method.getAnnotation(어노테이션생성.class);
			
			//어노테이션 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new 어노테이션예제용클래스());
			
			//어노테이션 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}

	
	public static void printLine(어노테이션생성 printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i=0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
