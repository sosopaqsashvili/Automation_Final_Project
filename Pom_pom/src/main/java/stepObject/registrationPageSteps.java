package stepObject;

import PajeObject.registrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class registrationPageSteps extends registrationPage {
    public registrationPageSteps GoToRegPage(){
        regBtn.click();
        regPageTitle.shouldBe(Condition.enabled, Duration.ofMillis(1500));

        return this;

    }
    public registrationPageSteps FirstName(String name){
        firstNameInput.setValue(name);
        firstNameInput.shouldNot(Condition.empty);

        return this;

    }
    public registrationPageSteps LastName(String lastName){
        lastNameInput.setValue(lastName);
        lastNameInput.shouldNot(Condition.empty);

        return this;

    }
    public registrationPageSteps Email(String email){
       emailInput.setValue(email);

        return this;

    }
    public registrationPageSteps Password(String password){
        passwordInput.setValue(password);

        return this;

    }

}
