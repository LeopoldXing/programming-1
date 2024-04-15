/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 11, 2024
 * Updated: Apr 4, 2024
 */
package assignment.library;

/**
 * A class encapsulating the concept of a Player on a sports team
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public abstract class Player {

    /**
     * The name of the player.
     */
    private String name;

    /**
     * The number worn on the player’s jersey.
     */
    private int number;

    /**
     * Initializes a new instance of the Player class with the specified name and number.
     *
     * @param name   - The player’s name.
     * @param number - The player’s jersey number.
     */
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Returns the name of the player.
     *
     * @return Returns the name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name - The player’s name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the player’s jersey number.
     *
     * @return Returns the player’s jersey number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the player’s jersey number.
     *
     * @param number - The player’s jersey number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the total number of points accumulated by the player.
     *
     * @return Returns the total number of points accumulated by the player.
     */
    public abstract int getPoints();

    /**
     * Returns the String representation of the player.
     *
     * @return Returns the String representation of the player.
     */
    @Override
    public String toString() {
        return name + " " + "[" + number + "]";
    }
}
