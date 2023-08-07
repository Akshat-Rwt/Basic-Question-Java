import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0 ) {
            int n  = num % 10 ;
            sum = sum * 10 + n ;
            num = num / 10 ;
        }
        System.out.println("Reverse of the number is:" +sum);
    }
    
}
