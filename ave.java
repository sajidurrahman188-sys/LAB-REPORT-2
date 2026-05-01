import java.util.Scanner;

public class ave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }

        double average = (double) sum / 5;

        System.out.println("Average is: " + average);

        input.close();
    }
}