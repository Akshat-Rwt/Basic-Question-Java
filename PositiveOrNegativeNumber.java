import java.util.Scanner;

public class PositiveOrNegativeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Its a positive number ");
        }

        else if(num < 0){
            System.out.println("Its a negative number ");
        }

        else{
            System.out.println("Its Zero ");
        }

    }
}