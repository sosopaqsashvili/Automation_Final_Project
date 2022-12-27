package EeTest;

import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.authorizationPageSteps;
import stepObject.cartPageSteps;
import stepObject.registrationPageSteps;

import static DataObject.authorizationPageData.userName;
import static DataObject.registrationPageData.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationTest extends ChromeRunner {
    registrationPageSteps step = new registrationPageSteps();
    authorizationPageSteps step_2 = new authorizationPageSteps();
    @Test
    public void ee_test(){
        step.GoToRegPage()
                .FirstName(firstName)
                .LastName(lastName)
                .Email(email)
                .Password(password);

        Assert.assertFalse(step.signUpBTN.is(Condition.enabled));

    }
    @Test
    public void ee_test_2(){
        String signin = new String();
        step_2.GoToAuthoPage()
                .UserName(userName)
                .PasswordName(password);
        Assert.assertFalse( $(new By.ById("signin")).is(Condition.enabled));


    }
    @Test
    public void ee_test_3(){
        cartPageSteps step_3 = null;
        String searchInput = null;
        step_3.GoToCartPage()
                .Search(searchInput);


    }


}
