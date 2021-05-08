package hepsiOradaDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import hepsiOradaDemo.business.abstracts.AuthService;
import hepsiOradaDemo.business.abstracts.EmailService;
import hepsiOradaDemo.business.abstracts.UserService;
import hepsiOradaDemo.dataAccess.abstracts.UserDao;
import hepsiOradaDemo.entities.concretes.User;

public class UserManager implements UserService {
	 
	
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	
	
	public UserManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
	}
	
	List<User> users=new ArrayList<User>();
	public UserManager() {
		users.add((User) this.getAll());
	}

	@Override
	public void add(User user) {
		if (userCheck(user.getMail()) &&authService.verification(user)) {
			userDao.add(user);
			System.out.println("Doðrulama Kodunuz Mail Olarak Gönderildi! Doðrulama Kodunuz: "+emailService.mailSend());
			System.out.print("Doðrulama Kodunu Giriniz: ");
			return;			
		}
		System.out.println("Kullanýcý Bilgilerini Kontrol Ediniz!");
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		User result=this.userDao.get(id);
		return result;
	}

	@Override
	public List<User> getAll() {
		List<User> result=this.userDao.getAll();
		return result;
	}

	@Override
	public void userVerify(User user,int verificationCode) {
		int result=emailService.mailSend();
		if (result==verificationCode) {
			
			System.out.println("Kullanýcý doðrulandý. Üyeliðiniz Tamamlandý!!! "+user.getFirstName());
		}
		else {
			System.out.println("Doðrulama kodunuz yanlýþ!");
		}
		
	}
	public boolean userCheck(String mail) {
		if (userDao.getEmail(mail)!=null) {
			System.out.println("Kullanýcý mevcut!");
			return false;
		}
	
		return true;
	}
}
