package by.itacademy.brest.class18.cw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable runnableTask = getRunnable();

        Callable<String> callableTask = getCallable();

        List<Callable<String>> callableTasks = List.of(callableTask, callableTask, callableTask);

        executorService.execute(runnableTask);

        Future<String> future = executorService.submit(callableTask);
        System.out.println("----------START BLOCKING FOR 3 SEC--------------------");
        System.out.println(future.get());

        System.out.println("------------------------------");

        String result = executorService.invokeAny(callableTasks);
        System.out.println(result);

        System.out.println("------------------------------");

        List<Future<String>> futures = executorService.invokeAll(callableTasks);

        futures.stream()
                .map(stringFuture -> {
                    try {
                        return stringFuture.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(System.out::println);


        executorService.shutdown();
    }

    private static Callable<String> getCallable() {
        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(3000);
            System.out.println(Thread.currentThread().getName());
            return "Task's execution: " + Thread.currentThread().getName();
        };
        return callableTask;
    }

    private static Runnable getRunnable() {
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("From runnable");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        return runnableTask;
    }
}
