package ariful_islam;

public class Main {
	
	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Shah Muhammad Arif";
		
		System.out.println(a);
		
		Address address1=new Address("Dinajpur Sadar", "Dinajpur", "Bangladesh");
		Customer c = new Customer("Shah Muhammad Arif", address1);

		System.out.println(c);
	}
}
