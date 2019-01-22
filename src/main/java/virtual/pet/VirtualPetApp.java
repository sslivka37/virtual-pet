
package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet Skarner = new VirtualPet("Skarner", 100, 100, 50, 50);

		System.out.println("You've made a new friend! Its name is " + Skarner.getName());

		// show pet visualization here?
		System.out.println("      ___ __");
		System.out.println("    _{___{__}\\");
		System.out.println("   {_}      `\\)");
		System.out.println("  {_}         `            _.-''''--.._");
		System.out.println("   {_}                    //'.--.  \\___`.");
		System.out.println("    { }__,_.--~~~-~~~-~~-::.---. `-.\\  `.)");
		System.out.println("     `-.{_{_{_{_{_{_{_{_//  -- 8;=- `");
		System.out.println("        `-:,_.:,_:,_:,.`\\\\._ ..'=- ,");
		System.out.println("            // // // //`-.`\\`   .-'/");
		System.out.println("           << << << <<    \\ `--'  /----)");
		System.out.println("            ^  ^  ^  ^     `-.....--'''");

		// show user pet's initial statuses
		System.out.println("These are " + Skarner.getName() + "'s statuses right now:");
		System.out.println("Hunger level: " + Skarner.getHungerLevel());
		System.out.println("Thirst level: " + Skarner.getThirstLevel());
		System.out.println("Energy level: " + Skarner.getEnergyLevel());
		System.out.println("Happiness level: " + Skarner.getHappinessLevel());

		// ask user for input
		System.out.println("What would you like to do with " + Skarner.getName() + "?");
		System.out.println("Press 1 to feed " + Skarner.getName());
		System.out.println("Press 2 to give " + Skarner.getName() + " something to drink");
		System.out.println("Press 3 to let " + Skarner.getName() + " rest");
		System.out.println("Press 4 to play with " + Skarner.getName());
		System.out.println("Press 5 to see " + Skarner.getName() + "'s statuses again");
		System.out.println("Type any other number to say goodbye to " + Skarner.getName());

		int userInput = Integer.parseInt(input.nextLine());

		// give output based on user input, referred back to bridge project on how to
		// loop this, so when the options are 1, 2, 3, 4, or 5, continue looping program
		// want to call tick for every time user inputs something except checking status
		// or exiting the game
		while (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5) {
			switch (userInput) {

			case 1:
				Skarner.feed();
				System.out.println("You feed " + Skarner.getName());
				Skarner.tick();
				break;

			case 2:
				Skarner.giveDrink();
				System.out.println("You give " + Skarner.getName() + " something to drink");
				Skarner.tick();
				break;

			case 3:
				Skarner.rest();
				System.out.println("You let " + Skarner.getName() + " rest");
				Skarner.tick();
				break;

			case 4:
				Skarner.play();
				System.out.println("You play with " + Skarner.getName());
				Skarner.tick();
				break;

			case 5:
				System.out.println("These are Skarner's statuses right now:");
				System.out.println("Hunger level: " + Skarner.getHungerLevel());
				System.out.println("Thirst level: " + Skarner.getThirstLevel());
				System.out.println("Energy level: " + Skarner.getEnergyLevel());
				System.out.println("Happiness level: " + Skarner.getHappinessLevel());
				break;

			// this default error message should only occur if the code for the while loop
			// or the switch cases get changed
			default:
				System.out.println("Error: an unexpected value has occured");
				break;

			}

			System.out.println("What else would you like to do with " + Skarner.getName() + "?");
			userInput = Integer.parseInt(input.nextLine());

		}

		// typing any other number breaks us out of the loop and gets us here, exiting
		// the app:
		
		
		System.out.println("         888                      ");
		System.out.println("         888                      ");
		System.out.println("         888                      ");
		System.out.println("         88888b. 888  888 .d88b.  ");
		System.out.println("         888 '88b888  888d8P  Y8b ");
		System.out.println("         888  888888  88888888888 ");
		System.out.println("         888 d88PY88b 888Y8b.     ");
		System.out.println("         88888P'  'Y88888 'Y8888  ");
		System.out.println("                      888         ");
		System.out.println("                 Y8b d88P         ");
		System.out.println("                  'Y88P'          ");		
		
		System.out.println("      ___ __");
		System.out.println("    _{___{__}\\");
		System.out.println("   {_}      `\\)");
		System.out.println("  {_}         `            _.-''''--.._    ");
		System.out.println("   {_}                    //'.--.  \\___`.");
		System.out.println("    { }__,_.--~~~-~~~-~~-::.---. `-.\\  `.)");
		System.out.println("     `-.{_{_{_{_{_{_{_{_//  -- 8;=- `      ");
		System.out.println("        `-:,_.:,_:,_:,.`\\\\._ ..'=- ,");
		System.out.println("            // // // //`-.`\\`   .-'/");
		System.out.println("           << << << <<    \\ `--'  /----)");
		System.out.println("            ^  ^  ^  ^     `-.....--'''");
		System.out.println("          "+Skarner.getName() + " says goodbye!");
		System.exit(0);
		input.close();

	}

}
