public class exp5_table extends Thread {
    private int number;

    public exp5_table(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time taken by table of " + number + ": " + totalTime + " milliseconds");
    }

    public static void main(String[] args) {
        exp5_table tableOfFive = new  exp5_table(5);
        exp5_table tableOfSeven = new exp5_table(7);
        exp5_table tableOfThirteen = new  exp5_table(13);

        tableOfFive.start();
        tableOfSeven.start();
        tableOfThirteen.start();
    }
}
