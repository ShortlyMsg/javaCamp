package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer said = new Customer(1,"M.Said","Gürbüz");
		customerManager.add(said);
	}

}
