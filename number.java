import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);
    }
}