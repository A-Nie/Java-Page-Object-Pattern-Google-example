import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGoogleNews extends TestBase {



        @Test
        public void shouldSearchForNewsAboutPoland() {
            googleMainPage.searchForText("Polska");
            googleSearchResultsPage.goToNews();
            String secondHeaderText = googleNewsSearchResultsPage.getHeaderText(1);
            assertThat(secondHeaderText, containsString("Pracują w Polsce"));
        }


    @Test
    public void shouldSearchForMonkeyNews() {

        googleMainPage.searchForText("Monkey");

        googleSearchResultsPage.goToNews();

        String secondHeaderText = googleNewsSearchResultsPage.getHeaderText(1);
        assertThat(secondHeaderText, equalTo("'Greedy' monkey road blocker gets free ride"));
    }
}
