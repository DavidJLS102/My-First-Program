import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int numberOne = scanner .nextInt();
        System.out.println("Enter a second Number");
        int numberTwo = scanner .nextInt();
        System.out.println("The Result of Sum is = "+(numberOne+numberTwo));
        double division;
        division = (double) numberOne/numberTwo;
        System.out.println("The Result of division is = "+ division);
    }
}