package RegistrationTest;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class NotPomBased {
    @Test
    public void ee(){
        open("https://ee.ge/");
        $(new By.ByClassName("btn-register")).click();
        $(new By.ByClassName("registration-titles")).shouldBe(Condition.enabled);
        $(new By.ById("firstName")).setValue("soso");
        $(new By.ById("firstName")).shouldNot(Condition.empty);
        $(new By.ById("lastName")).setValue("paqsashvili");
        $(By.id("lastName")).shouldNot(Condition.empty);
        $(By.name("email")).setValue("soso.paqsashvili2@gmail.com");
        $(By.id("password")).setValue("123445");
        Assert.assertTrue( $(By.id("singup")).is(Condition.enabled));


    }
}
