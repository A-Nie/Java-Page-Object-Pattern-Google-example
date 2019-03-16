import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleMoviesSearchResultsPage {
    WebDriver driver;

    @FindBy(className = "LC20lb")

    List<WebElement> moviesList;


    public GoogleMoviesSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnMovies(int index) {
        moviesList.get(index).click();
    }


}




