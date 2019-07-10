package ariful_islam;

public class GeneralizationTest {
	
	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Shah Muhammad Arif";
		
		System.out.println(a);
		
		Customer c = new Customer("Shah Muhammad Arif", "Dinajpur");
		System.out.println(c);
	}
}
