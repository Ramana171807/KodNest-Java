import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] readings = new int[5];

        for (int i = 0; i < 5; i++) {
            readings[i] = scanner.nextInt();
        }

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += readings[i];
        }

        System.out.println("Total: " + total);
    }
}