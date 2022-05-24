package Classes;

import java.util.Random;

public class Human extends Equipments {

	private int level;
	
	public Human(String name, double strenght, double defense, double life, int level) {
		super();
		this.name = name;
		this.strenght = strenght;
		this.defense = defense;
		this.life = life;
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	// LEVEL UP
	public void lvlUpWarrior() {
		this.defense += 1.0;
		this.life += 7.0;
		this.strenght += 1.0;
		this.level += 1;
	}

	public void lvlUpPaladin() {
		this.defense += 0.8;
		this.life += 6.0;
		this.strenght += 1.5;
	}

	public void lvlUpMage() {
		this.defense += 0.7;
		this.life += 5.0;
		this.strenght += 2.0;
	}

	
	// LEVEL DOWN
	public void lvlDownWarrior() {
		this.defense -= 1.0;
		this.life -= 7.0;
		this.strenght -= 1.0;
	}

	public void lvlDownPaladin() {
		this.defense -= 0.8;
		this.life -= 6.0;
		this.strenght -= 1.5;
	}

	public void lvlDownMage() {
		this.defense -= 0.7;
		this.life -= 5.0;
		this.strenght -= 2.5;
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

}
