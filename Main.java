import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with only lowercase English letters: ");
        String input = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);

        scanner.close();
    }
}
