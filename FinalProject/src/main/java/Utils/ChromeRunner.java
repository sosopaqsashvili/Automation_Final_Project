package Utils;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest (description ="Configure browser before tests")
    public static void setUp(){

        open("https://ee.ge/");
    }
}
