package DSA;
import java.util.*;

public class P_Q15_Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int height = sc.nextInt();
        for(int i =1; i<=height;i++){
            for(int j =height;j>i;j--){
                System.out.print(" ");
            }
            int brick = 1;
            for(int j = 1; j<=i;j++){
               do{
                System.out.print(brick+" ");
                brick++;}while(brick<=j);
            }
            System.out.println();
        }
    }
}
