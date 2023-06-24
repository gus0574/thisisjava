package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

//롬북 어노테이션, 게터세터가 자동생성됨 
@Data 
//@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
public class Member {
	private final String id;
	@NonNull private String name;
	private int age;
}
