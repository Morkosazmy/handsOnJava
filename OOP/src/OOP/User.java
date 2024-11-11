package OOP;

import java.util.List;

public class User {
	private String firstName;
	private String membership;	
	
	public static List<User> users;
	
	public User() {
		
	}
	
	public User(String firstName, Membership membership) {
		setFirstName(firstName);
		this.membership = membership.name();
	}
	
	public User(String name, String membership) {
		setFirstName(name);
		setMembership(membership);
	}
	
	public static void printUsersData() {
		for (User user : users) {
			System.out.println("First Name = " + user.firstName + " , Membership = " + user.membership);
		}
	}
	
	public enum Membership{
		Bronze, Silver, Gold;
	}
	void setFirstName(String name) {
		this.firstName = name;
	}
	String getFirstName() {
		return this.firstName;
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
	@Override
	public String toString() {
		return getFirstName() + " " + getMembership();
	}
	public boolean equals(User u2) {
		if(getFirstName()==u2.getFirstName() && getMembership()==u2.getMembership())
			return true;
		return false;
	}
}

