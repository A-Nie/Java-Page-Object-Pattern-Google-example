import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    WebDriver driver;
    GoogleMainPage googleMainPage;
    GoogleSearchResultsPage googleSearchResultsPage;
    GoogleNewsSearchResultsPage googleNewsSearchResultsPage;
    GoogleImagesSearchResultsPage googleImagesSearchResultsPage;
    GoogleMoviesSearchResultsPage googleMoviesSearchResultsPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NodyBajNydże\\Desktop\\selenium2019\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.pl");
        googleMainPage = new GoogleMainPage(driver);
        googleSearchResultsPage = new GoogleSearchResultsPage(driver);
        googleNewsSearchResultsPage = new GoogleNewsSearchResultsPage(driver);
        googleImagesSearchResultsPage = new GoogleImagesSearchResultsPage(driver);
        googleMoviesSearchResultsPage = new GoogleMoviesSearchResultsPage(driver);
    }

    @After
    public void teardown() {
        driver.quit();
    }


}
