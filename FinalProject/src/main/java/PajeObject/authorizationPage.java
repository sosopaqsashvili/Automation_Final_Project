package PajeObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class authorizationPage {
    public SelenideElement
    authoBtn = $(new ByText("ავტორიზაცია")),
    userNameInput =  $(By.name("userName")),
    passwordInput = $(By.name("password")),
    signInBTN =  $(By.className("btn-darkred"));


}
