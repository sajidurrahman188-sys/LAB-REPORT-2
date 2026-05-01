import java.util.Scanner;

public class semester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();

        int totalStudents = X * Y;

        if (Z > totalStudents / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}