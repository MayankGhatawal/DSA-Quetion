import java.util.Scanner;

public class Factorofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int number = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("Number of factors of "+ number + " is:- " + count);
    }    
}
