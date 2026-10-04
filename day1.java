import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter target company (e.g., TCS/Infosys): ");
        String target = sc.nextLine();
        
        System.out.println("\n--- Day 1 Commitment ---");
        System.out.println("Hello " + name + "! You are on track for " + target + ".");
        
        sc.close();
    }
}