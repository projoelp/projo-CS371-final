/**
 * Concrete implementation for a Wizard character.
 */

public class Wizard extends Character {

    /**
     * Constructor for creating a Wizard character.
     * @param name The name of the Wizard.
     * @param health The health points of the Wizard.
     */
    public Wizard(String name, int health) {
        super(name, 25 - health);
    }

    /**
     * Attack method for the Wizard.
     * Prints out the attack action of the Wizard.
     */
    @Override
    public void attack() {
        System.out.println("Wizard casts a powerful spell!");
    }
}