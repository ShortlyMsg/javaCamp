package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu ="�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade= 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun ) {
			System.out.println("Dolar d��t� resmi.");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi.");
		}else {
			System.out.println("Dolar e�ittir resmi.");
		}
		
		String kredi1 ="H�zl� Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="�ift�i Kredisi";
		String kredi5 ="Msb  Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);


		String[] krediler = 
			{
					"H�zl� Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"�ift�i Kredisi",
					"Msb  Kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i <krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
	}

}
