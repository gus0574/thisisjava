package ch17_스트림.sec12_요소그룹핑;

public class Student {
	private String name;
	private String sex;
	private int score;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public int getScore() {
		return this.score;
	}
	
	
}
