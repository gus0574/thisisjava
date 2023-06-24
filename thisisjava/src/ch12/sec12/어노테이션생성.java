package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})	//적용 대상 : METHOD
@Retention(RetentionPolicy.RUNTIME)	//유지 정책 : RUNTIME
public @interface 어노테이션생성 {
	String value() default "-";	//value속성 : 구분선의 종류
	int number() default 15;	// number 속성 : 출력 횟수
}
