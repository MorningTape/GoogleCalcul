package Tests.TestCase;

import Tests.Base.BaseTest;
import org.testng.annotations.Test;

import static constants.Constant.Urls.SEARCH_PAGE;

public class TestCase3 extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage.open(SEARCH_PAGE);

        Google_search.enterCountRooms();
        googleCalculator.enterTestCase3();
    }
}


