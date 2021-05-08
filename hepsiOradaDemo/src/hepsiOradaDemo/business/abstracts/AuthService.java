package hepsiOradaDemo.business.abstracts;

import hepsiOradaDemo.entities.concretes.User;

public interface AuthService {
	boolean verification(User user);
	boolean login(User user);
}
