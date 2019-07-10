package ariful_islam;

class Admin extends User {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String ID) {
		this.name = ID;
	}
	
	@Override
	public String toString() {
		return "Admin [User ID = " + name + "]";
	}
}