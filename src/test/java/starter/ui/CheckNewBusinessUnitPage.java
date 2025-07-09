package starter.ui;

import net.serenitybdd.screenplay.targets.Target;


public class CheckNewBusinessUnitPage {
    public static Target CONFIRM_BUSINESS_UNIT_ADD = Target.the("Confirm Business Unit Added").locatedBy("//div[@class='grid-canvas']");
    public static String BUSINESS_UNIT_TABLE_XPATH = "//div[@class='grid-canvas']";
}
