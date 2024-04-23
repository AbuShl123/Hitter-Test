package org.abu.utils;

public class SeleniumActions {
    private SeleniumActions() {
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
