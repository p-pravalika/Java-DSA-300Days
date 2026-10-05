import java.util.Scanner;

public class Day02_Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();
        double bill = 0.0;

        if(units<=100){
            bill=units*4.0;
            
        }else if(units>100 && units<200){
            bill = (100 * 4.0) + ((units - 100) * 6.0);
        }else{
            bill = (100 * 4.0) + (100 * 6.0) + ((units - 200) * 8.0);
        }

        System.out.println("Total Bill Amount: " + bill);
        sc.close();
    }
}