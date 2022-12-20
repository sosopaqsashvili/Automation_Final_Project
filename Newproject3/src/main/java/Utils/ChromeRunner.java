package Utils;

import org.testng.annotations.BeforeTest;

import static jdk.internal.misc.ThreadFlock.open;

public class ChromeRunner {
    @BeforeTest
    public static void setUp(){
        open("https://www.facebook.com/");
    }
}

