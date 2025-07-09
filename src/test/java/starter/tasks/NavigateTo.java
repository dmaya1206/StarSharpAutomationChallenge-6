package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable loginPage(){
        return Task.where("{0} navigate to login page",
                Open.url("https://serenity.is/demo/")
        );
    }
}
