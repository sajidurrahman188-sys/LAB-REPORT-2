import java.util.Scanner;

public class great {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        double average = (A + B) / 2.0;

        if (average > C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        input.close();
    }
}