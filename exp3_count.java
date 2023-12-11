import java.util.Scanner;

public class exp3_count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        int spaceCount = 0;
        int vowelCount=0;
        int consonantCount=0;

        int wordCount = sentence.split("\\s+").length;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetCount++;
                if (isVowel(ch)) {
                    // Increment vowel count if character is a vowel
                    vowelCount++;
                } else {
                    // Increment consonant count if character is a consonant
                    consonantCount++;
                }
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialSymbolCount++;
            }
        }

        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + (alphabetCount - vowelCount));
        
        scanner.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
