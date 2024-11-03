package MazeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;

public class MazeSolver {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Maze> mazes = readMazes();
		
		/*if(mazes.size()>0) {

			System.out.println(" maze size : " + mazes.size());
				
		}*/
		//System.out.println(" maze size : " + mazes.size());
		int i = 0;
		while(i<mazes.size()) {
			System.out.println(" value of i : " + i);
			if(SolveMaze(mazes.get(i))){
				System.out.println("You won !\n\n");
			}
			else{
				System.out.println("No path sadly !!!");
			}
			i++;
		}	
	
}
	
	private static ArrayList<Maze> readMazes() throws FileNotFoundException {
		ArrayList<Maze> mazes = new ArrayList<Maze>();

		int numberOfMazes = 0;
		Scanner scanner = new Scanner(new File("mazes.txt"));
		while(scanner.hasNext()) {
		Maze m = new Maze();

		//Scanner scanner = new Scanner(new File("mazes.txt"));
		int rows = Integer.parseInt(scanner.nextLine());
		m.maze = new int[rows][];
		
		for (int i = 0; i<rows;i++) {
			String line = scanner.nextLine();
			m.maze[i] = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();	
		}
		
		m.start = new Position(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
		m.path = new LinkedList<Position>();
		
		mazes.add(m);
		scanner.nextLine();
		
		numberOfMazes++;		
	}
		scanner.close();
		System.out.println("number of mazes = " + numberOfMazes);
		return mazes;

}	
	
	
	public static boolean isValid(int row , int colomn, Maze m) {
		if(row < 0 || row >= m.maze.length ||
		   colomn < 0 || colomn >= m.maze[row].length	) {
			return false;
		}
		return true;
	}

	private static boolean SolveMaze(Maze m) {
	Position p = m.start;
	int row;
	int colomn;

	m.path.push(p);
	
	row = m.path.peek().row;	// row assigned ( we can use row instead of typing all that )
	colomn = m.path.peek().colomn; // colomn assigned ( we can use colomn instead of typing all that )

	
	while(true) {
		row = m.path.peek().row;
		colomn = m.path.peek().colomn; 
		m.maze[row][colomn] = 0;
	
	//Move Down 
	if (isValid(row+1,colomn, m)) {
		if(m.maze[row+1][colomn] == 2 ) {
			System.out.println("Moved Down");
			return true;
		}
		else if (m.maze[row+1][colomn] == 1 ) {
			System.out.println("Moved Down.");
			m.path.push(new Position(row+1 , colomn));
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);
			continue;
		}
	}	
	//Move Left
	if (isValid(row,colomn-1, m)) {
		if (m.maze[row][colomn-1] == 2 ) {
			System.out.println("Moved Left");
			return true;
		}
		else if (m.maze[row][colomn-1] == 1 ) {
			System.out.println("Moved Left.");
			m.path.push(new Position(row , colomn-1));
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);

			continue;
		}
	}
	//Move Up
	if (isValid(row-1,colomn, m)) {
		if (m.maze[row-1][colomn] == 2 ) {
			System.out.println("Moved Up");
			return true;
		}
		else if (m.maze[row-1][colomn] == 1 ) {
			System.out.println("Moved Up.");
			m.path.push(new Position(row - 1 , colomn));
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);

			continue;
		}
	}
	
	//Move Right
	if (isValid(row,colomn+1, m)) {
		if (m.maze[row][colomn+1] == 2) {
			System.out.println("Moved Right");
			return true;
		}
		else if (m.maze[row][colomn+1] == 1 ) {
			System.out.println("Moved Right.");
			m.path.push(new Position(row , colomn + 1));
			//Maze[row][colomn+1] = 0;
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);

			continue;
		}
	}
		System.out.println("path size = " + m.path.size());
		m.path.pop();
			System.out.println("We moved back.\n");
				if(m.path.size() <= 0) {
				//	System.out.println("No path found ! ");
					return false;
				}

	}	
	
	/*	end of day 15	*/
	//email reset//

}	
}