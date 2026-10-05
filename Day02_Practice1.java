import java.util.Scanner;

public class Day02_Practice1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your college percentage: ");
        int n = sc.nextInt();
        if (n>0){
            if (n%2==0){
                System.out.println("number positive and even");
            }else{
                System.out.println("number is positive and odd");
            }
        }else if(n<0){
            if (n%2==0){
                System.out.println("number negative and even");
            }else{
                System.out.println("number is nagitive and odd");
            }
        }else{
            System.out.println("number is zero");
        }
        sc.close();
   } 
}
