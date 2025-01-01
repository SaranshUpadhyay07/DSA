package DSA;

import java.util.Scanner;

public class P_Q13_Hollow_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the diamond: ");
        int height = sc.nextInt();
        for(int i = 1; i<=height;i++){
            if(i<=height/2){
                for(int j = height;j>i;j--){
                    System.out.print(" ");
                }
                    System.out.print("* ");
                for(int j =1;j<i-1;j++){
                    System.out.print("  ");
                }
                if(i!=1){
                System.out.print("* ");}
            }
            else{
                for(int j = 1;j<i;j++){
                    System.out.print(" ");
                }
                System.out.print("* ");
                for(int j =1;j<=height-i-1;j++){
                    System.out.print("  ");
                }
                if(i!=height){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
