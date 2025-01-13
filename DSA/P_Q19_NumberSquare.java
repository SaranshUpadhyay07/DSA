package DSA;

import java.util.Scanner;

public class P_Q19_NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the largest element of the square : ");
        int n = sc.nextInt();
        System.out.println("The required square : ");
        int [][] matrix = new int[2*n-1][2*n-1];
        for(int i =0;i<(2*n)-1;i++){
            for(int j =0;j<(2*n)-1;j++){
                if(i<=(2*n-2)/2 && j<=(2*n-2)/2) {
                    if (n - i > n - j) {
                        matrix[i][j] = n - i;
                    } else {
                        matrix[i][j] = n - j;
                    }
                }
                else if(i<=(2*n-2)/2 && j>(2*n-2)/2){
                        if(n-i > n-(2*n-2-j)){
                            matrix[i][j] = n - i;
                        }
                        else{
                            matrix[i][j] = n-(2*n-2-j);
                        }
                }
                else if(i>(2*n-2)/2 && j<=(2*n-2)/2){
                    if(n-j > n-(2*n-2-i)){
                        matrix[i][j] = n - j;
                    }
                    else{
                        matrix[i][j] = n-(2*n-2-i);
                    }
                }
                else if(i>(2*n-2)/2 && j>(2*n-2)/2){
                    if(n-(2*n-2-i)>n-(2*n-2-j)){
                        matrix[i][j] = n - (2*n-2-i);
                    }
                    else{
                        matrix[i][j] = n - (2*n-2-j);
                    }
                }
                System.out.print(matrix[i][j] +"   ");
            }
    System.out.println();
        }
    }
}

