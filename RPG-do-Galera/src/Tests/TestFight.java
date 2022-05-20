package Tests;

import Classes.CharacterType;

public class TestFight {
	
	public static void main(String[] args) {

		// CHARACTERS
		CharacterType warrior = new CharacterType("Aragorn", 4.0, 7.0, 70.0, 1);
		CharacterType arthas = new CharacterType("Arthas", 5.5, 5.0, 55.0, 1);
		CharacterType dumbledore = new CharacterType("Dumbledore", 9.0, 3.0, 38.0, 1);
		
		
	
		warrior.fightWarrior("Goblin", 2.0, 1.5, 15.0);
		warrior.fightWarrior("Orc", 3.0, 2.5, 25.0);
		warrior.fightWarrior("Medusa", 5.5, 2.5, 65.0);
		warrior.fightWarrior("Dragon", 20.0, 12.0, 150.0);
		
	}

}
