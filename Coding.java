
import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codingScore = sc.nextInt();
        int attendance = sc.nextInt();
        int projects = sc.nextInt();

        if (codingScore >= 60 && (attendance >= 75 || projects >= 2)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
