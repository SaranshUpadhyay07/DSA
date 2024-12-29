package DSA;

import java.util.Scanner;

public class Q7_Sand_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of sand clock: ");
        int height = sc.nextInt();
        if(height%2!=0)
        {int k =height;
            for(int i =height; i>=1; i-=2) {
                for (int t = (height - i) / 2; t > 0; t--) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print("* ");

                }
                System.out.println();
            }
            for(int i =1; i<=height-2; i+=2) {
                for (int t = (height - i - 2) / 2; t >= 1; t--) {
                    System.out.print("  ");
                }

                for (int j = 0; j < i+2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else
        {
            for(int i =height; i>=1;i--){
                for (int t = height - i; t > 0; t--) {
                    System.out.print(" ");
                }

                for(int j =i; j>=1; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 2; i <= height; i++) {
                for (int t = height - i; t > 0; t--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }
}
