package starter.ui;


import net.serenitybdd.screenplay.targets.Target;

public class AddBusinessUnitPage {
    public static Target BUTTON_REUNION =  Target.the(" Button add").locatedBy("//*[text()='Meeting']");
    public static Target BUTTON_UNIDADES =  Target.the(" Button add").locatedBy("//*[text()='Business Units']");
    public static Target BUTTON_ADD_UNIDADES =  Target.the(" Button add").locatedBy("//*[text()='New Business Unit']");
    public static Target INPUT_NAME_UNIT = Target.the("NameUnit").locatedBy("//input[@id='Serenity_Pro_Meeting_BusinessUnitDialog3_Name']");
    public static Target SELECT_FATHER_UNIT = Target.the("SelectFatherUnit").locatedBy("//*[text()='--select--']");
    public static Target BUTTON_GUARDAR =  Target.the(" ButtonSave").locatedBy("//*[text()='Save']");
    public static Target INPUT_CLICK_OPTION_SELECTED =  Target.the(" ClickOptionSelected").locatedBy("//*[text()='Operations » Reporting']");
    public static Target BUTTON_SEARCH =  Target.the(" ButtonSearch").locatedBy("//input[@id='Serenity_Pro_Meeting_BusinessUnitGrid0_QuickSearchInput']");
}
