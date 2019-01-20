package virtual.pet;

public class VirtualPet {

	private String name;
	private int hungerLevel;
	private int thirstLevel;
	private int energyLevel;
	private int happinessLevel;
	

	public String getName() {
		return name;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public int getHappinessLevel() {
		return happinessLevel;
	}

	public VirtualPet(String name, int hungerLevel, int thirstLevel, int energyLevel, int happinessLevel) {
		this.name = name;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.energyLevel = energyLevel;
		this.happinessLevel = happinessLevel;
	}
	
	
	public void feed () {
		this.hungerLevel = hungerLevel -25;
	}
	
		
	public void rest () {
		this.energyLevel = energyLevel +25;
	}
	
	public void giveDrink () {
		this.thirstLevel = thirstLevel -50;
	}
	
	public void play () {
		this.energyLevel = energyLevel -10;
		this.happinessLevel = happinessLevel +25;
	}
	
	public void tick() {
		this.hungerLevel = hungerLevel +2;
		this.thirstLevel = thirstLevel +2;
		this.energyLevel = energyLevel -2;
		this.happinessLevel = happinessLevel -2;
		
	}
}