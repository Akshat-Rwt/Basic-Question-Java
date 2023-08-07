import java.util.Scanner;

public class Greater_Of_Two_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("NUM 1 is greater than NUM 2");
        }

        else{
            System.out.println("NUM 2 is greater than NUM 1");
        }
    }
    
}
