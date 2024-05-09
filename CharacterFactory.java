/**
 * A factory class for creating different types of characters.
 */

public class CharacterFactory {

    /**
     * Creates a new character based on the provided character class, name, and health deduction.
     * @param newCharacterClass The class/type of the new character (e.g., "warrior", "wizard", "fire wizard").
     * @param name The name of the new character.
     * @param healthDeduct The health deduction for the new character.
     * @return The newly created character object.
     */
    public Character makeCharacter(String newCharacterClass, String name, int healthDeduct) {
        Character newCharacter = null;

        if (newCharacterClass.equalsIgnoreCase("warrior")) {
            return new Warrior(name, healthDeduct);
        } else if (newCharacterClass.equalsIgnoreCase("wizard")) {
            return new Wizard(name, healthDeduct);
        } else if (newCharacterClass.equalsIgnoreCase("fire wizard")) {
            return new FireWizard(name, healthDeduct);
        } else {
            return null;
        }
    }
}
