/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 11, 2024
 * Updated: Mar 11, 2024
 */
package library;

/**
 * A class encapsulating the concept of a hockey player.
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class HockeyPlayer extends Player{

    private int goals;

    private int assists;

    /**
     * Initializes a new instance of the Player class with the specified name and number.
     *
     * @param name   - The player’s name.
     * @param number - The player’s jersey number.
     */
    public HockeyPlayer(String name, int number) {
        super(name, number);
    }




}
