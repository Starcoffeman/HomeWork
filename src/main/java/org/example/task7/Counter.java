package org.example.task7;

import lombok.Data;

@Data
public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

}
