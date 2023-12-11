public class exp5_cmdline {
    public static void main(String[] args) {
        int validCount = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                // If parsing is successful, increment valid count
                validCount++;
            } catch (NumberFormatException e) {
                // If parsing fails, catch NumberFormatException and increment invalid count
                invalidCount++;
            }
        }

        System.out.println("Total Valid Integers: " + validCount);
        System.out.println("Total Invalid Integers: " + invalidCount);
    }
}
