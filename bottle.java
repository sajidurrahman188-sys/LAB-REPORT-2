import java.util.Scanner;

public class bottle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int B1 = input.nextInt();
        int B2 = input.nextInt();
        int B3 = input.nextInt();

        int fullBottles = B1 + B2 + B3;

        if (fullBottles <= 1) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        input.close();
    }
}