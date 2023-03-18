package com.dp.behaviour.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestObserver {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(8);
        Database database = new Database(executor);
        Admin admin = new Admin();
        Client client = new Client();

        database.registerObserver(o -> System.out.println(" Admin  " + o.toString()));
        database.registerObserver(o -> System.out.println(" DEV  " + o.toString()));

        database.registerObserver(admin);
        database.registerObserver(client);

        database.edit("DELETE");

        executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}
