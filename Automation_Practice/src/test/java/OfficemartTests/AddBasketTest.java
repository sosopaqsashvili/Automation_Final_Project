package OfficemartTests;
import PageObject.SearchFiledPage;
import StepObject.SearchFiledPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.SearchButtonObject.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class AddBasketTest extends ChromeRunner implements SearchFiledPage {
    SearchFiledPageSteps steps = new SearchFiledPageSteps();
    @Test
    @Description("Test Case 4 Add Product to the basket ")
    @Severity(SeverityLevel.CRITICAL)
    public void AddBasketBtn (){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart();
        sleep(200);
        Assert.assertTrue(steps.AddText.isDisplayed());
    }
    @Test
    @Description("Test Case 5 Check Product Title")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckTitle(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductTitle.is(Condition.not(Condition.empty)));
    }
    @Test
    @Description("Test Case 6 Check Product Color")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckColor(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductColor.isDisplayed());
    }
    @Test
    @Description("Test Case 7 Check Product Code")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckCode(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductColor.isDisplayed());
    }
    @Test
    @Description("Test Case 8 Check Product Quantity ")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckQuantity(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductQuantity.isDisplayed());
    }
    @Test
    @Description ("Test Case 9 Check Product Price")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckPrice(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductPrice.isDisplayed());
    }
    @Test
    @Description ("Test Case 10 Check Prduct Full Price ")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckFullPrice(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductFullPrice.isDisplayed());

    }
    @Test
    @Description ("Test Case 11 Check Increase Price ")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckIncreasePrice() {
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .IncreaseQuantity();
        Assert.assertEquals(steps.GetActualPrice() * 2, steps.GetFullPrice());
    }
    @Test
    @Description ("Test Case 12 Check Decrease Price ")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckDeacreasePrice() {
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .DecreaseQuantity();
        Assert.assertEquals(steps.GetActualPrice(), steps.GetFullPrice());
    }
    @Test
    @Description ("Test Case 13 Check Product Delete Button ")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckDeleteBtn() {
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .DeleteProduct();
        Assert.assertEquals(steps.GetTotalPrice(),0);
    }
    @Test
    @Description ("Test Case 14 Check All Remove Product Button")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckAllRemoveBtn() {
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ClearCartBtn();
        Assert.assertFalse(steps.ItemTitle.isDisplayed());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 15 Check All Remove Product Button and 'კალათა ცარიელია' text is displayed.")
    public void CheckEmptyBasketText(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ClearCartBtn();
        Assert.assertTrue(steps.EmptyBasketText.isDisplayed());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 16 Check All Remove Product Button and 'გაგრძელება' text is not displayed.")
    public void CheckContinueBtn(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ClearCartBtn();
        Assert.assertFalse(steps.ContinuePurchaseBtn.isDisplayed());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 17 Check All Remove Product Button and 'კალათის გასუფთავება' text is not displayed.")
    public void CheckClearBasketBtn(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ClearCartBtn();
        Assert.assertFalse(steps.ClearCartBtn.isDisplayed());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case 18 Check That Clicking The Continue Button Will Continue The Process")
    public void CheckTwoForm(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart()
                .ContinuePurchase();
        sleep(200);
        Assert.assertTrue(steps.JuridicalFormText.isDisplayed());
        Assert.assertTrue(steps.PhysicalFormText.isDisplayed());
    }
}
