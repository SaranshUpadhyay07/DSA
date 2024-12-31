package DSA;

import java.util.Scanner;

public class Q9_Left_Pascal_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the base: ");
        int base = sc.nextInt();
        if(base%2!=0)
        {
            for(int i=1; i<=base; i++){
                if(i<=(base/2))
                {
                    for(int j =1;j<=i;j++){
                        System.out.print("* ");
                    }
                }
                else
                {
                    for(int j =1;j<=(base-i)+1;j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            for(int i=1; i<=base; i++){
                if(i<=(base/2))
                {
                    for(int j =1;j<=i;j++){
                        System.out.print("* ");
                    }
                }
                else
                {
                    for(int j =1;j<=(base-i)+1;j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
