import org.junit.Test;

public class TestGoogleFlights extends TestBase {

    @Test
    public void shouldSearchForFlights() {


        googleMainPage.searchForText("Warsaw - Rabat");
        googleSearchResultsPage.goToFlights();

    }
}

