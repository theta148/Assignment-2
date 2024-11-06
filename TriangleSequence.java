/**
 * @author Mihir Patel
 * This program will generate a pattern consisting of
 * 4 different triangles.
 */

public class TriangleSequence {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= i) {
                    System.out.print('*');
                }
                else if (j == i + 1) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > 0; j--) {
                if (j <= i) {
                    System.out.print('*');
                }
                else if (j == i + 1) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < i) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
                if (j == 9) {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j < 10) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}