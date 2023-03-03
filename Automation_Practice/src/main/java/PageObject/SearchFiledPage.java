package PageObject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$;

public interface SearchFiledPage {
    public SelenideElement
            SearchButtonn = $(byClassName("waves-effect")),
            Search = $(byClassName("form_group")),
            SearchName = $(byName("search")),
            SearchBtnClick = $(byClassName("search_button")),
            AddCartBtn = $(By.className("add_cart")),
            AddText = $(By.id("toast-container")),
            CartBtn = $(By.className("cart_info")),
            ProductTitle = $(byClassName("item_title")),
            ProductColor = $(By.className("item_col")),
            ProductQuantity = $(By.name("quantity")),
            ProductPrice = $(By.xpath("/html/body/div[5]/div/div[3]/div[6]/div[2]/span[1]")),
            ProductFullPrice= $(By.xpath("/html/body/div[5]/div/div[3]/div[7]/div[2]/span[1]")),
            IncreaseBtn = $(By.xpath("/html/body/div[5]/div/div[3]/div[5]/div/button[1]")),
            DecreaseBtn = $(By.xpath("/html/body/div[5]/div/div[3]/div[5]/div/button[2]")),
            DeleteProductBtn = $(By.xpath("/html/body/div[5]/div/div[3]/div[1]/button")),
            TotalPrice = $(By.id("totalPrice")),
            ClearCartBtn = $(By.linkText("კალათის გასუფთავება")),
            ItemTitle = $(By.className("item_title")),
            EmptyBasketText = $(By.className("emptyCart")),
            ContinuePurchaseBtn = $(By.linkText("გაგრძელება")),
            JuridicalFormText = $(By.id("pis")),
            PhysicalFormText = $(By.id("iur"));
}

