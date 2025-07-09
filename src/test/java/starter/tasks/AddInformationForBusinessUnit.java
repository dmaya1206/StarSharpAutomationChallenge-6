package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.ui.AddBusinessUnitPage;

public class AddInformationForBusinessUnit implements Task {
    private final String nameUnit;
    private final String fatherUnit;

    public AddInformationForBusinessUnit(String nameUnit , String fatherUnit ){
        this.nameUnit = nameUnit;
        this.fatherUnit = fatherUnit;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddBusinessUnitPage.BUTTON_REUNION),
                Click.on(AddBusinessUnitPage.BUTTON_UNIDADES),
                Click.on(AddBusinessUnitPage.BUTTON_ADD_UNIDADES),
                Enter.theValue(nameUnit).into(AddBusinessUnitPage.INPUT_NAME_UNIT),
                Click.on(AddBusinessUnitPage.SELECT_FATHER_UNIT),
                Click.on(AddBusinessUnitPage.INPUT_CLICK_OPTION_SELECTED),
                Click.on(AddBusinessUnitPage.BUTTON_GUARDAR),
                Click.on(AddBusinessUnitPage.BUTTON_UNIDADES),
                Enter.theValue(nameUnit).into(AddBusinessUnitPage.BUTTON_SEARCH),
                Click.on(AddBusinessUnitPage.BUTTON_SEARCH)

        );
    }
}
