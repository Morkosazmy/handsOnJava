package OOP;

public class User {
	private String name;
	private String membership;	
	
	public User() {
		
	}
	
	public User(String name, Membership membership) {
		setName(name);
		this.membership = membership.name();
	}
	
	public User(String name, String membership) {
		setName(name);
		setMembership(membership);
	}
	
	public enum Membership{
		Bronze, Silver, Gold;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	void setMembership(String membership) {
		this.membership = membership;
	}
	String getMembership() {
		return this.membership;
	}
	void setMembership(Membership membership) {
		this.membership = membership.name();
	}
}

