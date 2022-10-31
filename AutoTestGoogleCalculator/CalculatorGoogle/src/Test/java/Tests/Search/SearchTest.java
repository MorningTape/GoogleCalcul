package Tests.Search;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constant.Urls.SEARCH_PAGE;

public class SearchTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing () {
        basePage.open(SEARCH_PAGE);

        Google_search.enterCountRooms();

    }
}
