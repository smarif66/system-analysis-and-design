package ariful_islam;

public class Customer extends User {
	
	private String name;
	Address address;
	
	public Customer(String name, Address address) {
	    this.name = name;
	    this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String ID) {
		this.name = ID;
	}

	@Override
	public String toString() {
		return "Customer [User ID = " + name + ", address=" + address + "]";
	}
}