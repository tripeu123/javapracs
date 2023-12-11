import java.util.Scanner;

public class exp3_meta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean areMetaStrings = checkMetaStrings(str1, str2);
        if (areMetaStrings) {
            System.out.println("The strings are Meta strings.");
        } else {
            System.out.println("The strings are not Meta strings.");
        }

        scanner.close();
    }

    public static boolean checkMetaStrings(String str1, String str2) {
        // Check if both strings are of equal length
        if (str1.length() != str2.length()) {
            return false;
        }

        int len = str1.length();
        int unmatchedCount = 0;
        int firstIndex = -1;
        int secondIndex = -1;

        // Loop through the strings to find unmatched characters
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                unmatchedCount++;
                if (unmatchedCount == 1) {
                    firstIndex = i;
                } else if (unmatchedCount == 2) {
                    secondIndex = i;
                } else {
                    return false; // More than 2 unmatched characters
                }
            }
        }

        // Check if swapping characters makes strings equal
        if (unmatchedCount == 2 && str1.charAt(firstIndex) == str2.charAt(secondIndex) &&
                str1.charAt(secondIndex) == str2.charAt(firstIndex)) {
            return true;
        }

        return false;
    }
}
