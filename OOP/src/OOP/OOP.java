package OOP;

import java.util.ArrayList;
import java.util.Collections;

public class OOP {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("This code kinda works");
		User u = new User();
		u.setFirstName("Morkos");
		u.setMembership("Gold");
		
		User u2 = new User();
		u2.setFirstName("Morkos");
		u2.setMembership(User.Membership.Gold);
		
		User.users = new ArrayList<User>();
		
		System.out.println("The first user is called : " + u.getFirstName() + " and his membership is " + u.getMembership());
		System.out.println("The second user is called : " + u2.getFirstName() + " and his membership is " + u2.getMembership());
		System.out.println(u.toString());
		System.out.println(u);
		System.out.println(u.equals(u2));
		
		Collections.addAll(User.users, u,u2);
		
		for(User user : User.users) {
			System.out.println("First Name = " + user.getFirstName() + " , Membership = " + user.getMembership());
		}
		
		System.out.println();
		
		User.printUsersData();
		
		Student student = new Student();
		student.getVerified();
		
		student.setFirstName("coco");
		student.setMembership("Gold");
		student.setVerified(false);
		
		System.out.println(student.getVerified());
		System.out.println(student.getFirstName());
		System.out.println(student.getMembership());
		
		
		
		
		// we can weather create a new List and give it a name to store the users in it OR we can create a static List in the User class
		// that we'll use to assign the users in ! 
	}

}

//refresh on Object Oriented Programming (OOP)
