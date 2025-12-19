package collections.thread;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.putIfAbsent("one", 1);
        map.computeIfPresent("one", (k, v) -> v + 1);

        System.out.println(map.get("one"));
    }
}

