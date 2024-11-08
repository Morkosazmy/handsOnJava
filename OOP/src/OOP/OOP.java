package OOP;

public class OOP {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("This code kinda works");
		User u = new User();
		u.setName("Morkos");
		u.setMembership("Gold");
		
		User u2 = new User();
		u2.setName("Caleb");
		u2.setMembership(User.Membership.Bronze);

		System.out.println("The first user is called : " + u.getName() + " and his membership is " + u.getMembership());
		System.out.println("The second user is called : " + u2.getName() + " and his membership is " + u2.getMembership());
	}

}

//refresh on Object Oriented Programming (OOP)
