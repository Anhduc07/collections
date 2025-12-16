package collections.thread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Examples3 {
    public static void main(String[] args) {

        System.out.println("Thread  started");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());

        executorService.shutdown();

        System.out.println("Thread main finished");
    }
}

    class Task implements Runnable {
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}