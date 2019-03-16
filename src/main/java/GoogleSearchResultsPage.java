import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage {
    WebDriver driver;

    @FindBy(linkText = "Loty")
    WebElement flightsButton;
    @FindBy(linkText = "Grafika")
    WebElement imagesButton;
    @FindBy(linkText = "News")
    WebElement newsButton;
    @FindBy(linkText = "Więcej")
    WebElement moreButton;
    @FindBy(linkText = "Filmy")
    WebElement moviesButton;


    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToFlights() {

        try {
            flightsButton.click();
        } catch (NoSuchElementException myException) {

            moreButton.click();
            flightsButton.click();
        }

    }

    public void goToImages() {

        imagesButton.click();

    }

    public void goToNews() {

        newsButton.click();
    }
    public void goToMovies(){
        moviesButton.click();
    }
    }





