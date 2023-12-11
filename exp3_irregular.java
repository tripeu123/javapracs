public class exp3_irregular {
    public static void main(String[] args) {
        int[][] pattern = {
            {1},
            {2, 3},
            {4, 5, 6}
        };

        // Printing the pattern
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
