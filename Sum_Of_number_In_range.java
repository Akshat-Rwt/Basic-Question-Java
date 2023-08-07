import java.util.Scanner;

public class Sum_Of_number_In_range {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Range first number ");
        int num1 = sc.nextInt() ;

        System.out.println("Enter the Range second number ");
        int num2  = sc.nextInt();

        int sum = 0;

        for(int i = num1 ; i <= num2 ; i++){
            sum = sum + i ;
        }
        System.out.println("Sum of the range is : " +sum);
    }
    
}
