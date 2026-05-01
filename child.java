import java.util.Scanner;

public class child {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();

        int remaining = N - X;

        if (remaining <= 0) {
            System.out.println(0);
        } else {
            int packets = (remaining + 3) / 4;
            System.out.println(packets);
        }

        input.close();
    }
}