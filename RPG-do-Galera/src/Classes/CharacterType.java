package Classes;

public class CharacterType {
	
	protected String name;
	protected Double strenght;
	protected Double defense;
	protected Double life;
	
	// encapsulamento...gerando get e set
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
	
}
