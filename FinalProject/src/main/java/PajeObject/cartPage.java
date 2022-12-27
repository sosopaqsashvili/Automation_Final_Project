package PajeObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class cartPage {
    public SelenideElement
    cartBtn = $(new By.ByClassName("cart-count")),
    searchInput = $(new By.ById("search_list")),
    faInput = $(By.className("fa-search")),
    addInput= $(By.className("add_to_cart"), 0),
    countInput =  $(By.className("cart-count"));




}
