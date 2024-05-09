# projo-CS371-final

This project is a simple character creator application that allows users to create characters of different classes such as Warrior, Wizard, and Fire Wizard.

## Build Instructions

To build and run the Character Creator application, follow these steps:

1. Clone the repository to your local machine:

    ```
    git clone <repository_url>
    ```

2. Navigate to the project directory:

    ```
    cd projo-CS371-final
    ```

3. Compile the Java source files:

    ```
    javac *.java
    ```

4. Run the main program:

    ```
    java CharacterCreatorTesting
    ```

5. Follow the prompts to select a character class, enter a name, and see the character's information.

## Usage

- Select a character class (Warrior, Wizard, Fire Wizard) and enter a name for your character.
- The application will roll for health points and display the created character's information.

## Design Pattern: Factory Method

This project utilizes the Factory Method design pattern to create different types of characters. The Factory Method pattern provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

[Factory Design Pattern by Derek Banas](https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=5)

### How it's used:

- The `CharacterFactory` class acts as the factory, providing a method `makeCharacter()` to create character objects based on the provided character class.
- When the user selects a character class, the `makeCharacter()` method of the `CharacterFactory` is invoked with the selected class name, character name, and health deduction.
- The `CharacterFactory` determines the appropriate subclass to instantiate based on the provided character class and returns the newly created character object.