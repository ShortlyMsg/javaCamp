package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14",15000,"16GB Ram",10);	//�rnek olu�turma, referans olu�turma, instance

		
		Product product2 = new Product();	//�rnek olu�turma, referans olu�turma, instance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
	}

}
