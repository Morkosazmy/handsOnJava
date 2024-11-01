package MazeSolver;

import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] Maze = {
			{2, 0, 1, 1},
			{1, 0, 0, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	//0 : wall
	//1 : path
	//2 : destination
	
	
	public static void main(String[] args) {
		
		LinkedList<Position> path = new LinkedList<Position>();

		Position p = new Position(3,0); //we use coordinate y for the row and coordinate x for the colomn
		//  (it looks confusing but it makes sense cause x is for horizontal movement = colomns and y is for vertical movements = rows ) .
		path.push(p);
		System.out.println(path.peek().x);
		System.out.println("Old value : " + Maze[path.peek().y][path.peek().x]);

		Maze[path.peek().y][path.peek().x] = 0;
		System.out.println("New value : " + Maze[path.peek().y][path.peek().x]);

	}

}
