package Classes;

public class CharacterType {

	// encapsulamento...gerando get e eventualmente set
	private String name;
	private Double strenght;
	private Double defense;
	private Double life;
	private int level;

	// CONSTRUTOR
	public CharacterType(String name, Double strenght, Double defense, Double life, int level) {
		this.name = name;
		this.strenght = strenght;
		this.defense = defense;
		this.life = life;
		this.level = level;
	}

	// GETTERS and SETTERS

	public String getName() {
		return name;
	}

	public Double getStrenght() {
		return strenght;
	}

	public Double getDefense() {
		return defense;
	}

	public Double getLife() {
		return life;
	}

	public int getLevel() {
		return level;
	}

	// LEVEL UP
	public void lvlUpWarrior() {
		this.defense += 1.5;
		this.life += 10.0;
		this.strenght += 1.5;
		this.level += 1;
	}

	public void lvlUpPaladin() {
		this.defense += 1.0;
		this.life += 8.0;
		this.strenght += 2.5;
		this.level += 1;
	}

	public void lvlUpMage() {
		this.defense += 0.5;
		this.life += 5.0;
		this.strenght += 4.0;
		this.level += 1;
	}

	// LEVEL DOWN
	public void lvlDownWarrior() {
		this.defense -= 1.5;
		this.life -= 10.0;
		this.strenght -= 1.5;
		this.level -= 1;
	}

	public void lvlDownPaladin() {
		this.defense -= 1.0;
		this.life -= 8.0;
		this.strenght -= 2.5;
		this.level -= 1;
	}

	public void lvlDownMage() {
		this.defense -= 0.5;
		this.life -= 5.0;
		this.strenght -= 4.0;
		this.level -= 1;
	}
	
	public void fightWarrior(String name, Double strenght, Double defense, Double life) {
		if(life/(this.strenght - defense) >= this.life/(strenght - this.defense)  ) {
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

}