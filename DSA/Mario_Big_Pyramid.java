package DSA;

import java.util.Scanner;

public class Mario_Big_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the Mario Big Pyramid: ");
        int height = sc.nextInt();

        for(int i=0; i<height; i++){
            int k =height;
            while(k>i+1){
                System.out.print(" ");
                k--;
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("  ");
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
