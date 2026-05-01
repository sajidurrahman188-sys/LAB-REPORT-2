import java.util.Scanner;

public class differ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && a != c) {
            System.out.println(c);
        } 
        else if (a == c && a != b) {
            System.out.println(b);
        } 
        else if (b == c && b != a) {
            System.out.println(a);
        } 
        else {
            System.out.println("All numbers are Different");
        }

        input.close();
    }
}