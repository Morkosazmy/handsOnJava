package MazeSolver;

import java.util.LinkedList;

public class MazeSolver {
	/*		 start of  day 9 		*/
	static int[][] Maze = {
			{2, 0, 1, 1},
			{0, 1, 1, 0},
			{1, 0, 0, 1},
			{0, 1, 1, 1}
	};
	//0 : wall
	//1 : path
	//2 : destination
	
	
	public static void main(String[] args) {
		
		LinkedList<Position> path = new LinkedList<Position>();

		Position p = new Position(0, 3); //we use coordinate y for the row and coordinate x for the colomn
		//  (it looks confusing but it makes sense cause x is for horizontal movement = colomns and y is for vertical movements = rows ) .
		path.push(p);
		System.out.println(path.peek().x);
		System.out.println("Old value : " + Maze[path.peek().y][path.peek().x]);

		Maze[path.peek().y][path.peek().x] = 0;
		System.out.println("New value : " + Maze[path.peek().y][path.peek().x]);

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
		
		int x;
		int y;
		
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
	/* This code is only capable of finding the right path under the circumstance that it doesn't meet any path that
	 * is out of boundaries. Or else it throws an exception !  
	 */
	
	/*		 end of day 10 		 */
		
	/*		start of day 11		*/
	
	
	
	
	
	
	
	}
}
	

	

