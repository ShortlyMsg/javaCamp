package hepsiOradaDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import hepsiOradaDemo.dataAccess.abstracts.UserDao;
import hepsiOradaDemo.entities.concretes.User;

public class MyDataUserDao implements UserDao {
	List<User> users=new ArrayList<User>();
	public MyDataUserDao() {
		System.out.println(" ***** Kullanýcýlar ***** ");
		User user1=new User(1,"M.Said","Gürbüz","msaidg@gmail.com","12345678");
		User user2=new User(2,"Davud","Tokmak","davuttk@gmail.com","87654321");
		
		users.add(user1);
		users.add(user2);
	}
	
	
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getMail());		
	
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getMail());		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getMail());		
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getEmail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
