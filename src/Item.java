
public abstract class Item {
	private Location location;
	private int squareSize;
	
	public Item(int squareSize) {
		this.squareSize = squareSize;
		this.location = new Location();
		generateLocation();
	}


	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getSquareSize() {
		return squareSize;
	}

	public void setSquareSize(int squareSize) {
		this.squareSize = squareSize;
	}
	
	private void generateLocation() {
		Generate gen = new Generate();
		
		location.setX((int)(gen.getRandomNumber() * squareSize));
		location.setY((int)(gen.getRandomNumber() * squareSize));
	}

}
