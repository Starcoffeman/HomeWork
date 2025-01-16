package org.example.task13;

import java.util.concurrent.atomic.AtomicInteger;

public class UniqueID {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    public static int generateID() {
        return idCounter.getAndIncrement();
    }
}