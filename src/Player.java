import java.util.ArrayList;

public class Player extends Item {
	
	private int numberOfMoves;
	private int health;

	public Player(int squareSize) {
		super(squareSize);
		this.setHealth(5);
	}

	public double calculateResultant(Treasure t) {
		
		return (double)Math.round(Math.hypot(t.getLocation().getX() - super.getLocation().getX(), t.getLocation().getY() - super.getLocation().getY()) * 1000d) / 1000d;
	}

	public boolean moveDirection(String s, Treasure t, MonstersList m) {
		
		switch (s.toLowerCase()) {
			case ("east") : moveEast();
				break;
			case ("6") : moveEast();
				break;
			case "west" : moveWest();
				break;
			case "4" : moveWest();
				break;
			case "south" : moveSouth();
				break;
			case "2" : moveSouth();
				break;
			case "north" : moveNorth();
				break;
			case "8" : moveNorth();
				break;
			default :
				System.out.println("Please enter a valid direction!");
		}
		
		if (noMonsters(m.getMonsters())) {
			if (checkIfOnTreasure(t))
				return true;
			else {
				return false;
			}
		}
		else {
			this.health--;
			System.out.println("Ahhhh!!! You hit a monster!! Health = " + (health * 100 / 5) + "%" );
			return false;
		}
		
	}
	
	private boolean noMonsters(ArrayList<Monster> m) {
		for (Monster f : m) {
			
			if (f.getLocation().getX() == this.getLocation().getX() && f.getLocation().getY() == this.getLocation().getY()) {
				return false;
			}
		}
		return true;
	}

	private boolean checkIfOnTreasure(Treasure t) {
		 
		return t.getLocation().getX() == super.getLocation().getX() && t.getLocation().getY() == super.getLocation().getY();
	}

	private void moveNorth() {
		super.getLocation().navigateNorth();
	}

	private void moveSouth() {
		super.getLocation().navigateSouth();
		
	}

	private void moveWest() {
		super.getLocation().navigateWest();
		
	}

	private void moveEast() {
		super.getLocation().navigateEast();
		
	}

	public int getNumberOfMoves() {
		return numberOfMoves;
	}

	public void incNumberOfMoves() {
		this.numberOfMoves++;
	}

	public int getHealth() {
		return health;
	}
	
	private void setHealth(int health) {
		this.health = health;
	}
	
}
