/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Apr 4, 2024
 * Updated: Apr 4, 2024
 */
package assignment.test;

/**
 * a class encapsulating the concept of a basketball player
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class BasketballPlayer extends Player {

    /**
     * The number of free throws made by the basketball player.
     */
    private int freeThrows;

    /**
     * The number of field goals made by the basketball player.
     */
    private int fieldGoals;

    /**
     * The number of three pointers made by the basketball player.
     */
    private int threePointers;

    /**
     * Initializes a new instance of the BasketballPlayer class with the specified name and number. The free throws, field goals and three pointers are set to zero.
     *
     * @param name   The basketball player’s name.
     * @param number The basketball player’s jersey number.
     */
    public BasketballPlayer(String name, int number) {
        super(name, number);
        this.freeThrows = 0;
        this.fieldGoals = 0;
        this.threePointers = 0;
    }

    /**
     * Returns the number of free throws made by the basketball player.
     *
     * @return
     */
    public int getFreeThrows() {
        return freeThrows;
    }

    /**
     * Sets the number of free throws made by the basketball player.
     *
     * @param freeThrows The number of free throws made by the basketball player.
     */
    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    /**
     * Returns the number of field goals made by the basketball player.
     *
     * @return
     */
    public int getFieldGoals() {
        return fieldGoals;
    }

    /**
     * Sets the number of field goals made by the basketball player.
     *
     * @param fieldGoals The number of field goals made by the basketball player.
     */
    public void setFieldGoals(int fieldGoals) {
        this.fieldGoals = fieldGoals;
    }

    /**
     * Returns the number of three pointers made by the basketball player.
     *
     * @return
     */
    public int getThreePointers() {
        return threePointers;
    }

    /**
     * Sets the number of three pointers made by the basketball player.
     *
     * @param threePointers The number of three pointers made by the basketball player.
     */
    public void setThreePointers(int threePointers) {
        this.threePointers = threePointers;
    }

    /**
     * Returns the total number of points accumulated by the basketball player.
     *
     * @return
     */
    public int getPoints() {
        return freeThrows + (2 * fieldGoals) + (3 * threePointers);
    }

    /**
     * Returns the String representation of the player.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Basketball Player: " + super.toString() + ", Points: " + getPoints();
    }
}
