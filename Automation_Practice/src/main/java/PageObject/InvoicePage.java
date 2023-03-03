package PageObject;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
public interface InvoicePage {
    public SelenideElement
            SendBtn = $(By.id("btn2")),
            NameInputField = $(By.name("name")),
            CodeInputField = $(By.name("personalId")),
            AddressInputField = $(By.name("address")),
            PhoneInputField = $(By.name("phone")),
            PeriodInputField = $(By.name("date")),
            EmailInputField = $(By.name("email")),
            DateInputField = $(By.name("date"));
}
