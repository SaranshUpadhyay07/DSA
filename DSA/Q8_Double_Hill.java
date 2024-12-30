package DSA;

import java.util.Scanner;

public class Q8_Double_Hill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height of the hills: ");
        int height = sc.nextInt();
        System.out.println("Type1: ");
        for(int i =1; i<=height; i++){
            for(int j =1; j<=height-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j =1;j<(height-i)*2; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Type2: ");
        for(int i =1; i<=height; i++){
            for(int j =1; j<=height-i; j++){
                System.out.print(" ");
            }
            if(i != height)
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else
            {
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
            }
            if(i != height)
            {
                for (int j = 1; j < (height - i) * 2; j++) {
                    System.out.print(" ");
                }
            }
            else
            {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
