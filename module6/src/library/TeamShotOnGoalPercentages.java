/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 1, 2024
 * Updated: Mar 10, 2024
 */
package library;

/**
 * A class encapsulating the concept of a team’s percentages for shots on goal
 *
 * @author Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class TeamShotOnGoalPercentages {
    /**
     * The percentages for each player on the team.
     */
    private double[] percentages;

    /**
     * Initializes a new instance of the TeamShotOnGoalPercentages class with the specified number of players. Each player will have a shot on goal percentage of 0.
     *
     * @param numberOfPlayers The number of players on the team.
     */
    public TeamShotOnGoalPercentages(int numberOfPlayers) {
        percentages = new double[numberOfPlayers];
    }

    /**
     * Initializes a new instance of the TeamShotOnGoalPercentages class with the specified player’s shot on goal percentages.
     *
     * @param percentages The shot on goal percentages for each player on the team.
     */
    public TeamShotOnGoalPercentages(double[] percentages) {
        this.percentages = percentages;
    }

    /**
     * Returns a copy of the specified array.
     *
     * @param percentagesToCopy The array of percentage values to be copied.
     * @return a copy of the specified array.
     */
    private double[] copyPercentages(double[] percentagesToCopy) {
        double[] res = new double[percentagesToCopy.length];
        for (int i = 0; i < percentagesToCopy.length; i++) {
            res[i] = percentagesToCopy[i];
        }
        return res;
    }

    /**
     * Returns a copy of the shot on goal percentages.
     *
     * @return a copy of the shot on goal percentages.
     */
    public double[] getPercentages() {
        return copyPercentages(percentages);
    }

    /**
     * Sets the team’s percentages.
     *
     * @param percentages The shot on goal percentages for each player on the team.
     */
    public void setPercentages(double[] percentages) {
        this.percentages = percentages;
    }

    /**
     * Returns a new array containing the values of the percentages array sorted in descending order.
     *
     * @return A new array containing the values of the percentages array sorted in descending order.
     */
    public double[] getSortedPercentages() {
        double[] res = copyPercentages(percentages);

        for (int i = 0; i < res.length; i++) {
            // find the largest element
            double maxVal = Double.MIN_VALUE;
            int maxIndex = i;
            for (int j = i; j < res.length; j++) {
                if(res[j] > maxVal) {
                    maxIndex = j;
                    maxVal = res[j];
                }
            }

            // swap the current value with the maxVal
            double temp = res[i];
            res[i] = res[maxIndex];
            res[maxIndex] = temp;
        }

        return res;
    }

    /**
     * Returns the value of the player with the lowest percentage in the specified array.
     *
     * @param percentages The percentages for each player a team.
     * @return The value of the player with the lowest percentage in the specified array.
     */
    public double getLowestPercentage(double[] percentages) {
        double res = Double.MAX_VALUE;

        for (int i = 0; i < percentages.length; i++) {
            res = Math.min(res, percentages[i]);
        }

        return res;
    }

    /**
     * Returns the mean average of percentages for the top players on the team.
     * The five players with the highest percentages are considered the top players. On teams with less than five players, all players would be considered top players.
     *
     * @return The mean average of percentages for the top players on the team.
     */
    public double getAverageOfTopPlayers() {
        double[] sortedPercentages = getSortedPercentages();

        double sum = 0;
        int numberOfTopPlayers = Math.min(5, percentages.length);
        for (int i = 0; i < numberOfTopPlayers; i++) {
            sum += sortedPercentages[i];
        }

        return sum / numberOfTopPlayers;
    }

    /**
     * Returns the String representation of the class.
     *
     * @return the String representation of the class.
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("--------------------\n");
        stringBuilder.append("Player        SOG%\n");
        stringBuilder.append("--------------------\n");
        for (int i = 0; i < percentages.length; i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append("             ");
            stringBuilder.append(percentages[i]).append("\n");
        }

        return stringBuilder.toString();
    }
}
