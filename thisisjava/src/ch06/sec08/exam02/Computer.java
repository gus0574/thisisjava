package ch06.sec08.exam02;

class Computer {
	int num = 0;
	Computer(){
		this.num = 10;
	}
	
	int Adder(int ... values){
		int sum = 0;
		for(int i : values) {
			sum += i;
		}
		return sum * this.num;
	}
	
	int Adder2(int[] values){
		int sum = 0;
		for(int i : values) {
			sum += i;
		}
		return sum * this.num;
	}
}
