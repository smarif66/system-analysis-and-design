package ariful_islam;

public class Customer extends User {
	
	private String name;
	private String address;
	
	public Customer(String name, String address) {
	    this.name = name;
	    this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [User ID = " + name + ", address = " + address + "]";
	}
}