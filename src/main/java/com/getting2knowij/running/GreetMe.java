package com.getting2knowij.running;

public class GreetMe {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You need to tell me your name!");
        }
        System.out.printf("Hello %s", args[0]);
    }
}
