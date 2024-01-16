/**
 * Name: Luping Xing
 * Program: Full Stack Web Development 24Winter
 * Course: Programming-1
 * Created: Jan 8, 2024
 * Updated: Jan 8, 2024
 */
public class Assignment48 {

    /**
     * Description: Main function and program entrance of the assgiment1, 2.6.7-No48
     *
     * @param args
     */
    public static void main(String[] args) {
        double pounds2KiloRatio = 0.454;
        int kiloValue1 = 10;
        int kiloValue2 = 50;
        int kiloValue3 = 100;

        double poundsValue1 = kiloValue1 / pounds2KiloRatio;
        double poundsValue2 = kiloValue2 / pounds2KiloRatio;
        double poundsValue3 = kiloValue3 / pounds2KiloRatio;

        System.out.println(kiloValue1 + " kilograms is " + poundsValue1 + " pounds");
        System.out.println(kiloValue2 + " kilograms is " + poundsValue2 + " pounds");
        System.out.println(kiloValue3 + " kilograms is " + poundsValue3 + " pounds");
    }
}
