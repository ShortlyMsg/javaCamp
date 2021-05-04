package Adapters;

import java.util.Locale;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {


	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result = false;
		try {result= proxy.TCKimlikNoDogrula(
				customer.getNationalityId(), 
				customer.getFirstName().toUpperCase(new Locale("tr")), 
				customer.getLastName().toUpperCase(new Locale("tr")), 
				customer.getDateOfBirth().getYear()
				
				);
		System.out.println(result);
			
		} catch (Exception e) {

		}
		return result;
		}

}
