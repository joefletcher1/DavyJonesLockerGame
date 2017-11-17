
public class Location {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public void navigateNorth() {
		this.y++;
	}

	public void navigateSouth() {
		this.y--;
	}

	public void navigateWest() {
		this.x--;
	}

	public void navigateEast() {
		this.x++;
	}
	
}
