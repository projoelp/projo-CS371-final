import java.util.Random;
import java.util.Scanner;

/**
 * A class for testing character creation.
 */
public class CharacterCreatorTesting {
    private static final Random random = new Random();

    /**
     * Main method to test character creation.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character theCharacter = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Select a class (Warrior, Wizard, Fire Wizard):");
        if (userInput.hasNextLine()) {
            String characterClass = userInput.nextLine();
            System.out.println("Enter your character's name:");
            if (userInput.hasNextLine()) {
                String name = userInput.nextLine();
                System.out.println("Rolling for health points...");
                int health = rollDie();

                // Creating character based on user input
                if (characterClass.equalsIgnoreCase("Warrior")) {
                    theCharacter = characterFactory.makeCharacter(characterClass, name, health);
                } else if (characterClass.equalsIgnoreCase("Wizard")) {
                    theCharacter = characterFactory.makeCharacter(characterClass, name, health);
                } else if (characterClass.equalsIgnoreCase("Fire Wizard")) {
                    theCharacter = characterFactory.makeCharacter(characterClass, name, health);
                } else {
                    System.out.println("Invalid character class selected.");
                    userInput.close();
                    return;
                }

                // Displaying character information
                System.out.println("Character created:");
                theCharacter.displayInfo();
                theCharacter.attack();
            }
        }

        userInput.close();
    }

    /**
     * Rolls a 6-sided die and returns the result.
     * @return The result of the die roll (a number between 1 and 6).
     */
    public static int rollDie() {
        // Generate a random number between 1 and 6 (inclusive)
        return random.nextInt(6) + 1;
    }
}

