/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 11, 2024
 * Updated: Apr 4, 2024
 */
package assignment.test;

/**
 * A class encapsulating the concept of a hockey player.
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class HockeyPlayer extends Player {

    /**
     * The number of goals scored by the hockey player.
     */
    private int goals;

    /**
     * The number of assists made by the hockey player.
     */
    private int assists;

    /**
     * Initializes a new instance of the Player class with the specified name and number.
     *
     * @param name   - The player’s name.
     * @param number - The player’s jersey number.
     */
    public HockeyPlayer(String name, int number) {
        super(name, number);
        this.goals = 0;
        this.assists = 0;
    }

    /**
     * Initializes a new instance of the HockeyPlayer class with the specified name, number, goals and assists.
     *
     * @param name    The hockey player’s name.
     * @param number  The hockey player’s jersey number.
     * @param goals   The number of goals scored by the hockey player.
     * @param assists The number of assists made by the hockey player.
     */
    public HockeyPlayer(String name, int number, int goals, int assists) {
        super(name, number);
        this.goals = goals;
        this.assists = assists;
    }

    /**
     * Returns the number of goals scored by the hockey player.
     *
     * @return
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Sets the number of goals scored by the hockey player.
     *
     * @param goals The number of goals scored by the hockey player.
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * Returns the number of assists made by the hockey player.
     *
     * @return
     */
    public int getAssists() {
        return assists;
    }

    /**
     * Sets the number of assists made by the hockey player.
     *
     * @param assists The number of assists made by the hockey player.
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }

    /**
     * Returns the total number of points accumulated by the hockey player.
     *
     * @return
     */
    @Override
    public int getPoints() {
        return goals + assists;
    }

    /**
     * Returns the String representation of the player.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hockey Player - " + super.toString() + ", Points: " + getPoints();
    }


}
