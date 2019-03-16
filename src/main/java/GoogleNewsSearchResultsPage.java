import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleNewsSearchResultsPage {
    WebDriver driver;
    @FindBy(className = "1")
    List<WebElement> allHeaders;//przypisanie listy elementow, slektor to odwolujemy sie do al elementow

    public GoogleNewsSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getHeaderText(int index) {

        return allHeaders.get(index).getText();
    }
}




