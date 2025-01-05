package DSA;

import java.util.Scanner;

public class P_Q18_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the heart:");
        int heart = sc.nextInt();
        for(int i = 1; i <= heart/2; i++){
            for(int j =heart/2; j >i; j--){
                System.out.print("  ");
            }
            for(int j =1; j <=i; j++){
                System.out.print("*   ");

            }
            for(int j =1;j<=(heart/2-i)*2; j++){
                System.out.print("  ");
            }
            for(int j =1; j <=i; j++){
                System.out.print("*   ");
            }
            System.out.println();

        }
        for(int i =1; i<=heart; i++ ){
            for(int j =1;j<i;j++){
                System.out.print("  ");
            }
            System.out.print("*   ");
            for(int j=heart-i;j>1;j--){
                System.out.print("    ");
            }
            if(i!=heart)
                System.out.print("*    ");
            System.out.println();
        }
    }
}
