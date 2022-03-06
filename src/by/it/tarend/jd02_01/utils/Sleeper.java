package by.it.tarend.jd02_01.utils;

import by.it.tarend.jd02_01.exceptions.StoreException;

public class Sleeper {

    private Sleeper() {
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis / Constants.K_SPEED);
        } catch (InterruptedException e) {
            throw new StoreException("message" +e);
        }
    }

}


