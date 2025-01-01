package DSA;
import java.util.*;
public class P_Q14_Zig_Zag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the zig zag pattern: ");
        int height = sc.nextInt();
        for(int i=1; i<=height; i++){
            for(int k=1;k<=height;k++) {
                for (int j = height; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print("* ");
                for (int j = height; j > height - i + 2; j--) {
                    System.out.print("  ");
                }
                if (i != 1) {
                    System.out.print("* ");
                }
                for (int j = height; j >= i; j--) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
