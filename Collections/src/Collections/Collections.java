package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Collections {

	public static void main(String[] args) {

		HashSet<Person> people = new HashSet<Person>();
		
	
		Person p = new Person ("email@gmail.com","Sally");
		Position a = new Position(3,3);
		p.position = a;
		
		Person q = new Person ("email@gmail.com","Sally");
		Position b = new Position(3,3);
		q.position = b;

		people.add(q);
		people.add(p);
		
		System.out.println("p lastName = " + p.lastName);
		System.out.println();
		System.out.println("q lastName = " + q.lastName);
		System.out.println();
		System.out.println("p hashcode = " + p.hashCode());
		System.out.println();
		System.out.println("q hashcode = " + q.hashCode());
		System.out.println();
		System.out.println("p email = " + p.email);
		System.out.println();
		System.out.println("q email = " + q.email);
		System.out.println();
		System.out.println("a coordinates = " + a.x + " " + a.y);
		System.out.println();
		System.out.println("b coordinates = " + b.x + " " + b.y);
		System.out.println();
		System.out.println("a hashcode = " + a.hashCode());
		System.out.println("b hashcode = " + b.hashCode());
		System.out.println(a.equals(b));
		System.out.println();
		System.out.println(p.equals(q));
		System.out.println();
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println();
		System.out.println(p.hashCode() == q.hashCode());
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(people.contains(p));
		System.out.println(people.contains(q));
		System.out.println();
		for(Person person : people) {
			System.out.println(person.email);
			System.out.println(person.lastName);
		//	System.out.println("coordinates of that person is : " + person.get(x) +" " + person.y);
		}
		System.out.println();
		System.out.println();
		HashMap<String, Person> peopleMap = new HashMap<String, Person>();
		peopleMap.put("email@gmail.com", q);
		System.out.println(peopleMap.containsKey("email@gmail.com"));
		System.out.println(peopleMap.containsValue(q));
		/*	names.add("ahmed");
		names.add("3ood");
		names.add("gebna");
		names.add("haze2");
		names.add("morkos");
		names.add("mezo");
		names.add("markk");
		names.add("zata");
		names.add("slay");
		names.add("seka");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println(names.contains("mezo"));
		
	*/		
		
		
		
		
		
		
		
		
		
		
		
	/*	Position a = new Position (3,3);
		Position b = new Position (3,3);
		
		System.out.println(a.x + " , " + a.y);
		System.out.println(b.x + " , " + b.y); // it gets the coordinates right ! 
		System.out.println(a.equals(b)); // this one works too 
		
		//Position gogo = new Position(new Position(3,5));
		//Position gaga = new Position(new Position(3,5));
		
		//System.out.println(gogo.position);
		//System.out.println(gaga.position); // here is the problem 
		
		//Person p = new Person("person@gmail.com", "Sally");
		//Person q = new Person("person@gmail.com", "Sally");
		
		Person p = new Person("person@gmail.com", "Sally");
		Person q = new Person("person@gmail.com", "Sally"); //hashCode is different but equals method is still giving true ! 
		
		p.position = a;
		p.position = b;
		
		System.out.println(p.lastName);
		System.out.println(q.lastName);
		System.out.println(p.email);
		System.out.println(q.email);
		System.out.println(p.getClass());
		System.out.println(q.getClass());
		
		
		System.out.println();
		System.out.println(p);
		System.out.println(q);
		
		System.out.println(p.hashCode() + "\n");
		System.out.println(q.hashCode() + "\n");
		System.out.println("\t" + p.equals(q) + "\n"); // false
		System.out.println(p.hashCode()); //hashcode = 1225358173
		System.out.println(q.hashCode()); //hashcode = 1848402763
		System.out.println("\t" + (p.hashCode() == q.hashCode())); // hashcode is an integer so we compare with == 
		//let's override, the Override of the hashCode makes it return the hashCode of the email inside the Person (p.email) so for p and q we
		// have the same exact email which means they'll have the same set of numbers when we use hashCode on them !
		
		//let's override the equals methode ! 
		System.out.println("\t" + p.equals(q)); // only compares emails so it returns true even though the lastName is different
		
		
	*/	
	}

}


















/*		String name = "Morkos";
String notName = "Morkos";

System.out.println(name.hashCode());
System.out.println(notName.hashCode());
System.out.println(" the hashcode is : " + name.hashCode());

HashMap<String, Integer> ids = new HashMap<String, Integer>();
*/		
/*ids.put("Matcha", 1);
ids.put("Mayo", 6846);
ids.put("Martin", 16);
ids.put("Moo", 777);
ids.put("Moira", 648);
ids.put("Morkos", 6846);
ids.put("Mark", 6846);
ids.put("Mocha", 648);
ids.put("Mocha", 669); // value is modified */

//ids.put("Mocha", 649);
/*	System.out.println(ids.get("Mocha"));
System.out.println(ids.get("Moira"));
System.out.println(ids.get("Morkos"));
System.out.println(ids.get("Mark"));
System.out.println(ids.get("Moo"));
System.out.println(ids.get("Matcha") + "\n");*/
//usage of a HashMap ! 

/*	Set<String> keys = ids.keySet();

		
for(String key : keys) {
	System.out.println(key + " : " + ids.get(key));	
}*/
