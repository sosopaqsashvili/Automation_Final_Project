package StepObject;
import DataObject.InvoiceObject;
import PageObject.InvoicePage;
import PageObject.InvoicePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
public class InvoicePageSteps implements InvoicePage, InvoiceObject {
    @Step("Clicking on Send button")
    public void ClickSendBtn() {
        SendBtn.click();
    }
    @Step("Get Name Field Color")
    public String GetNameFieldColor() {
        return NameInputField.getCssValue("border-color");
    }
    @Step("Get Code Field Border Color")
    public String GetCodeFieldColor() {
        return CodeInputField.getCssValue("border-color");
    }
    @Step("Get Address Field Color")
    public String GetAddressFieldColor() {
        return AddressInputField.getCssValue("border-color");
    }
    @Step("Get Phone Field Color")
    public String GetPhoneFieldColor() {
        return PhoneInputField.getCssValue("border-color");
    }
    @Step("Get Period Field Color")
    public String GetPeriodFieldColor() {
        return PeriodInputField.getCssValue("border-color");
    }
    @Step("Get Email Field Color")
    public String GetEmailFieldColor() {
        return EmailInputField.getCssValue("border-color");
    }
    @Step("Clear all fields")
    public InvoicePageSteps ClearAllFields() {
        NameInputField.clear();
        CodeInputField.clear();
        AddressInputField.clear();
        PhoneInputField.clear();
        PeriodInputField.clear();
        EmailInputField.clear();
        return this;
    }
    @Step("Input Name")
    public InvoicePageSteps InputCompanyName(String value) {
        NameInputField.sendKeys(value);
        return this;
    }
    public InvoicePageSteps InputCodeFormat(String value) {
        CodeInputField.sendKeys(value);
        return this;
    }
    @Step("Get Code Field Value")
    public String GetCodeFieldValue() {
        return CodeInputField.getAttribute("value");
    }
    @Step("Input Address")
    public InvoicePageSteps InputAddress(String value) {
        AddressInputField.sendKeys(value);
        return this;
    }
    @Step("Input phone")
    public InvoicePageSteps PhoneInput(String value) {
        PhoneInputField.sendKeys(value);
        return this;
    }
    @Step("Get Phone Field Value")
    public String GetPhoneFieldValue() {
        return PhoneInputField.getAttribute("value");
    }
    @Step("Input Date")
    public InvoicePageSteps InputInformation(String value) {
        DateInputField.sendKeys(value);
        return this;
    }
    @Step("Get Information Field  Color")
    public String GetInformationFieldColor() {
        return DateInputField.getCssValue("border-color");
    }
    @Step("Input email")
    public InvoicePageSteps InputEmail(String value) {
        EmailInputField.sendKeys(value);
        return this;
    }

}