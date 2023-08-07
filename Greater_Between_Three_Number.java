import java.util.Scanner;

public class Greater_Between_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Third number ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Greatest number is NUM1 : " +num1 );
        }

        else if(num2 > num1 && num2 > num3){
            System.out.println("Greater number is NUM 2:" +num2);
        }
        
        else{
            System.out.println("Greater number is NUM 3: " +num3 );
        }
    }
}
