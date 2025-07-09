package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static Target INPUT_USERNAME =  Target.the("username input").locatedBy("//input[@name='Username']");
    public static Target INPUT_PASSWORD =  Target.the("username input").locatedBy("//input[@name='Password']");
    public static Target BUTTON_LOG_IN =  Target.the(" Button login").locatedBy("//button[@id='LoginPanel0_LoginButton']");
}
