package com.general;

public class PrintSeq2Thread {
    synchronized void printSequentially() {

    }

    public static void main(String[] args) {

        new Sequence().start();
        new Sequence().start();
    }
}

class Sequence extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.print(i + " ");
        }
    }
}