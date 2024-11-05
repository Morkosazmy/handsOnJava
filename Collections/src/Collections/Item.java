package Collections;

public class Item<T, U> {
	T x;
	U y;
	
	T getX() {
		return x;
	}
	void setX(T x) {
		this.x = x;
	}
	
	U getY() {
		return y;
	}
	
	void setY(U y) {
		this.y = y;
	}
	
	
	// fine for now
	/*T outputX() {
		return x.lastName();
	}*/
}