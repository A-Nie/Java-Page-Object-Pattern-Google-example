import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleImagesSearchResultsPage {

    WebDriver driver;
@FindBy(className = "rg_ic")///szukanie po class name obrazka
    List<WebElement> imagesList;
    public GoogleImagesSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
public void clickOnImage (int index){

        imagesList.get(index).click();
}

    }


