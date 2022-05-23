package Classes;

import java.util.Random;

public class CharacterType {
	
	private String name;
	private Double strenght;
	private Double defense;
	private Double life;
	private int level;
	
	public CharacterType(String name, Double strenght, Double defense, Double life, int level) {
		this.name = name;
		this.strenght = strenght;
		this.defense = defense;
		this.life = life;
		this.level = level;
	}
	
	// encapsulamento...gerando get e eventualmente set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getStrenght() {
		return strenght;
	}
	public void setStrenght(Double strenght) {
		this.strenght = strenght;
	}
	public Double getDefense() {
		return defense;
	}
	public void setDefense(Double defense) {
		this.defense = defense;
	}
	public Double getLife() {
		return life;
	}
	public void setLife(Double life) {
		this.life = life;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public void lvlUpWarrior() {
		this.defense += 1.0;
		this.life += 7.0;
		this.strenght += 1.0;
		this.level += 1;
	}
	
	
	// LEVEL UP
	public void lvlUpPaladin() {
		this.defense += 0.8;
		this.life += 6.0;
		this.strenght += 1.5;
		this.level += 1;
	}

	public void lvlUpMage() {
		this.defense += 0.7;
		this.life += 5.0;
		this.strenght += 2.0;
		this.level += 1;
	}

	// LEVEL DOWN
	public void lvlDownWarrior() {
		this.defense -= 1.0;
		this.life -= 7.0;
		this.strenght -= 1.0;
		this.level -= 1;
	}

	public void lvlDownPaladin() {
		this.defense -= 0.8;
		this.life -= 6.0;
		this.strenght -= 1.5;
		this.level -= 1;
	}

	public void lvlDownMage() {
		this.defense -= 0.7;
		this.life -= 5.0;
		this.strenght -= 2.5;
		this.level -= 1;
	}
	
	
	public void fightWarrior(String name, Double strenght, Double defense, Double life) {
		//System.out.println(life/(this.strenght / defense));
		//System.out.println(this.life/(strenght / this.defense));
		if(life/(this.strenght / defense) <= this.life/(strenght / this.defense)) {
			System.out.println("Awesome! " + this.name + " defeated a " + name + ".");
			lvlUpWarrior();
			System.out.println("Status of " + this.name + " after killed " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else if (this.level > 1 ) {
			System.out.println("That's sad. You died by a " + name + ". Try again!");
			lvlDownWarrior();
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level " + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else {
			System.out.println("That's sad. You died by a " + name + ", but already in level 1. Try again!");
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		}
	}
	
	
	public void fightPaladin(String name, Double strenght, Double defense, Double life) {
		//System.out.println(life/(this.strenght / defense));
		//System.out.println(this.life/(strenght / this.defense));
		if(life/(this.strenght / defense) <= this.life/(strenght / this.defense)) {
			System.out.println("Awesome! " + this.name + " defeated a " + name + ".");
			lvlUpPaladin();
			System.out.println("Status of " + this.name + " after killed " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else if (this.level > 1 ) {
			System.out.println("That's sad. You died by a " + name + ". Try again!");
			lvlDownPaladin();
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level " + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else {
			System.out.println("That's sad. You died by a " + name + ", but already in level 1. Try again!");
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		}
	}
	
	public void fightMage(String name, Double strenght, Double defense, Double life) {
		//System.out.println(life/(this.strenght / defense));
		//System.out.println(this.life/(strenght / this.defense));
		if(life/(this.strenght / defense) <= this.life/(strenght / this.defense)) {
			System.out.println("Awesome! " + this.name + " defeated a " + name + ".");
			lvlUpMage();
			System.out.println("Status of " + this.name + " after killed " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else if (this.level > 1 ) {
			System.out.println("That's sad. You died by a " + name + ". Try again!");
			lvlDownMage();
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level " + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		} else {
			System.out.println("That's sad. You died by a " + name + ", but already in level 1. Try again!");
			System.out.println("Status of " + this.name + " after died by a " + name + ": Level "  + this.level + ", Strenght: " + this.strenght + ", Defense: " + this.defense + ", Life: " + this.life);		
			System.out.println();
		}
	}
	
	
	// WEAPONS
	public void broadSword() {
		this.strenght += 2.0;
	}
	
	public void fireSword() {
		this.strenght += 3.5;
	}
	
	public void magicSword() {
		this.strenght += 6.0;
	}
	
	public void staff() {
		this.strenght += 3.5;
	}
	
	public void magicalStaff() {
		this.strenght += 5.5;
	}
	
	public void ultimateStaff() {
		this.strenght += 9.0;
	}
	
	
	// SHIELDS
	public void woodenShield() {
		this.defense += 2.0;
	}
	
	public void plateShield() {
		this.defense += 4.5;
	}
	
	public void demonShield() {
		this.defense += 7.5;
	}
	
	
	//AMULETS
	public void trinket() {
		this.life += 10.0;
	}
	
	public void amulet() {
		this.life += 25.0;
	}
	
	public void starLight() {
		this.life += 40.0;
	}
	
}
