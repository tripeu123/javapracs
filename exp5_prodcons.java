import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Producer class
class Producer implements Runnable {
    private final BlockingQueue<Integer> sharedQueue;

    Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Produced: " + i);
                sharedQueue.put(i); // Producing item and putting in sharedQueue
                Thread.sleep(1000); // Simulating some time taken in producing
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private final BlockingQueue<Integer> sharedQueue;

    Consumer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int consumed = sharedQueue.take(); // Consuming from sharedQueue
                System.out.println("Consumed: " + consumed);
                Thread.sleep(2000); // Simulating some time taken in consuming
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main class
public class exp5_prodcons {
    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(5);

        // Creating producer and consumer threads
        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Starting producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
