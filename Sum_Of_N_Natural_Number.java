import java.util.Scanner;

public class Sum_Of_N_Natural_Number {
     public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i <=  num ; i++){
            sum = sum + i ;

        } 

        System.out.println("Sum of First N Natural Number is :" +sum);
    }
}
