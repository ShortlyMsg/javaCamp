package hepsiOradaDemo.core.utilities;

public class BusinessRules {
	
	public static boolean Run(boolean... logics) {
		for(boolean logic : logics) {
			if(!logic) {
				return false;
			}
		}
		return true;
	}
}
