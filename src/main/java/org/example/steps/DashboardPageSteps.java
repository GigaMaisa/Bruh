package org.example.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.example.page.DashboardPage;

public class DashboardPageSteps {

    /*
     * krch esaa yle step klasi, romelshic jer obieqts vqmnit page klasis da mere obieqtidan
     * vwvdebit im fieldebs. am fieldebze dalshe vidzaxebt im Selenide-is chashenebul
     * metodebs romelic dabla natlad chans, saxelebshi paternsac daamugamebdi albat
     * sakutar obieqts imito vabrunebinebt ro mere gamodzaxebebi chavnestot-savit da
     * test klashi ase gmaovidzaxot:
     * clickGoHomeButton().hoverGoHomeButton().validateGoHomeButtonIsEnabled();
     * test klashi iqmneba ukve Step klasis obieqti da mag obieqtidan vidzaxebt am stepebs
     */
    DashboardPage dashboardPage = new DashboardPage();

    @Step
    public DashboardPageSteps clickGoHomeButton() {
        dashboardPage.getGoHomeButton().click();
        return this;
    }

    @Step
    public DashboardPageSteps hoverGoHomeButton() {
        dashboardPage.getGoHomeButton().hover();
        return this;
    }

    @Step
    public DashboardPageSteps validateGoHomeButtonIsEnabled() {
        dashboardPage.getGoHomeButton().shouldBe(Condition.enabled);
        return this;
    }

    @Step
    public DashboardPageSteps validateGoHomeButtonExists() {
        dashboardPage.getGoHomeButton().shouldBe(Condition.exist);
        return this;
    }

    @Step
    public DashboardPageSteps validateGoHomeButtonIsNotVisible() {
        dashboardPage.getGoHomeButton().shouldNotBe(Condition.visible);
        return this;
    }

    @Step
    public DashboardPageSteps fillNameInput(String text) {
        dashboardPage.getNameInput().setValue(text);
        return this;
    }

    @Step
    public DashboardPageSteps clearNameInput() {
        dashboardPage.getNameInput().clear();
        return this;
    }
}
