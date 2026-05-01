import java.util.Scanner;

public class company {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        int totalHours = (X * 4) + Y;

        System.out.println(totalHours);

        input.close();
    }
}