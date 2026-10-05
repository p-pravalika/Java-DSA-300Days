import java.util.Scanner;

public class Day02_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your college percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter number of active backlogs: ");
        int backlogs = sc.nextInt();

        // TCS/Infosys criterion: Marks >= 60% and 0 backlogs
        if (percentage >= 60.0 && backlogs == 0) {
            System.out.println("Eligible for Campus Placements!");
        } else if (percentage >= 60.0 && backlogs > 0) {
            System.out.println("Clear your backlogs to become eligible.");
        } else {
            System.out.println("Not eligible. Minimum 60% required.");
        }

        sc.close();
    }
}
