package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.NewMeetingPage;

public class InformationForNewMeeting implements Task {
    private final String nameMeeting;
    private final String numberMeeting;

    public InformationForNewMeeting(String nameMeeting , String numberMeeting ){
        this.nameMeeting = nameMeeting;
        this.numberMeeting = numberMeeting;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NewMeetingPage.BUTTON_MEETINGS),
                Click.on(NewMeetingPage.BUTTON_ADD_MEETING),
                Enter.theValue(nameMeeting).into(NewMeetingPage.INPUT_NAME_MEETING),
                Enter.theValue(numberMeeting).into(NewMeetingPage.INPUT_NUMBER_MEETING),
                Click.on(NewMeetingPage.SELECT_LOCATION),
                Click.on(NewMeetingPage.DATE_SELECT_LOCATION),
                Click.on(NewMeetingPage.SELECT_UNIT),
                Click.on(NewMeetingPage.DATE_SELECT_UNIT),
                Click.on(NewMeetingPage.SELECT_ORGANIZER),
                Click.on(NewMeetingPage.DATE_SELECT_ORGANIZER),
                Click.on(NewMeetingPage.SELECT_REPORTER),
                Click.on(NewMeetingPage.DATE_SELECT_REPORTER),
                Click.on(NewMeetingPage.SELECT_ASSISTANT),
                Click.on(NewMeetingPage.DATE_SELECT_ASSISTANT),
                Click.on(NewMeetingPage.SAVE_MEETING)
        );
    }
}
