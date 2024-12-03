package Laba7;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task7 {
    private static final int ARRAY_SIZE = 1_000_000;
    private static final int[] array = new int[ARRAY_SIZE];

    public static void main(String[] args) throws InterruptedException {
        fillArray();

        long singleThreadTime = calculateSingleThread();
        long multiThreadTime = calculateMultiThread();

        System.out.println("Час однопоточного виконання: " + singleThreadTime + " мс");
        System.out.println("Час багатопоточного виконання: " + multiThreadTime + " мс");
    }

    private static void fillArray() {
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(10); // Числа від 0 до 9
        }
    }

    private static long calculateSingleThread() {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Сума (однопоточно): " + sum);
        return endTime - startTime;
    }

    private static long calculateMultiThread() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        int chunkSize = ARRAY_SIZE / 5;
        Callable<Long>[] tasks = new Callable[5];
        for (int i = 0; i < 5; i++) {
            final int start = i * chunkSize;
            final int end = (i == 4) ? ARRAY_SIZE : start + chunkSize;
            tasks[i] = () -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            };
        }

        long sum = executor.invokeAll(java.util.Arrays.asList(tasks))
                .stream()
                .mapToLong(f -> {
                    try {
                        return f.get();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).sum();

        executor.shutdown();
        long endTime = System.currentTimeMillis();
        System.out.println("Сума (багатопоточно): " + sum);
        return endTime - startTime;
    }
}
