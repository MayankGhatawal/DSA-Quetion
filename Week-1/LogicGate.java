import java.util.Scanner;

public class LogicGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number (0 or 1):- ");
        int a = sc.nextInt();
        if(a != 1 && a != 0){
            System.out.println("Number is Invalid");
            return;
        }
        System.out.print("Enter the Second Number (0 or 1):- ");
        int b = sc.nextInt();
        if(b != 1 && b != 0){
            System.out.println("Number is Invalid");
            return;
        }
        sc.nextLine();
        System.out.print("Enter the Logic Gate(OR & AND & XOR & NOT):- ");
        String logic = sc.nextLine().toUpperCase();

        int result = -1;

        switch (logic) {
            case "AND":
                result = a & b;
                break;
            case "OR":
                result = a | b;
                break;
            case "XOR":
                result = a ^ b;
                break;
            case "NOT":
                System.out.println("NOT " + a + " = " + (a == 0 ? 1 : 0));
                System.out.println("NOT " + b + " = " + (b == 0 ? 1 : 0));
                return;
            default:
                System.out.println("Number is Invalid");
                break;
        }
        System.out.println("Output: " + result);

    }
}
