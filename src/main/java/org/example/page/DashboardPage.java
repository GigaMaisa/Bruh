package org.example.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class DashboardPage {
    /*
    * krch esaa page klasi, logikurad vyoft imis mixedvit tu sad vimyofebit:
    * DashboardPage, HomePage, LoginPage, ProfilePage, SettingsPage da ase sh.
    * aq ra elementebic gvchirdeba imat velebs vqmnit logikuri saxelebit da daaxloebit
    * ase gamoiyureba yvela page klasi
    */

    private final SelenideElement startApplicationButton = $("a[href$='.aspx']");
    private final SelenideElement goHomeButton = $("button[value='home']");
    private final SelenideElement nameInput = $("input[value='name']");
}
