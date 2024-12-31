package DSA;

import java.util.Scanner;

public class P_Q05_Reversed_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();
        for(int j =0; j<height; j++) {
            for (int i = height; i > j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
