import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = input.nextInt();
        int Q = input.nextInt();
        int R = input.nextInt();
        int S = input.nextInt();

        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("There is a Monopoly in the Market");
        } else {
            System.out.println("There is no Monopoly in the Market");
        }

        input.close();
    }
}