import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        if (X + 3 <= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}