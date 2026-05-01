import java.util.Scanner;

public class exist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int C = input.nextInt();

        if ((A + C) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        input.close();
    }
}