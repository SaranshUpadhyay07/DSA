package DSA;

import java.util.Scanner;
public class Right_Triangle_TowardsRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of the right triangle: ");
        int height = sc.nextInt();
        for(int i =0; i<height; i++){
            for(int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
