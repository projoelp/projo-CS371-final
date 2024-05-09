/**
 * The Character abstract class represents a generic character in the game.
 * Concrete character types (such as Warrior, Wizard, etc.) will extend this class
 * and provide specific implementations for the attack method.
 */

public abstract class Character {
    
    /** Name of the character. */
    private String name;
    /** Health points of the character. */
    private int health;

    /**
     * Constructor for creating a character.
     * @param name The name of the character.
     * @param health The health points of the character.
     */
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * Abstract method for attacking.
     */
    public abstract void attack();

    /**
     * Method to display character information.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}