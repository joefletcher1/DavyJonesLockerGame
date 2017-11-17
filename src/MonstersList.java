import java.util.ArrayList;

public class MonstersList {
	private ArrayList<Monster> monsters;
	
	public ArrayList<Monster> getMonsters() {
		return monsters;
	}

	public MonstersList() {
		monsters = new ArrayList<Monster>();
	}
	
	public void addMonsterToList(Monster monster){
		monsters.add(monster);
	}

	public boolean checkIfDuplicateCoords(Location location) {
		for (Monster m : monsters) {
			if (m.getLocation().getX() == location.getY() && m.getLocation().getY() == location.getY()) {
				return true;
			}
		}
		return false;
	}
}
