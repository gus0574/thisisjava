package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable search = new SmartTelevision();
		search.search("www.url.com");
	}

}
