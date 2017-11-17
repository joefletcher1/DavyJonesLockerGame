
public class BarrenMooreMain {

	public static void main(String[] args) {
		Player p1;
		Treasure t;
		MonstersList m;
		boolean gameEnded = false;
		int gridSize = 25;		//initial grid size possibility
		int numberOfMonsters = 100;
		
		String s;
		
		startGame();
		
		p1 = new Player(gridSize);
		t = new Treasure(gridSize);
		m = new MonstersList();
		
		while (m.getMonsters().size() < numberOfMonsters) {
			
			Monster monster = new Monster(gridSize);
			if(!m.checkIfDuplicateCoords(monster.getLocation(), t.getLocation())) {
				m.addMonsterToList(monster);
			}
		}
		
		System.out.println(p1.calculateResultant(t));

		while (gameEnded != true) {
			
			s = Input.getInput("> ");
			
			if(p1.moveDirection(s, t, m)) {
				gameEnded = true;
				System.out.println("Congratulations!! You have located the tresure in " + p1.getNumberOfMoves() + " moves !!!");
			}
			else if (p1.getHealth() == 0){
				gameEnded = true;
				System.out.println("You have been swallowed by the Sand Monsters!");
			}
			else {
				System.out.println(p1.calculateResultant(t));
				p1.incNumberOfMoves();
			}
		
		}
		
		
		System.out.println();
		System.out.println("Game over");
		
	}

	public static void startGame() {

		String s;
		boolean look = false;
		boolean test = false;

		System.out.println("The adventure of Davy Jones' Locker");
		System.out.println();

		while (test != true) {

			s = Input.getInput("Arrrr! You are stuck in Davy Jones' Locker. Enter \"pirate\" to start: ");
			if (s.equalsIgnoreCase("pirate")) {
				look = true;
				System.out.println();
				System.out.println("An infinite white abyss, with nothing but sand as far as the eye can see.");
				System.out.println("");
				System.out.println("You notice a small compass in your hand, but arrrr, be careful as this compass doesn't point North!");
				System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
				System.out.println();
				System.out.println("Beware of the Sand Monsters that appear from no where!");
				System.out.println();
			} else {
				System.out.println("Command not recognised. (Hint: type \"look\".)");
			}

			while (look != false) {
				s = Input.getInput("Try \"north\",\"south\",\"east\",or \"west\" (can use numeric keys 2, 4, 6, 8): ");
				if (testEWNS(s)) {
					test = true;
					look = false;

				} else {
					System.out.println("Command not recognised. (Hint: type \"north\".)");
				}
			}
		}
	}

	private static boolean testEWNS(String input) {
		return input.equalsIgnoreCase("west") || input.equalsIgnoreCase("east") 
				|| input.equalsIgnoreCase("north") || input.equalsIgnoreCase("south") 
				|| input.equalsIgnoreCase("2") || input.equalsIgnoreCase("4") 
				|| input.equalsIgnoreCase("6") || input.equalsIgnoreCase("8");
	}

}
