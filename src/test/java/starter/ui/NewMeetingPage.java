package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewMeetingPage {

    public static Target BUTTON_MEETINGS =  Target.the(" Button Meeting").locatedBy("//*[text()='Meetings']");
    public static Target BUTTON_ADD_MEETING =  Target.the(" Button addMeeting").locatedBy("//*[text()='New Meeting']");
    public static Target INPUT_NAME_MEETING =  Target.the(" Text name Meeting").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");
    public static Target INPUT_NUMBER_MEETING =  Target.the(" Text number meeting").locatedBy("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");
    public static Target SELECT_LOCATION =  Target.the(" Select Location").locatedBy("//*[@id='select2-chosen-7']");
    public static Target DATE_SELECT_LOCATION =  Target.the(" Data location").locatedBy("//*[text()='HQ-01']");
    public static Target SELECT_UNIT =  Target.the(" Select Unit").locatedBy("//*[@id='select2-chosen-8']");
    public static Target DATE_SELECT_UNIT =  Target.the(" Data Unit").locatedBy("//*[text()='Acme Corp.']");
    public static Target SELECT_ORGANIZER =  Target.the(" Select Unit").locatedBy("//*[@id='select2-chosen-9']");
    public static Target DATE_SELECT_ORGANIZER =  Target.the(" Data Unit").locatedBy("//*[text()='Adam Stewart']");
    public static Target SELECT_REPORTER =  Target.the(" Select Unit").locatedBy("//*[@id='select2-chosen-10']");
    public static Target DATE_SELECT_REPORTER =  Target.the(" Data Unit").locatedBy("//*[text()='Adam Edwards']");
    public static Target SELECT_ASSISTANT =  Target.the(" Select Unit").locatedBy("//*[@id='select2-chosen-12']");
    public static Target DATE_SELECT_ASSISTANT =  Target.the(" Data Unit").locatedBy("//*[text()='Alexandra James']");
    public static Target SAVE_MEETING =  Target.the(" Data Unit").locatedBy("//*[text()='Save']");
}
