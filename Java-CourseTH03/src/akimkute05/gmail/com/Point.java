package akimkute05.gmail.com;

public class Point {
	private float x;// Tọa độ x
	private float y;// Tọa độ y
 
	public Point() {
		this.setX(Math.round(Math.random() * 50));
		this.setY(Math.round(Math.random() * 50));
	}

	float getX() {
		return x;
	}

	private void setX(float x) {
		this.x = x;
	}

	float getY() {
		return y;
	}

	private void setY(float y) {
		this.y = y;
	}
}
