package org.example.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class DashboardPage {
    /*
    * axla idea ra aris: titoeul elements davadot rame action anotacia, sadac gadavcemt tu ra gvinda:
    */

    //Actions{CLICK, VISIBLE, ENTER}
    private final SelenideElement startApplicationButton = $("a[href$='.aspx']");

    //Actions{NOT_VISIBLE, SELECT, HOVER}
    private final SelenideElement goHomeButton = $("button[value='home']");

    //Actions{EMPTY, EXIST, FILL, HAS_TEXT}
    private final SelenideElement nameInput = $("input[value='name']");

    /*
     * da ro dagenerirdes metodebi igive paternit: clickFieldName, validateFieldNameIsRagaca, hoverFieldName
     * validateFieldNameHasText(String text) {
     *      fieldName.shouldHave(Condition.text(text));
     * }
     */

    /*
    * es tavdapirveli ideaa, mara ra da rogor moxdeba poxui, mtavaria stepebi vagenerirot, tu gamova
    * lombokis msgavsad, tu arada shegvidzlia prosta sxva carieli step klasi mivutitot sadme da iq davagenerirot .java failshi
    * rac iqneba shesrulebadi is iyos ra ;d
    * */
}
