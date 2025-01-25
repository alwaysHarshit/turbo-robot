package patternPrinting;

import java.util.Scanner;

public class PatternProblemsEASY {
    static void pattern1(int row,int columns){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=columns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int row,int columns){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int row,int columns){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=columns ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int row,int columns){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=columns ; j++) {
                char ch = (char)('a'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
    static void pattern5(int row,int columns){
        for (int i = 1; i<= row; i++) {
            for (int j = 1; j <=columns ; j++) {
                char ch=(char)('a'+j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int row,int columns){
        int counter=0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=columns ; j++) {
                System.out.print(++counter+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns= sc.nextInt();
        //rectangular * pattern
        pattern1(row,columns);

        //rectangular 111 222 333 pattern
        pattern2(row,columns);

        // rectangular 123 123 123 pattern
        pattern3(row,columns);

        //rectangular aaa bbb ccc
        pattern4(row,columns);

        //rectangular abc abc abc
        pattern5(row,columns);

        //rectangular 123 456 789
        pattern6(row,columns);
        
    }
}
