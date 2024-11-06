/**
 * @author Mihir Patel
 * This program will generate pythagorean triples without any of the sides going over 500.
 */

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.println("Side 1  Side 2  Hypotenuse");

        for (int side1 = 1; side1 < 500; side1++) {
            for (int side2 = 1; side2 < 500; side2++) {
                for (int hyp = 1; hyp <= 500; hyp++) {

                    if (side1 * side1 + side2 * side2 == hyp * hyp) {
                        System.out.printf("%-7d %-7d %d \n", side1, side2, hyp);
                    }

                }
            }
        }
    }
}