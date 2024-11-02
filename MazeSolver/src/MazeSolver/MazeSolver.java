package MazeSolver;

import java.util.LinkedList;

public class MazeSolver {
	/*		 start of  day 9 		*/
	
	static Maze m = new Maze();
/*	static int[][] Maze = {
			{0,0,0,1,1,1,1,1,1,1,1}, //0
			{1,0,1,0,1,1,0,1,0,1,1}, //1
			{1,1,0,0,1,0,0,0,0,0,1}, //2
			{0,1,0,0,1,0,0,1,0,1,1}, //3
			{0,1,1,1,1,2,0,1,1,1,1}, //4
			{0,0,0,0,1,1,0,1,0,1,1}, //5
			{1,1,0,0,1,0,0,0,0,1,1}, //6
			{1,1,0,0,1,0,0,0,0,0,1}  //7 
		  // 0,1,2,3,4,5,6,7,8,9,10
	};*/						//TEMP comment
	//0 : wall
	//1 : path
	//2 : destination
	//static LinkedList<Position> path = new LinkedList<Position>(); //Creation of a linked list 


	// day 12 (Refactoring for more simple readability 
	public static void main(String[] args) {
		
		int[][] maze =  {{0,0,0,1,1,1,1,1,1,1,1}, //0
						 {1,0,1,0,1,1,0,1,0,1,1}, //1
						 {1,1,0,0,1,0,0,0,0,0,1}, //2
						 {0,1,0,0,1,0,0,1,0,1,1}, //3
						 {0,1,1,1,1,2,0,1,1,1,1}, //4
						 {0,0,0,0,1,1,0,1,0,1,1}, //5
						 {1,1,0,0,1,0,0,0,0,1,1}, //6
						 {1,1,0,0,1,0,0,0,0,0,1}  //7 
						 // 0,1,2,3,4,5,6,7,8,9,10
						};		
		
		m.maze = maze;
		m.start = new Position(7,10);
		m.path = new LinkedList<Position>();
		
		
		if(SolveMaze(new Position(7,10))){
			System.out.println("You won !");
		}
		else{
			System.out.println("No path sadly !!!");
		}
		

		
/*		LinkedList<Position> path = new LinkedList<Position>();  //TEMP COMMENT

		Position p = new Position(0, 3); //we use coordinate y for the row and coordinate x for the colomn
		//  (it looks confusing but it makes sense cause x is for horizontal movement = colomns and y is for vertical movements = rows ) .
		path.push(p);
		System.out.println(path.peek().x);
		System.out.println("Old value : " + Maze[path.peek().y][path.peek().x]);

		Maze[path.peek().y][path.peek().x] = 0;
		System.out.println("New value : " + Maze[path.peek().y][path.peek().x]);
*/																//TEMP COMMENT
		/*	 end of  day 9		 */
		
		/*	 start of  day 10	 */
		
		//int x = path.peek().x;
		//int y = path.peek().y;
		//A shortcut so we dont have to type path.peek().x or path.peek().y, we can just type x or y now ! 
		//System.out.println(Maze[y][x]); // Here we printed the same "New value :" but with the new ( y , x ) coordinates as a shortcut !
		//We declare how we move in all 4 directions ! 
		// Down is when y is getting plus one ( y+1 = Down )
		// Up is when y is getting subtracted by one ( y-1 = Up )
		// Right is when x is getting plus one ( x+1 = Right )
		// Left is when x is getting minus one ( x-1 = Left )
		//How do we do that though ! 
		//DOWN MOVEMENT :
/*																TEMP COMMENT		
		//int x;
		//int y;
		
		//DOWN MOVEMENT :
		while(true) {
			x = path.peek().x;
			y = path.peek().y;	
			Maze[y][x] = 0;
			
			if (Maze[y+1][x] == 2) {
				System.out.println("You Won after moving down ! ");
				return;
			}
			else if (Maze[y+1][x] == 1) {
				System.out.println("Moved Down");
				path.push(new Position(y+1,x));
				continue;
			}
			//Left Movement
			else if (Maze[y][x-1] == 2 ) {
				System.out.println("You won after moving left ! ");
				return;
			}
			else if (Maze[y][x-1] == 1 ) {
				System.out.println("Moved Left");
				path.push(new Position(y,x-1));
				continue;
			}
			//UP MOVEMENT
			else if( Maze[y-1][x] == 2) {
				System.out.println("You won after moving up ! ");
				return;
			}
			else if(Maze[y-1][x] == 1) {
				System.out.println("Moved Up");
				path.push(new Position(y-1,x));
				continue;
			}
			//Right MOVEMENT
			else if (Maze[y][x+1] == 2 ) {
				System.out.println("You won after moving right ! ");
				return;
			}
			else if (Maze[y][x+1] == 1 ) {
				System.out.println("Moved Right");
				path.push(new Position(y,x+1));
				continue;
			}
			
			path.pop();
			System.out.println("Moved Back !!!");
			if(path.size()<=0) {
				System.out.println("No path found");
			}

		}
	/*	//This code is only capable of finding the right path under the circumstance that it doesn't meet any path that
	 * //is out of boundaries. Or else it throws an exception !  
	 *	//
	 *	//
	 														//TEMP COMMENT
	/*		 end of day 10 		 */
		
	/*		start of day 10 2nd try		*/
	
	
		//2ND TRY TO IMPROVE OUR CODING 
		//We already have the Position class that contains point x and point y but we'll modify it to  " abcisse et ordonnee "
		

		// 0 : wall
		// 1 : path
		// 2 : destination ( u win if u find it )
		
	//	LinkedList<Position> path = new LinkedList<Position>(); //Creation of a linked list 
	//	int row;
	//	int colomn;
		
	//	Position p = new Position(2,3);// we have our starting position at the top right part of the maze.
	//	row = p.row;
	//	path.push(p);
	//	System.out.println("your position is in row : " + p.row); // row = up and down
	//	System.out.println("Your position is in colomn : "  + p.colomn); //colomn = left and right
	//	System.out.println("Starting position value = " + path.peek().row + " , " + path.peek().colomn);
		// now we know where we are, we have to assign the starting row and colomn now 
	//	System.out.println(Maze[0][0]);
	//	row = path.peek().row;	// row assigned ( we can use row instead of typing all that )
	//	colomn = path.peek().colomn; // colomn assigned ( we can use colomn instead of typing all that )
	//	System.out.println("ooga booga " + Maze[0][4]);
		// Let's assign the 4 directions : 
	//	Maze[row][colomn] = 0;
	//	System.out.println("AMERICA YAAAA");
	/*	while(true) {
			row = path.peek().row;
			colomn = path.peek().colomn; 
			Maze[row][colomn] = 0;
		//Move Down 
			if(Maze[row+1][colomn] == 2 ) {
				System.out.println("Moved Down : YOU WON !");
				break;
			}
			else if (Maze[row+1][colomn] == 1 ) {
				System.out.println("Moved Down.");
				path.push(new Position(row+1 , colomn));
				System.out.println(path.peek().row + " " + path.peek().colomn);
				//Maze[row+1][colomn] = 0;
				continue;
			}
		//Move Left
			else if (Maze[row][colomn-1] == 2 ) {
				System.out.println("Moved Left : YOU WON !");
				break;
			}
			else if (Maze[row][colomn-1] == 1 ) {
				System.out.println("Moved Left.");
				path.push(new Position(row , colomn-1));
				//Maze[row][colomn-1] = 0;
				continue;
			}
		//Move Up
			else if (Maze[row-1][colomn] == 2 ) {
				System.out.println("Moved Up : YOU WON !");
				break;
			}
			else if (Maze[row-1][colomn] == 1 ) {
				System.out.println("Moved Up.");
				path.push(new Position(row - 1 , colomn));
				//Maze[row-1][colomn] = 0;
				continue;
			}
		//Move Right
			else if (Maze[row][colomn+1] == 2) {
				System.out.println("Moved Right : YOU WON !");
				break;
			}
			else if (Maze[row][colomn+1] == 1 ) {
				System.out.println("Moved Right.");
				path.push(new Position(row , colomn + 1));
				//Maze[row][colomn+1] = 0;
				continue;
			}*/
	/*We got all 4 directions of movement ! let's try them out*/ 		
	//		path.pop();
	//		if(path.size() <= 0) {
	//		System.out.println("No path found ! "); // I still dont understand this part where we have to use the if
													// statemeny 
	//		}
	//	}
		
		//System.out.println("AMERICA YAAA");
		/* end of day 10 2nd try */
		
		/* start of day 11 */

		//LinkedList<Position> path = new LinkedList<Position>(); //Creation of a linked list 
	//	int row;
	//	int colomn;
	//	Position p = new Position(7,10);// we have our starting position at the top right part of the maze.
	//	row = p.row;
	//	path.push(p);
		
	//	row = path.peek().row;	// row assigned ( we can use row instead of typing all that )
	//	colomn = path.peek().colomn; // colomn assigned ( we can use colomn instead of typing all that )
/*
		while(true) {
			row = path.peek().row;
			colomn = path.peek().colomn; 
			Maze[row][colomn] = 0;
		
		//Move Down 
		if (isValid(row+1,colomn)) {
			if(Maze[row+1][colomn] == 2 ) {
				System.out.println("Moved Down : YOU WON !");
				break;
			}
			else if (Maze[row+1][colomn] == 1 ) {
				System.out.println("Moved Down.");
				path.push(new Position(row+1 , colomn));
				System.out.println(path.peek().row + " " + path.peek().colomn);
				//Maze[row+1][colomn] = 0;
				continue;
			}
		}	
		//Move Left
		if (isValid(row,colomn-1)) {
			if (Maze[row][colomn-1] == 2 ) {
				System.out.println("Moved Left : YOU WON !");
				break;
			}
			else if (Maze[row][colomn-1] == 1 ) {
				System.out.println("Moved Left.");
				path.push(new Position(row , colomn-1));
				//Maze[row][colomn-1] = 0;
				System.out.println(path.peek().row + " " + path.peek().colomn);

				continue;
			}
		}
		//Move Up
		if (isValid(row-1,colomn)) {
			if (Maze[row-1][colomn] == 2 ) {
				System.out.println("Moved Up : YOU WON !");
				break;
			}
			else if (Maze[row-1][colomn] == 1 ) {
				System.out.println("Moved Up.");
				path.push(new Position(row - 1 , colomn));
				//Maze[row-1][colomn] = 0;
				System.out.println(path.peek().row + " " + path.peek().colomn);

				continue;
			}
		}
		
		//Move Right
		if (isValid(row,colomn+1)) {
			if (Maze[row][colomn+1] == 2) {
				System.out.println("Moved Right : YOU WON !");
				break;
			}
			else if (Maze[row][colomn+1] == 1 ) {
				System.out.println("Moved Right.");
				path.push(new Position(row , colomn + 1));
				//Maze[row][colomn+1] = 0;
				System.out.println(path.peek().row + " " + path.peek().colomn);

				continue;
			}
		}
			System.out.println("path size = " + path.size());
			path.pop();
				System.out.println("We moved back to :");
					if(path.size() <= 0) {
						System.out.println("No path found ! ");
						return;
					}
					
	*/
	
		
}
	public static boolean isValid(int row , int colomn) {
		if(row < 0 || row >= m.maze.length ||
		   colomn < 0 || colomn >= m.maze[row].length	) {
			return false;
		}
		return true;
	}
	
		/*	end of day 11	*/
		
		/* start of day 12 */

	private static boolean SolveMaze(Position p) {
	int row;
	int colomn;
	//Position p = new Position(7,10);// we have our starting position at the top right part of the maze.
	row = p.row;
	m.path.push(p);
	
	row = m.path.peek().row;	// row assigned ( we can use row instead of typing all that )
	colomn = m.path.peek().colomn; // colomn assigned ( we can use colomn instead of typing all that )

	
	while(true) {
		row = m.path.peek().row;
		colomn = m.path.peek().colomn; 
		m.maze[row][colomn] = 0;
	
	//Move Down 
	if (isValid(row+1,colomn)) {
		if(m.maze[row+1][colomn] == 2 ) {
			System.out.println("Moved Down");
			return true;
		}
		else if (m.maze[row+1][colomn] == 1 ) {
			System.out.println("Moved Down.");
			m.path.push(new Position(row+1 , colomn));
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);
			//Maze[row+1][colomn] = 0;
			continue;
		}
	}	
	//Move Left
	if (isValid(row,colomn-1)) {
		if (m.maze[row][colomn-1] == 2 ) {
			System.out.println("Moved Left");
			return true;
		}
		else if (m.maze[row][colomn-1] == 1 ) {
			System.out.println("Moved Left.");
			m.path.push(new Position(row , colomn-1));
			//Maze[row][colomn-1] = 0;
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);

			continue;
		}
	}
	//Move Up
	if (isValid(row-1,colomn)) {
		if (m.maze[row-1][colomn] == 2 ) {
			System.out.println("Moved Up");
			return true;
		}
		else if (m.maze[row-1][colomn] == 1 ) {
			System.out.println("Moved Up.");
			m.path.push(new Position(row - 1 , colomn));
			//Maze[row-1][colomn] = 0;
			System.out.println(m.path.peek().row + " " + m.path.peek().colomn);

			continue;
		}
	}
	
	//Move Right
	if (isValid(row,colomn+1)) {
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
			System.out.println("We moved back to :");
				if(m.path.size() <= 0) {
				//	System.out.println("No path found ! ");
					return false;
				}

	}	
	
	
	
	
	
	
	
	
	
	
	
		// 1 2 3 4 || 1 3 4 2 || 1 2 4 3 || 1 3 2 4 || 1 4 2 3 || 1 4 3 2 || 
	 	// 2 1 3 4 || 2 1 4 3 || 2 3 1 4 || 2 3 4 1 || 2 4 1 3 || 2 4 3 1 ||
		// 3 1 2 4 || 3 1 4 2 || 3 2 1 4 || 3 2 4 1 || 3 4 1 2 || 3 4 2 1 ||
		// 4 1 2 3 || 4 1 3 2 || 4 2 1 3 || 4 2 3 1 || 4 3 1 2 || 4 3 2 1 ||
}	
}
	

