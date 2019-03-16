import org.junit.Test;


public class TestMovies extends TestBase {
    @Test
    public void shouldSearchForTrainsMovies() throws InterruptedException {
        googleMainPage.searchForText("Pociągi");
        googleSearchResultsPage.goToMovies();
        googleMoviesSearchResultsPage.clickOnMovies(3);
        Thread.sleep(3000);

    }
}
