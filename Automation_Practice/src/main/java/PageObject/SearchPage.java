package PageObject;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
public interface SearchPage {
    public SelenideElement
            SearchButton = $(byClassName("waves-effect")),
            Search = $(byClassName("form_group")),
            SearchName = $(byName("search")),
            SearchBtnClick = $(byClassName("search_button")),
            ResultTitle = $(By.className("prod_title")),
            SearchResults = $(By.xpath("/html/body/div[5]/div/h4"));
}