package com.sda.bogdan.advanced.concurrencies.sleep.ex1;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Second thread starts");
        Thread.sleep(5000);
        System.out.println("Third thread starts");

        //get thread name
        System.out.println(Thread.currentThread().getName() + "Thread starts");
    }
}
