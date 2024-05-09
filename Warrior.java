/**
 * Concrete implementation for a Warrior character.
 */

public class Warrior extends Character {

    /**
     * Constructor for creating a Warrior character.
     * @param name The name of the Warrior.
     * @param health The health points of the Warrior.
     */
    public Warrior(String name, int health) {
        super(name, 40 - health);
    }

    /**
     * Attack method for the Warrior.
     * Prints out the attack action of the Warrior.
     */
    @Override
    public void attack() {
        System.out.println("Warrior attacks with sword!");
    }
}
