package handsOnJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class handsOnJava {

	public static void main(String[] args) throws FileNotFoundException { /* File not found exception is for the 4th code ! */
	
		/*	1st code	*/
	/*	
	    Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name ?");
		String s = scanner.nextLine();
		String t;
		t = "hello";
		
		System.out.println(t +" " + s + "\n" );
		System.out.println("Now we'll be getting the sum of two numbers : \n");
		System.out.println("Please enter the value 'x' : ");
		int x = scanner.nextInt();
		System.out.println("Please enter the value 'y' : " );
		int y = scanner.nextInt();
		int sum = x + y ;
		System.out.println("the sum of the number ( " + x + " )" + " and the number ( " + y + " )" + " is : " + sum );
		if (sum == 10)
			System.out.println("u got the only sum in the if condition, CONGRATS ! ");
		else
			System.out.println("not the sum we were expecting sorry ! "); 
			
		scanner.close();
			*/

			/*2nd code*/		
		/* this code will only work if my name is Morkos */
/*		
	System.out.println("Write in your name please : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (name.equals("Morkos")) {
		System.out.println("This Code can solve 2nd degree equations under the condition that they are not complex ( only in R ) ");
		System.out.println("The equation is of the following type : ");
		System.out.println("aX² + bX + c = d");
		int a;
		int b;
		int c;
		int d;
		double x;
		double delta;
		double sol1;
		double sol2;
		System.out.println("Enter the value of 'a' : ");
		a = scanner.nextInt();
		System.out.println("Enter the value of 'b' : ");
		b = scanner.nextInt();
		System.out.println("Enter the value of 'c' : ");
		c = scanner.nextInt();
		System.out.println("Enter the value of 'd' : ");
		d = scanner.nextInt();
		
		System.out.println("The following equation is the equation u just entered before solving for X :");
		System.out.println(a + "X² + " + b + "X + " + c + " = " + d);
		
		if (c>d) {
			System.out.println("You went into the complex side so the program cant work anymore ! BYE");
		}
		else {
		c = c-d ;
		int tmp = d;
		d = 0;
		System.out.println("First we need to have d = 0 :");
		System.out.println(a + "X² + " + b + "X + " + c + " = " + d);
		delta = b*b - 4*a*c;
		System.out.println("delta equals b²-4ac = " + delta);
		sol1 = ( ( (-b) + Math.sqrt(delta) ) / (2*a) );
		sol2 = ( ( (-b) - Math.sqrt(delta) ) / (2*a) );
		System.out.println("The solution of the following equation is :\n");
		System.out.println("X1 = " + sol1);
		System.out.println();
		System.out.println("X2 = " + sol2);
		System.out.println();
		System.out.println("The final equation with X1 implied is :\n");
		String sol1f = String.format("%.2f", sol1);
		System.out.println();
		System.out.println(a + " * " + sol1f + "² + " + b + " * " + sol1f + " + " + c + " = " + tmp );
		System.out.println("The final equation with X2 implied is :\n");
		String sol2f = String.format("%.2f", sol2);
		System.out.println(a + " * " + sol2f + "² + " + b + " * " + sol2f + " + " + c + " = " + tmp );
		}
	}
		else
			System.out.println("This program isn't goint to work because you inserted the wrong name ! ");
			scanner.close();
		*/
		
		
		/*	3rd code	*/ /***************************************************************/
		
		/* in this code we'll try to take the input of an array of ints ( int[] for grades as an example ) : */
		
	/*	System.out.println("Enter the size of the array of grades : ");
		int size;
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		
		int[] grades = new int[size];
		int i;
		System.out.println("Enter the value and click ENTER after typing the numeric value : ");
		for (i = 0; i<size; i++) {
			grades [i] = scanner.nextInt();
			System.out.println("You entered the value " + grades[i]);
		}
		
		System.out.println("The list of the grades you entered in reverse is : ");
		System.out.println("size " + size);
		for(i=size; i>0; i--) {
			System.out.println( "grade [" + i + "] " +"= " + grades[i-1]);
			}
			scanner.close();
		*/
		
		/*4th code*/
		/*This code can read from a text file*/
	/*	
		Scanner scanner = new Scanner(new File("C:\\Users\\morko\\git\\repository1\\handsOnJava\\src\\Students\\"));
		
		List<String> students = new ArrayList<String>();
		
		while (scanner.hasNextLine()) {
			students.add(scanner.nextLine());
		}		
		System.out.println(students.size());
		for(int i = 0 ; i<students.size() ; i++) {
			System.out.println("name : " + students.get(i));
		}
		*/
		
		
		/*5th code*/
		/*This code is for using LinkedList as a Queue*/
	/*	LinkedList<String> students = new LinkedList<String>(); //we have a linked list named students that we can use now ! 
		students.add("Morkos");
		students.add("Sally");
		students.add("Caleb\n");
		for(String student : students) {
			System.out.println(student);
		}
		System.out.println("the names above this line are the ones in the list currently and the following ones are the names of the ones removed after this printed line :\n");
		System.out.println(students.remove());
		System.out.println(students.remove());
		System.out.println(students.remove());
		//the code above uses the LinkedList as a Queue ( FIFO : First In First Out ) ! 
		//now we'll be trying to get the LinkedList to work as a ( FILO : First In Last Out ) !
		
		students.add("Morkos");
		students.add("Sally");
		students.add("Caleb\n");
		
		System.out.println("The current list contains the following names in order :\n");
		for(String student : students) {
			System.out.println(student);
		}
		//let's try to dequeue from the opposite side 
		System.out.println("The following names are removed from the LinkedList in order !\n");
		System.out.println(students.removeLast() + students.removeLast());
		System.out.println(students.removeLast() + "\n"); // It works ! We used removeLast so i kinda told it to go from the last one !
		//let's try another approach 
		System.out.println("Re-adding the students in the same order as before\n");
		students.add("Morkos");
		students.add("Sally");
		students.add("Caleb");
		for (String student : students) {
			System.out.println(student);
		}
		
		for(int i = students.size(); i > 0; i--) {
			System.out.println("Removed : " + students.remove(i-1)); //Here i actually used a loop to start from the end of the LinkedList till it's beginning !
		}
		
		// I just cant figure out why when i use students.remove() on the last one it prints an extra line of "\n", it just makes no sense and in the first dequeue try 
		//it doesnt occur because i used "System.out.println(students.removeLast() + students.removeLast());" Kinda weird...
		// the extra line was because i used to add caleb\n instead of caleb
		*/
		
		
		/*6th code (day 6 video) */
		
		/* In this code i'll be trying to compare add and push commands in a LinkedList and trying to equally figure out the difference between remove, removeFirst and pop. */
		/*
		int i;
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> students = new LinkedList<String>();
		students.add("Morkos elzany");
		students.add("zanyook");
		students.add("Caleb");
		students.push("Raslan");
		students.push("Raslan");
		students.add("geeko");
		
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println();
	//	LinkedList<String> removedStudents = new LinkedList<String>();
	//	String secondName;
	//	String chosenName;
	/*	System.out.println("Enter your name ! ");
		chosenName = scanner.nextLine();
		secondName = students.get(0);
		int where;
		System.out.println("Where do you want to put this name ! (your limit is  " + students.size());
		where = scanner.nextInt();
		for(i = 0; i<where-1; i++) {
			removedStudents.push(students.pop());
		}*/
	//	students.push(chosenName);
	/*	for(i = 0; i<where-1; i++) {
			students.push(removedStudents.pop());
		}*/
	//	students.pop();
	//	students.remove(); //both remove and pop take out the object on the top of the list, while removeLast removes the one on the bottom. the ONLY exception is that remove() can take 
		//an integer to choose where the index to be removed is or even take the object itself.
	//	for (String student : students) {
	//		System.out.println(student);
	//	}*/
		
		/*	7th CODE */ /*************************************************************************/
		/* ITERATORS *//**************************************************************************/

		
		
		
		
}
}	