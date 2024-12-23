package Collections;

import java.util.Objects;

public class Position {
	int x;
	int y;
	
	Position(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null) {
			return false; // cause it is required to have an int instead of being null
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Position other = (Position) obj;
		if(x != other.x) {
			return false;
		}
		if(y != other.y) {
			return false;
		}
		return true;
	}
}
