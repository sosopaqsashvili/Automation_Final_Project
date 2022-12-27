package stepObject;

import PajeObject.registrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class registrationPageSteps extends registrationPage {
   // @Step("Click create acount butoon")
    public registrationPageSteps GoToRegPage(){
        regBtn.click();
        regPageTitle.shouldBe(Condition.enabled, Duration.ofMillis(1500));

        return this;

    }
    //@Step("Fill first name,Value ={1}")
    public registrationPageSteps FirstName(String name){
        firstNameInput.setValue(name);
        firstNameInput.shouldNot(Condition.empty);

        return this;

    }
    //@Step("Fill last name, Value = {0}")
    public registrationPageSteps LastName(String lastName){
        lastNameInput.setValue(lastName);
        lastNameInput.shouldNot(Condition.empty);

        return this;

    }
   // @Step("Fill email, Value = {0}")
    public registrationPageSteps Email(String email){
       emailInput.setValue(email);

        return this;

    }
   // @Step("Fill password, Value = {0} ")
    public registrationPageSteps Password(String password){
        passwordInput.setValue(password);

        return this;

    }

}
