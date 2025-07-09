package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.CheckNewBusinessUnitPage;

public class GetBusinessUnitInfo {
    public static Question<String> getDescription(String nameUnitToCheck){

        return Question.about(nameUnitToCheck).answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(CheckNewBusinessUnitPage.BUSINESS_UNIT_TABLE_XPATH)
        );
    }


}
