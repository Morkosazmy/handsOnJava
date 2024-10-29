package handsOnJava;

import java.util.ArrayList;
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
		
		Scanner scanner = new Scanner(new File("C:\\Users\\morko\\git\\repository1\\handsOnJava\\src\\Students\\"));
		
		List<String> students = new ArrayList<String>();
		
		while (scanner.hasNextLine()) {
			students.add(scanner.nextLine());
		}		
		System.out.println(students.size());
		for(int i = 0 ; i<students.size() ; i++) {
			System.out.println("name : " + students.get(i));
		}
	}

}