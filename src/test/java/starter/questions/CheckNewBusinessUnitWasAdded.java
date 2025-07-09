package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CheckNewBusinessUnitWasAdded implements Task {
    private final String businessUnitVerified;
    public CheckNewBusinessUnitWasAdded(String businessUnitVerified ){
        this.businessUnitVerified = businessUnitVerified;
      }
   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetBusinessUnitInfo.getDescription(businessUnitVerified)).contains(businessUnitVerified)
        );
    }
}
