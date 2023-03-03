package StepObject;
import DataObject.SearchButtonObject;
import PageObject.SearchPage;
import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.w3c.dom.Text;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class SearchButtonSteps implements SearchPage, SearchButtonObject {
    @Step("Click Search Button")
    public SearchButtonSteps clickSearchBtn() {
        SearchButton.click();
        SearchButton.shouldBe(Condition.enabled);
        Duration.ofMillis(1500);
        return this;
    }
    @Step("Check Search")
    public  SearchButtonSteps checkSearch(){
        Search.shouldBe(Condition.visible);
        return this;
    }
    @Step("Click Search Text")
    public  SearchButtonSteps clickSearchText() {
        Search.click();
        return this;
    }
    @Step("Search text")
    public  SearchButtonSteps searchText(String text){
        SearchName.setValue(text);
        return this;
    }
    @Step("Search Btn Click")
    public  SearchButtonSteps searchBtnClick() {
        SearchBtnClick.pressEnter();
        return this;
    }
}
