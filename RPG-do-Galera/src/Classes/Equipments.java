package Classes;

public class Equipments extends CharacterType {

	
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

	
	// AMULETS
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
