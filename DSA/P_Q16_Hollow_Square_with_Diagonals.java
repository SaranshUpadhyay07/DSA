package DSA;

import java.util.Scanner;

public class P_Q16_Hollow_Square_with_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the side of the hollow square: ");
        int side = sc.nextInt();
        for(int i = 1; i <= side; i++) {
            if(i<=side/2){
                for(int j = side/2;j>(side/2)-i+1;j--){
                    System.out.print(" ");
                }
                System.out.print("* ");
                for(int j = side/2;j>i;j--){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            else{
                if(side%2!=0){
                    if(i<=side/2+1){
                        for(int j = side/2;j>(side/2)-i+1;j--){
                            System.out.print(" ");
                        }
                        System.out.print("* ");

                    }
                    else {
                        for (int j = side; j > i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("* ");
                        for (int j = side / 2; j > side - i + 1; j--) {
                            System.out.print("  ");
                        }
                        System.out.print("*");
                    }
                }
                else {
                    for (int j = side; j > i; j--) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                    for (int j = side / 2; j > side - i + 1; j--) {
                        System.out.print("  ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
