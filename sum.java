import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total = total + i;
        }

        System.out.println("Sum from 1 to " + n + " is: " + total);

        input.close();
    }
}