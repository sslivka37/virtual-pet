
package virtual.pet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Scanner;

public class VirtualPetTest {

	//create scanner
	Scanner input = new Scanner(System.in);

	// test to make sure that you can make a class
	@Test
	public void testDefaultConstructor() {
		new VirtualPet(null, 0, 0, 0, 0);
	}

	// test to make sure you can make a class with loaded constructors
	@Test
	public void testToMakeNewClassWithLoadedConstructors() {
		VirtualPet Creature = new VirtualPet("Creature", 100, 100, 50, 50);

	}

	// then test some methods out
	@Test
	public void feedTest() {
		VirtualPet Creature = new VirtualPet("Creature", 100, 100, 50, 50);
		Creature.feed();
		assertEquals(75, Creature.getHungerLevel());
	}

	@Test
	public void restTest() {
		VirtualPet h = new VirtualPet("Henry", 100, 100, 50, 50);
		h.rest();
		assertEquals(75, h.getEnergyLevel());
	}

	@Test
	public void thirstTest() {
		VirtualPet t = new VirtualPet("Tomasz", 100, 100, 50, 50);
		t.giveDrink();
		assertEquals(50, t.getThirstLevel());
	}

	@Test
	public void playTest() {
		VirtualPet m = new VirtualPet("Margaret", 100, 100, 50, 50);
		m.play();
		assertEquals(40, m.getEnergyLevel());
	}
	
	@Test
	public void tickTest() {
		VirtualPet m = new VirtualPet("Margaret", 80, 80, 50, 50);
		m.tick();
		assertEquals(82, m.getHungerLevel());
		assertEquals(82, m.getThirstLevel());
		assertEquals(48, m.getEnergyLevel());
		assertEquals(48, m.getHappinessLevel());
	}

	

	
	
	
	
	
	
	
}
