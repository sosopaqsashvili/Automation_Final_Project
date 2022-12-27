package EeTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class NotPomBased {
    @Test
    public void ee(){
        open("https://ee.ge/");
        $(new By.ByClassName("cart-count")).click();
        $(new By.ById("search_list")).setValue("კომპიუტერი");
        $(By.className("fa-search")).click();
        $(By.className("add_to_cart"), 0).click();
        $(By.className("cart-count")).click();
        //$(By.className("items")).click();
       // $(By.name("userName")).setValue("soso.paqsashvili2@gmail.com");
       // $(By.name("password")).setValue("123445");
        //$(By.className("btn-darkred")).click();
        sleep(2000);
       // $(new By.ById("firstName")).setValue("soso");
       // $(new By.ById("firstName")).shouldNot(Condition.empty);
       // $(new By.ById("lastName")).setValue("paqsashvili");
       // $(By.id("lastName")).shouldNot(Condition.empty);
       // $(By.name("email")).setValue("soso.paqsashvili2@gmail.com");
       // $(By.id("password")).setValue("123445");
       // Assert.assertFalse( $(new By.ById("singup")).is(Condition.enabled));


    }
}
