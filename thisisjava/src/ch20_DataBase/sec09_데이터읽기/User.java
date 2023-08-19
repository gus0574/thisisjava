package ch20_DataBase.sec09_데이터읽기;

import lombok.Data;

//DTO (VO) : data transfer object 또는 Value Object,, 데이터를 담아서 자바 프로그램에 전달

@Data	// lombok 사용하여 게터세터 등 자동 생성
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userMail;
}
