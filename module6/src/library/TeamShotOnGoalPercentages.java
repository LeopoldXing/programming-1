/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Mar 1, 2024
 * Updated: Mar 1, 2024
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
        return percentages;
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

        quickSort(res, 0, res.length - 1);

        return res;
    }

    /**
     * "Quick Sort" algorithm
     * Average time complexity: O(N * lgN)
     *
     * @param unSortedPercentages The array waiting to be sorted.
     * @param l                   Left pointer
     * @param r                   Right pointer
     */
    private void quickSort(double[] unSortedPercentages, int l, int r) {
        if (l < r) {
            // index of left pointer
            int i = l;

            // index of right pointer
            int j = r;

            // current double value
            double currentPercentage = unSortedPercentages[i];

            while (i < j) {
                while (i < j && unSortedPercentages[j] > currentPercentage) {
                    // Find the first number less than currentPercentage from right to left
                    j--;
                }
                if (i < j) {
                    unSortedPercentages[i++] = unSortedPercentages[j];
                }
                while (i < j && unSortedPercentages[i] < currentPercentage) {
                    // Find the first number greater than currentPercentage from left to right
                    i++;
                }
                if (i < j) {
                    unSortedPercentages[j--] = unSortedPercentages[i];
                }
            }
            unSortedPercentages[i] = currentPercentage;
            // Recursive method call
            quickSort(unSortedPercentages, l, i - 1);
            quickSort(unSortedPercentages, i + 1, r);
        }
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
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("--------------------\n");
        stringBuilder.append("Player        SOG%\n");
        stringBuilder.append("--------------------\n");
        for (int i = 0; i < percentages.length; i++) {
            stringBuilder.append(i + 1 + '\n');
            stringBuilder.append("              \n");
            stringBuilder.append(percentages[i] + '\n');
        }

        return stringBuilder.toString();
    }
}
