import java.util.Arrays;

public class exp3_vampire {
    public static void main(String[] args) {
        int number = 1395; // Replace this with user input
        boolean isVampire = isVampireNumber(number);
        if (isVampire) {
            System.out.println(number + " is a vampire number.");
        } else {
            System.out.println(number + " is not a vampire number.");
        }
    }

    public static boolean isVampireNumber(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        if (len != 4) {
            return false; // Not a 4-digit number
        }

        char[] digits = str.toCharArray();
        Arrays.sort(digits);
        String sortedStr = new String(digits);

        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                int product = i * j;
                if (product == num) {
                    String concatenated = Integer.toString(i) + Integer.toString(j);
                    char[] concatDigits = concatenated.toCharArray();
                    Arrays.sort(concatDigits);
                    String sortedConcat = new String(concatDigits);

                    if (sortedConcat.equals(sortedStr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
