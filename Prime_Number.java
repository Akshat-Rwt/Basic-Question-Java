import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();

        if(num == 1){
            System.out.println("Its is a prime number ");
        }

        for(int i = 2 ; i < (num /2) ; i++){
            if(num % i == 0){
                System.out.println("Its is a Not Prime number ");
                break ;
            }
            else{
                System.out.println("Its is a prime number ");
                break;
            }
        }
    }
}
