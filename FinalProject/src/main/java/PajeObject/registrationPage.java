package PajeObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class registrationPage {
    public SelenideElement
    regBtn = $(new By.ByClassName("btn-register")),
    regPageTitle = $(new By.ByClassName("registration-titles")),
    firstNameInput = $(new By.ById("firstName")),
    lastNameInput =  $(new By.ById("lastName")),
    emailInput = $(By.name("email")),
    passwordInput =  $(By.id("password")),
    signUpBTN = $(new By.ById("singup"));




}
