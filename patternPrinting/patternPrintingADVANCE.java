package patternPrinting;

import java.util.Scanner;

public class patternPrintingADVANCE {
    static void pattern1(int row) {
        System.out.println("Pattern 1");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern2(int row) {
        System.out.println("Pattern 2");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void pattern3(int row) {
        System.out.println("Pattern 3");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * row - (2 * i - 1); k++) {
                System.out.print("*");
            }
            for (int m = 1; m <= i - 1; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int row) {
        System.out.println("Pattern 4");
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = row * 2 - i * 2; k > 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int row) {
        System.out.println("Pattern 5");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = row * 2 - i * 2; k > 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        /* pattern 1 approach
        row=1
        row<=n
        print n-row space
        print 2*row-1 star
        row=row+1
         */
        pattern1(row);
        /* pattern 2 approach
        row=1
        row<=n
        print n-row space
        print 1 to row
        print row-1 to 1
        row++
         */
        pattern2(row);

        /* pattern 3 approach
        row=1
        row<=n
        print row-1 time space from starting
        print 2*n - 2*row-1 times star
        print row-1 time space
        row++
         */
        pattern3(row);
        /* pattern 4 approach
        row =n
        row>=1
        print row times star
        print n*2-row*2
        print row times star
        row--
         */
        pattern4(row);

        /* pattern 5 approach
        row=1
        row<=n
        print row times star
        print n*2-row*2 time space
        print row times star
        row++
         */
        pattern5(row);
        /* pattern 6 approach
        row=1
        row<=n
         */

    }
}
