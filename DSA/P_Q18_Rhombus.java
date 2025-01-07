package DSA;

import java.util.Scanner;

public class P_Q18_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the rhombus:");
        int side = sc.nextInt();
        for(int i =1; i<=side;i++){
            for(int j =1;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=side;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
