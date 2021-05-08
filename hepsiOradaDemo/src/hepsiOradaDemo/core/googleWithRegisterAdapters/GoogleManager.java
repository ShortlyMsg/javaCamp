package hepsiOradaDemo.core.googleWithRegisterAdapters;

import hepsiOradaDemo.business.abstracts.AuthService;
import hepsiOradaDemo.core.utilities.BusinessRules;
import hepsiOradaDemo.entities.concretes.User;
import hepsiOradaDemo.signUpWithGoogle.RegisterToGoogle;

public class GoogleManager implements AuthService {

	RegisterToGoogle registerToGoogle = new RegisterToGoogle();
	
	@Override
	public boolean verification(User user) {
		boolean result = false;
		
		result = registerToGoogle.register(user.getId(), user.getFirstName(), user.getLastName(), user.getMail(), user.getPassword());
		if (result != true) {
			return false;
		}
		System.out.println("Google ile kay�t olundu");
		return true;
	}

	@Override
	public boolean login(User user) {
		boolean result=BusinessRules.Run(isFirstandLastNameEmpty(user));
		return result;
	}
	private boolean isFirstandLastNameEmpty(User user) {
		if (user.getMail()==null || user.getPassword()==null) {
			System.out.println("Kullan�c� ad� veya parola eksik!");
			return false;
		}
		System.out.println("Sisteme giri� yap�ld�!");
		return true;
	}
}
