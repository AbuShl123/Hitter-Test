package org.abu.framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;

public abstract class Hooks {

    @BeforeAll
    public static void before() throws MalformedURLException {
        Driver.init();
        System.out.println("Android application started");
    }


    @AfterAll
    public static void after() {
        Driver.close();
        System.out.println("Android application finished");
    }
}
