package stepObject;

import PajeObject.authorizationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class authorizationPageSteps extends authorizationPage {
    public authorizationPageSteps GoToAuthoPage () {

        authoBtn.click();
        authoBtn.shouldBe(Condition.enabled, Duration.ofMillis(1500));

        return this;
    }
    public authorizationPageSteps UserName(String name) {

        userNameInput.setValue(name);


        return this;
    }
    public authorizationPageSteps PasswordName(String password) {

        passwordInput.setValue(password);


        return this;
    }

    public authorizationPageSteps SignInBtnN (String signin) {

        signInBTN.setValue(signin);


        return this;
    }

}
