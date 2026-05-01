import java.util.Scanner;

public class factory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int notebooks = N * 10;

        System.out.println(notebooks);

        input.close();
    }
}