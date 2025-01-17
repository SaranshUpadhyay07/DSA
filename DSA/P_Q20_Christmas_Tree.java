package DSA;

import java.util.Scanner;

public class P_Q20_Christmas_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the tree: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of the tree's base: ");
        int y = sc.nextInt();

        for(int k=1;k<=n;k++) {
            if(k==1) {
                for (int i = 1; i <= y; i++) {
                    for (int j = y-1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else{
                for (int i = y/2; i <= y; i++) {
                    for (int j = y-1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
        for(int j =1;j<=n/2+1; j++){
            for(int i=1; i<=y/2;i++){
                 System.out.print(" ");
            }
            for(int i=1; i<=y/2;i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
