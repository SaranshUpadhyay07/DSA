//Write a program to print a Diagonal star square but if number is < 5, print "Invalid Value".
//The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
// In the first or last row
// In the first or last column
// When the row number equals the column number
// When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
package DSA;

import java.util.Scanner;

public class Diagonal_Star_Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int number = sc.nextInt();
        if(number >= 5)
        {
            for(int i =0 ;i < number; i++){
                if(i == 0 || i == number -1)
                {
                    for (int j =0; j< number; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else
                {
                    for(int j =0; j < number; j++){
                        if(j == 0 || j == number -1)
                        {
                            System.out.print("*");
                        }
                        else if(i ==j || i == number-(j+1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("Invalid Valid");
    }
}
