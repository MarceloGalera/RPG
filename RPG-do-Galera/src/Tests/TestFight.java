package Tests;

import java.util.Random;

import Classes.CharacterType;

public class TestFight {
	
	private static double easy;
	private static double medium;
	private static double hard;
	private static double veryHard;
	private static double insane;

	public static void main(String[] args) {
		
		// DIFFICULTY
		easy = new Random().nextDouble(10);		
		medium = new Random().nextDouble(25);
		hard = new Random().nextDouble(50);
		veryHard = new Random().nextDouble(100);
		insane = new Random().nextDouble(1000);

		// CHARACTERS                             // name  , str, def, life, lvl
		CharacterType warrior = new CharacterType("Aragorn", 2.0, 3.0, 40.0, 1);
		warrior.broadSword();
		warrior.woodenShield();
		
		CharacterType paladin = new CharacterType("Arthas", 2.5, 2.5, 35.0, 1);
		paladin.fireSword();
		
		CharacterType mage = new CharacterType("Dumbledore", 3.3, 2.2, 32.0, 1);
		mage.magicalStaff();
		
		
//                             name  , str, def, life
		warrior.fightWarrior("Goblin", easy, easy, easy);
		warrior.fightWarrior("Orc", easy, easy, medium);
		warrior.fightWarrior("Medusa", medium, easy, medium);
		warrior.fightWarrior("Troll", medium, medium, medium);
		warrior.fightWarrior("Giant", medium, medium, hard);
		warrior.fightWarrior("Dragon", hard, medium, hard);
		warrior.fightWarrior("Basilisk", hard, hard, hard);
		warrior.fightWarrior("Demon", veryHard, hard, hard);
		
	}
	
}
