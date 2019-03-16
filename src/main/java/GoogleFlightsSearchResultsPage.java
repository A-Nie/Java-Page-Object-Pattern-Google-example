import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleFlightsSearchResultsPage {

    WebDriver driver;

    public GoogleFlightsSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}


