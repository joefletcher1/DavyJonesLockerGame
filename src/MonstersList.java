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

	public boolean checkIfDuplicateCoords(Location monsterLoc, Location treasureLoc) {
		for (Monster m : monsters) {
			if (m.getLocation().getX() == monsterLoc.getY() && m.getLocation().getY() == monsterLoc.getY()
					&& m.getLocation().getX() == treasureLoc.getY() && m.getLocation().getY() == treasureLoc.getY()) {
				return true;
			}
		}
		return false;
	}
}
