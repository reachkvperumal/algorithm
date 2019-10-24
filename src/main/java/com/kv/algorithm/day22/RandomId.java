package com.kv.algorithm.day22;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class RandomId {
    private static final Character[] endians =
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                    'u', 'v', 'w', 'x', 'y', 'z',
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                    'U', 'V', 'W', 'X', 'Y', 'Z',
                    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            };

    private static ThreadLocal<Character> threadLocal = new ThreadLocal<Character>();

    private static AtomicLong iterator = new AtomicLong(-1);


    public static String generateShorterTxnId() {
        // Keep this as secure random when we want more secure, in distributed systems
        int firstLetter = ThreadLocalRandom.current().nextInt(0, (endians.length));

        //Sometimes your randomness and timestamp will be same value,
        //when multiple threads are trying at the same nano second
        //time hence to differentiate it, utilize the threads requesting
        //for this value, the possible unique thread numbers == endians.length
        Character secondLetter = threadLocal.get();
        if (secondLetter == null) {
            synchronized (threadLocal) {
                if (secondLetter == null) {
                    threadLocal.set(endians[(int) (iterator.incrementAndGet() % endians.length)]);
                }
            }
            secondLetter = threadLocal.get();
        }
        return "" + endians[firstLetter] + secondLetter + System.nanoTime();
    }

    public static void main(String[] args) {
        System.out.println(generateShorterTxnId());
    }
}
