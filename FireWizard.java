/**
 * Concrete implementation for a FireWizard character, a subclass of Wizard.
 */

public class FireWizard extends Wizard{

/**
     * Constructor for creating a FireWizard character.
     * @param name The name of the FireWizard.
     * @param health The health points of the FireWizard.
     */
    public FireWizard(String name, int health) {
        super(name, 25 - health);
    }

    /**
     * Attack method for the FireWizard.
     * Prints out the attack action of the FireWizard.
     */
    @Override
    public void attack() {
        System.out.println("FireWizard casts a powerful fire spell!");
    }
}
