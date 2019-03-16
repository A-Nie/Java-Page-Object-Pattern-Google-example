import org.junit.Test;

/// extends- dziedziczy drivera z test base , dla utrzymania testów osobno
public class TestGoogleImages extends TestBase {

    @Test
    public void shouldSearchForCatImages() {


        googleMainPage.searchForText("Funny cats");
        googleSearchResultsPage.goToImages();
        googleImagesSearchResultsPage.clickOnImage(2);

        driver.quit();

///dopisac test na  glowna pociagi -> przechodzi do filmow, i klika pierwszy link, (mozna dodac ze po kliknieciu linka otwiera sie zkalada you tube dla chetnych)///trzeba dodac osobna strone i osobna klase testowa dla filmow

    }
}

