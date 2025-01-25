package patternPrinting;

import java.util.Scanner;

public class PatternPrintingMEDIUM {
    static void pattern1(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int row){
        for (int i = 1; i <= row; i++) {
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int row){
        for (int i = 1; i <= row; i++) {
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int row){
        /*method 1
        for (int i = 1; i <= row; i++) {
            for (int j = row-(i-1); j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        // method 2 by starting the loop from reverse
        for(int i=row;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int columns= sc.nextInt();
        /*patten
        *
        **
        ***
         */
        pattern1(row);
        /* pattern
        1
        12
        123
         */
        pattern2(row);
        /*pattern
        1
        22
        333
         */
        pattern3(row);
        /*pattern
        1
        21
        321
         */
        pattern4(row);
        /*pattern
        a
        bb
        ccc
         */
        pattern5(row);
        /*
        ***
        **
        *
         */
        pattern6(row);

    }
}
/* if any value print row times like
1
22
333
in such cases inner loop will run only row times then loop will look like that  for(int j=1;j<=i;j++)
 */
