package DSA;

import java.util.Scanner;

public class P_Q11_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the diamond: ");
        int size = sc.nextInt();
        if(size % 2 != 0) {
            for (int i = 1; i <= size; i++) {
                if (i <= size / 2) {
                    for (int j = size; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                } else if (i == (size / 2) + 1) {
                    for (int j = size; j > i + 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i + 1; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = size; j > size - i + 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= size - i + 1; j++) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            for(int i=1; i<= size;i++){
                if(i <= size / 2){
                    for(int j=size; j>i;j--){
                        System.out.print(" ");
                    }
                    for (int j =1; j<=i;j++ ){
                        System.out.print("* ");
                    }
                }
                else
                {
                    for(int j=size; j>size-i+1;j--){
                        System.out.print(" ");
                    }
                    for(int j= size; j>=i; j--){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
