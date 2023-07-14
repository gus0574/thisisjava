package ch15_컬렉션프레임워크.sec3_Set컬렉션.HashSet;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member target) {	// Member 타입이면 target 로 형변환
			return target.name.equals(name) && (target.age==age);
		} else {
			return false;
		}
	}
}
