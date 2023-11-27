import org.example.steps.DashboardPageSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    DashboardPageSteps dashboardPageSteps = new DashboardPageSteps();
    @BeforeTest
    public void setUp() {
        //aq racxa yleobebi ro brauzeri gavxsnat
    }

    @Test(priority = 1)
    public void testGoHomeButton() {
        dashboardPageSteps.
                clickGoHomeButton().
                validateGoHomeButtonIsNotVisible();
    }

    @Test(priority = 2)
    public void testNameInput() {
        dashboardPageSteps.
                fillNameInput("teqsti shegvyavs").
                clearNameInput();
    }

    // krch ase mivuyvebit test casebs manuali rasac wers da rasac itxovs tavisi actionebit da bolos validaciit

    @AfterTest
    public void tearDown() {
        // aq rame yleobebi ro brauzeri daixuros, reporti dagenerirdes da nu ar gvchirdeba es chven
    }
}
