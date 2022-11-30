package week3;
import java.util.Scanner;


public class Ex53 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Your word: ");
            String word = reader.nextLine();

            System.out.print("length of the first part: ");
            int wordCount = Integer.parseInt(reader.nextLine());

            System.out.println(word.substring(0, wordCount));
        }
    }
}

