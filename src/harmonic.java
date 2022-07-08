import javax.swing.*;
import java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {
        double sum=0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n number.");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++){
            sum+=1.0/i; // it is important to indicate 1 as 1.0 bc we declared double.
            //or we can declare i as a double.
            System.out.println(sum);
        }

    }
}
