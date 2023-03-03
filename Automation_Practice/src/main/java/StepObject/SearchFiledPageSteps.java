package StepObject;
import PageObject.SearchFiledPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
public class SearchFiledPageSteps implements SearchFiledPage {

    @Step ("Search Button")
    public SearchFiledPageSteps SearchBtn (){
        SearchButtonn.click();
        return this;
    }
    @Step("Click On The Search Field ")
    public SearchFiledPageSteps ClickSearch(){
        Search.click();
        return this;
    }
    @Step("Search With Valid Text")
    public SearchFiledPageSteps SearchText(String text){
        SearchName.setValue(text);
        return this;
    }
    @Step("Click Search Button")
    public SearchFiledPageSteps ClickEnter(){
        SearchBtnClick.pressEnter();
        return this;
    }
    @Step("Add Cart Button")
    public SearchFiledPageSteps AddCart() {
        AddCartBtn.click();
        return this;
    }
    @Step("Go To Cart")
    public SearchFiledPageSteps GoToCart(){
        CartBtn.click();
        return this;
    }
    @Step("Increase Product Quantity")
    public SearchFiledPageSteps IncreaseQuantity(){
        IncreaseBtn.click();
        return this;
    }
    @Step("Get Actual Price ")
    public double GetActualPrice(){
        return Double.parseDouble(ProductPrice.getOwnText());
    }
    @Step("Get Increased Price ")
    public double GetFullPrice(){
        return Double.parseDouble(ProductFullPrice.getOwnText());
    }
    @Step("Decrease Product Quantity")
    public SearchFiledPageSteps DecreaseQuantity(){
        DecreaseBtn.click();
        return this;
    }
    @Step("Delete Product")
    public SearchFiledPageSteps DeleteProduct(){
        DeleteProductBtn.click();
        return this;
    }
    @Step("Get Total Price Of The Product")
    public double GetTotalPrice(){
        return Double.parseDouble(TotalPrice.getOwnText());
    }
    @Step("All Clear Basket")
    public SearchFiledPageSteps ClearCartBtn(){
        ClearCartBtn.click();
        return this;
    }
    @Step("Continue Purchase")
    public SearchFiledPageSteps ContinuePurchase(){
        ContinuePurchaseBtn.click();
        return this;
    }
}
