import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("You entered:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        input.close();
    }
}
