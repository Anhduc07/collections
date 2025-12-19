package collections.thread;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThread {
    public  static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<String, AtomicInteger> map = new ConcurrentHashMap<>();

        map.put("one", new AtomicInteger());

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                map.get("one").incrementAndGet();
            }
        };// moi lan run taăng one lên 10k lần

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); // chạy song song
        t2.start();

        t1.join();
        t2.join();
 // t1 10k + t2 10k =20k
        System.out.println("count: " + map.get("one"));
    }
}
