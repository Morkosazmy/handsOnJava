package MazeSolver;

import java.util.LinkedList;

public class MazeSolver {
	/*		 start of  day 9 		*/
/*	static int[][] Maze = {
			{2, 0, 1, 1},
			{0, 1, 1, 0},
			{1, 0, 0, 1},
			{0, 1, 1, 1}
	};*/						//TEMP comment
	//0 : wall
	//1 : path
	//2 : destination
	
	
	public static void main(String[] args) {
		
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
		
		int[][] Maze = {
				{0,0,2,0,1},
				{0,0,1,0,1},
				{0,1,0,0,0},
				{0,1,0,0,1},
				{0,1,1,1,2},
				{0,0,0,0,0}
		};
		// 0 : wall
		// 1 : path
		// 2 : destination ( u win if u find it )
		
		LinkedList<Position> path = new LinkedList<Position>(); //Creation of a linked list 
		int row;
		int colomn;
		
		Position p = new Position(2,3);// we have our starting position at the top right part of the maze.
		row = p.row;
		path.push(p);
		System.out.println("your position is in row : " + p.row); // row = up and down
		System.out.println("Your position is in colomn : "  + p.colomn); //colomn = left and right
		System.out.println("Starting position value = " + path.peek().row + " , " + path.peek().colomn);
		// now we know where we are, we have to assign the starting row and colomn now 
		System.out.println(Maze[0][0]);
		row = path.peek().row;	// row assigned ( we can use row instead of typing all that )
		colomn = path.peek().colomn; // colomn assigned ( we can use colomn instead of typing all that )
		System.out.println("ooga booga " + Maze[0][4]);
		// Let's assign the 4 directions : 
		Maze[row][colomn] = 0;

		while(true) {
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
			}
	/*We got all 4 directions of movement ! let's try them out*/ 		
			path.pop();
			if(path.size() <= 0) {
			System.out.println("No path found ! "); // I still dont understand this part where we have to use the if
													// statemeny 
			}
		}
		
		
		/* end of day 10 2nd try */
		
		/* start of day 11 */
	
	}
}
	

	

