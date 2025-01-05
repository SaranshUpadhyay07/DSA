package DSA;

import java.util.Scanner;

public class P_Q17_Hollow_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();
        if(side>=3){
            for(int i = 1; i<=side; i++){
                if(i==1 || i==side){
                    for(int j =1; j <= side; j++){
                        System.out.print("*  ");
                    }
                }
                else{
                    for(int j=1; j<=side; j++){
                        if(j==1 || j==side){
                            System.out.print("*  ");
                        }
                        else{
                            System.out.print("   ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
