import java.util.Scanner;
import java.util.Vector;

public class exp3_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();

        System.out.print("Enter the number of elements in the vector: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            vector.add(element);
        }

        System.out.print("Enter the element to find its frequency: ");
        int searchElement = sc.nextInt();

        int frequency = findFrequency(vector, searchElement);
        System.out.println("Frequency of " + searchElement + " in the vector: " + frequency);

        sc.close();
    }

    public static int findFrequency(Vector<Integer> vector, int element) {
        int frequency = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i).equals(element)) {
                frequency++;
            }
        }
        return frequency;
    }
}
