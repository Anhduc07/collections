package collections.thread;

public class Examples2 {

    public static void main(String[] args) {

        System.out.println("Thread  started");

        Thread thread1 = new Thread(new MyTask("data1"));
        Thread thread2 = new Thread(new MyTask("data2"));
        thread1.start();
        thread2.start();

        System.out.println("Thread main finished");
    }

    static class MyTask implements Runnable {
        private String anyData;

        public MyTask(String anyData) {
            this.anyData = anyData;
        }
        @Override
        public void run() {
            for (int i = 0; i <100; i++) {
                System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message " + i);
                }
            }
        }
    }
