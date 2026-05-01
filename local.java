import java.util.Scanner;

public class local {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        if (word.length() > 10) {
            System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
        } else {
            System.out.println(word);
        }

        input.close();
    }
}