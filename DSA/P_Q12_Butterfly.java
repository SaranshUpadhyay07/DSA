package DSA;

import java.util.Scanner;

public class P_Q12_Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the wings of the butterfly: ");
        int wing = sc.nextInt();
        if(wing%2==0){
            for (int i = 1; i <= wing; i++) {
                if (i <= wing / 2) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    for (int j = wing / 2; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= wing / 2 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                }
                else {
                    for (int j = 1; j <= wing - i + 1; j++) {
                        System.out.print("* ");
                    }
                    for (int j = wing / 2; j > (wing - i) + 1; j--) {
                        System.out.print("  ");
                    }
                    for (int j = wing / 2; j > wing - i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = wing; j >= i; j--) {
                        System.out.print("* ");
                    }
                }

                System.out.println();
            }
        }
        else {
            for (int i = 1; i <= wing; i++) {
                if (i <= wing / 2) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    for (int j = wing / 2; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= wing / 2 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                } else if (i == (wing / 2) + 1) {
                    for (int j = 1; j <= wing; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 1; j <= wing - i + 1; j++) {
                        System.out.print("* ");
                    }
                    for (int j = wing / 2; j > (wing - i) + 1; j--) {
                        System.out.print("  ");
                    }
                    for (int j = wing / 2; j > wing - i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = wing; j >= i; j--) {
                        System.out.print("* ");
                    }
                }

                System.out.println();
            }
        }

    }
}
