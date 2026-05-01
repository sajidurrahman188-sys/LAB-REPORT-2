import java.util.Scanner;

public class tv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();

        int subscriptions = (N + 5) / 6;
        int totalCost = subscriptions * X;

        System.out.println(totalCost);

        input.close();
    }
}