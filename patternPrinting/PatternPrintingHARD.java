package patternPrinting;

import java.util.Scanner;

public class PatternPrintingHARD {
    static void pattern1(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if(j<=row-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern2(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if(j<=row-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    static void pattern3(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if(j<=row-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    static void pattern4(int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row ; j++) {
                if(j<=row-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(j-(row-i));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= sc.nextInt();
        /*
          @
         @@
        @@@
         */
        pattern1(row);
        pattern2(row);
        pattern3(row);
        pattern4(row);
    }
}
