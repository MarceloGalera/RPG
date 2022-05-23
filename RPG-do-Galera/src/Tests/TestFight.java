package Tests;

import Classes.CharacterType;

public class TestFight {
	
	public static void main(String[] args) {

		// CHARACTERS
		                                          // name  , str, def, life, lvl
		CharacterType warrior = new CharacterType("Aragorn", 2.0, 3.0, 40.0, 1);
		CharacterType paladin = new CharacterType("Arthas", 2.5, 2.5, 35.0, 1);
		CharacterType mage = new CharacterType("Dumbledore", 3.3, 2.2, 32.0, 1);
		
		
//                             name  , str, def, life
		warrior.fightWarrior("Goblin", 2.0, 1.5, 15.0);
		warrior.fightWarrior("Orc", 3.0, 2.5, 25.0);
		warrior.fightWarrior("Medusa", 5.5, 2.5, 65.0);
		warrior.fightWarrior("Dragon", 20.0, 12.0, 150.0);
		System.out.println("----------------------------------");
		paladin.fightPaladin("Goblin", 2.0, 1.5, 15.0);
		paladin.fightPaladin("Orc", 3.0, 2.5, 25.0);
		paladin.fightPaladin("Medusa", 5.5, 2.5, 65.0);
		paladin.fightPaladin("Dragon", 20.0, 12.0, 150.0);
		System.out.println("----------------------------------");
		mage.fightMage("Goblin", 2.0, 1.5, 15.0);
		mage.fightMage("Orc", 3.0, 2.5, 25.0);
		mage.fightMage("Medusa", 5.5, 2.5, 65.0);
		mage.fightMage("Dragon", 20.0, 12.0, 150.0);
		
	}

}
