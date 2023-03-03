package OfficemartTests;
import DataObject.InvoiceObject;
import PageObject.InvoicePage;
import PageObject.InvoicePage;
import StepObject.SearchFiledPageSteps;
import StepObject.InvoicePageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static DataObject.SearchButtonObject.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class InvoiceTest extends  ChromeRunner  implements InvoicePage, InvoiceObject {
    InvoicePageSteps steps = new InvoicePageSteps();
    SearchFiledPageSteps CartSteps = new SearchFiledPageSteps();

    @BeforeClass
    public void GoToPurchasePage() {
        CartSteps
                .SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ContinuePurchase();
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 19 Check The Company Name Fieled Is Red ")
    public void CheckNameFieldColor() {
        steps.ClickSendBtn();
        sleep(200);
        Assert.assertEquals(steps.GetNameFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 20 Check The Code Fieled Is Red ")
    public void CheckCodeFieldColor() {
        Assert.assertEquals(steps.GetCodeFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 21 Check The Adress Fieled Is Red ")
    public void CheckAdressFieldColor() {
        Assert.assertEquals(steps.GetAddressFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 22 Check The Phone Number Fieled Is Red ")
    public void CheckPhoneNumberFieldColor() {
        Assert.assertEquals(steps.GetPhoneFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 23 Check The Period Fieled Is Red ")
    public void CheckPeriodFieldColor() {
        Assert.assertEquals(steps.GetPeriodFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 24 Check Email Fieled Is Red ")
    public void CheckEmailFieldColor() {
        Assert.assertEquals(steps.GetEmailFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 25 Check Email Fieled Is Red ")
    public void CheckCompanyNameFieldColor() {
        steps.ClearAllFields()
                .InputCompanyName(TestName)
                .ClickSendBtn();
        Assert.assertNotEquals(steps.GetNameFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 26 Check Code Fieled Value Format ")
    public void CheckCodeFieldFormat() {
        steps.ClearAllFields()
                .InputCodeFormat(StringText);
        Assert.assertEquals(steps.GetCodeFieldValue(), "");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 27 Check Code Fieled Value Format With Less Number ")
    public void CheckCodeFieldFormatLessNumb() {
        steps.ClearAllFields()
                .InputCodeFormat(LessNumbers)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetCodeFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 28 Check Code Fieled Value Format With More Number ")
    public void CheckCodeFieldFormatMoreNumb() {
        steps.ClearAllFields()
                .InputCodeFormat(MoreNumbers);
        Assert.assertEquals(steps.GetCodeFieldValue().length(), 11);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 29 Check Code Fieled Value Format With Eleven Number ")
    public void CheckCodeFieldFormatNumb() {
        steps.ClearAllFields()
                .InputCodeFormat(ElevenNumbers)
                .ClickSendBtn();
        Assert.assertNotEquals(steps.GetCodeFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 30 Check Code Fieled Value Format With Eleven Number ")
    public void CheckAdressFieldFormatNumb() {
        steps.ClearAllFields()
                .InputAddress(TestAddress)
                .ClickSendBtn();
        Assert.assertNotEquals(steps.GetAddressFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 31 Check  Contact Number Value Format ")
    public void CheckPhoneNumbFormat() {
        steps.ClearAllFields()
                .PhoneInput(StringText);
        Assert.assertEquals(steps.GetPhoneFieldValue(), "");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 32 Check  Contact Number Value Format With Less Number ")
    public void CheckPhoneNumbFormatLessNumb() {
        steps.ClearAllFields()
                .PhoneInput(LessNumb)
                .ClickSendBtn();
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 33 Check  Contact Number Value Format With More Number ")
    public void CheckPhoneNumbFormatMoreNumb() {
        steps.ClearAllFields()
                .PhoneInput(MoreNumbers)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetPhoneFieldValue().length(), 9);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 34 Check Contact Number Value With Correct Format ")
    public void CheckPhoneNumbCorrectFormat() {
        steps.ClearAllFields()
                .PhoneInput(NineNumber)
                .ClickSendBtn();
        Assert.assertNotEquals(steps.GetPhoneFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 35 Check Information Field  With Less Symbol ")
    public void CheckInformationFildLessSymb() {
        steps.ClearAllFields()
                .InputInformation(LessNumb)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetInformationFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 36 Check Information Field  With More Than Five Symbol ")
    public void CheckInformationFildMoreSymb() {
        steps.ClearAllFields()
                .InputInformation(FiveSymbol)
                .ClickSendBtn();
        sleep(200);
        Assert.assertNotEquals(steps.GetInformationFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 37 Check Email Field  With Valid Format ")
    public void CheckValidFormatEmail() {
        steps.ClearAllFields()
                .InputEmail(ValidEmail)
                .ClickSendBtn();
        Assert.assertNotEquals(steps.GetEmailFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 38 Check Email Field  With InValid Format ")
    public void CheckInvalidFormatEmail() {
        steps.ClearAllFields()
                .InputEmail(InvalidEmail)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetEmailFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 39 Check Email Field  With Another InValid Format ")
    public void CheckAnotherInvalidFormatEmail() {
        steps.ClearAllFields()
                .InputEmail(AnotherInvalidEmail)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetEmailFieldColor(), "rgb(255, 0, 0)");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 40 Check Email Field  With Other InValid Format ")
    public void CheckOtherInvalidFormatEmail() {
        steps.ClearAllFields()
                .InputEmail(OtherInvalidEmail)
                .ClickSendBtn();
        Assert.assertEquals(steps.GetEmailFieldColor(), "rgb(255, 0, 0)");
    }
}
