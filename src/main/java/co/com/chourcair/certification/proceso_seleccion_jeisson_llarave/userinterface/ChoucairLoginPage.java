package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import java.lang.annotation.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the( targetElementName, "Button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target INPUT_USER = Target.the( targetElementName, "Where do we write the user")
            .located(By.id("username"));
    public static final Target LOGIN_PASSWORD = Target.the( targetElementName, "Where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the( targetElementName, "Button to confirm login")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
