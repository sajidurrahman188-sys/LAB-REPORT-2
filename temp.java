import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if (A <= B && C <= B) {
            System.out.println("They agree on some Temperature");
        } else {
            System.out.println("They don't agree on some Temperature");
        }

        input.close();
    }
}