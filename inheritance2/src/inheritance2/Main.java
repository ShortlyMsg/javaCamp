package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
		
	}

}


//birbirinin alterfatifi olan kodlar için if kullanýlmaz.