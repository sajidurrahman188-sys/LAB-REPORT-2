import java.util.Scanner;

public class capital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        if (word.length() > 0) {
            String result = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(result);
        } else {
            System.out.println(word);
        }

        input.close();
    }
}