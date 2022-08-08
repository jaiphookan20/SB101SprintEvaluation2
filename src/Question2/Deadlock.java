package Question2;

public class Deadlock {

	public static void main(String[] args) {
		

	}

}


class One {
	
	public synchronized void functionOne(Two two) {
		System.out.println("function one");
	}
	
}


class Two {
	
	
	public synchronized void functionTwo(One one) {
		System.out.println("function two");
	}
}