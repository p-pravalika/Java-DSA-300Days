import java.util.Scanner;

public class Day03_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int lastDigit = num % 10;          
            reversed = (reversed * 10) + lastDigit; 
            num = num / 10;                    
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);

        if (original == reversed) {
            System.out.println("It is a Palindrome Number!");
        } else {
            System.out.println("It is NOT a Palindrome Number.");
        }

        sc.close();
    }
}