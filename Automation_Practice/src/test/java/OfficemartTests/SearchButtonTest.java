package OfficemartTests;
import StepObject.SearchButtonSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchButtonObject.*;
import static com.codeborne.selenide.Selenide.$;
public class SearchButtonTest extends Utils.ChromeRunner {
    SearchButtonSteps steps = new SearchButtonSteps();
    @Test
    @Description("Test Case 1 Click Search Button With Positive Case")
    @Severity(SeverityLevel.CRITICAL)
    public void ClickSearchButton(){
        steps.clickSearchBtn()
                .checkSearch();
        Assert.assertTrue(steps.Search.is(Condition.appear));
    }
    @Test
    @Description("Test Case 2  Search Text  With Positive Case")
    @Severity(SeverityLevel.CRITICAL)
    public void SearchCorrectInfo() {
        steps.clickSearchBtn()
                .clickSearchText()
                .searchText(SearchText)
                .searchBtnClick();
        Assert.assertTrue(steps.ResultTitle.is(Condition.text(ValidResult)));
    }
    @Test
    @Description("Test Case 3 Search Text  With Negative Case")
    @Severity(SeverityLevel.CRITICAL)
    public void SearchIncorrectInfo() {
        steps.clickSearchBtn()
                .clickSearchText()
                .searchText(SearchIncorrect)
                .searchBtnClick();
        Assert.assertTrue(steps.SearchResults.is(Condition.text(InvalidResult)));
    }
}
