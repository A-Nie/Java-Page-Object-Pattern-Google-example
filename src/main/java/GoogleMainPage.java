///Page Object Pattern:
// jest po to by rozdzielić kody testów i kodu ze strony
///łatwiejsze utrzymanie (zmiany na stronie powodują zmiany w klasie opisującej tą stronę)
///większa czytelność testów
///

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    WebDriver driver;
    @FindBy(name = "q")//pozwala koszystac z elementow na stronie, z metod
    WebElement searchInput;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);///konstruktor inicjalizacja divera i strony -"this" bo jestesmy wewnatrz storny
    }

    public void searchForText(String text) {
        searchInput.sendKeys(text);
        searchInput.submit();
    }

    public void clearSearch() {
        searchInput.clear();
    }
}
