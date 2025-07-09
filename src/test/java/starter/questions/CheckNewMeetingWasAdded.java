package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CheckNewMeetingWasAdded implements Task {
    private final String meetingCreateToVerify;
    public CheckNewMeetingWasAdded(String meetingCreateToVerify ){
        this.meetingCreateToVerify = meetingCreateToVerify;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetBusinessUnitInfo.getDescription(meetingCreateToVerify)).contains(meetingCreateToVerify)
        );
    }
}
