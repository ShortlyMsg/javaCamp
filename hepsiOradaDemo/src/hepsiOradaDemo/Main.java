package hepsiOradaDemo;

import java.util.Scanner;

import hepsiOradaDemo.business.abstracts.AuthService;
import hepsiOradaDemo.business.abstracts.UserService;
import hepsiOradaDemo.business.concretes.AuthManager;
import hepsiOradaDemo.business.concretes.EmailManager;
import hepsiOradaDemo.business.concretes.UserManager;
import hepsiOradaDemo.core.googleWithRegisterAdapters.GoogleManager;
import hepsiOradaDemo.dataAccess.concretes.MyDataUserDao;
import hepsiOradaDemo.entities.concretes.User;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		AuthService googleManager=new GoogleManager();
	
		User user=new User();
		user.setId(1);
		user.setFirstName("Said");
		user.setLastName("Gürbüz");
		user.setMail("42msg42@gmail.com");
    	user.setPassword("12345678");
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Davud");
	    user2.setLastName("Tokmak");
		user2.setMail("davuttk@gmail.com");
    	user2.setPassword("87654321");
		
		
		

		UserService userService=new UserManager(new MyDataUserDao(),new AuthManager(),new EmailManager());
		userService.getAll();
		userService.add(user);
		
		int verificationCode=scan.nextInt();
		userService.userVerify(user, verificationCode);



		userService.add(user2);


	}

}