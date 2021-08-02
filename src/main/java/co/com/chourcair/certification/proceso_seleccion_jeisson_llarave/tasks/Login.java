package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks;

import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
    private String srtUser;
    private String srtPassword;

    public Login(String srtUser, String srtPassword) {
        this.srtUser = srtUser;
        this.srtPassword = srtPassword;
    }

    public static Object onThePage(String srtUser, String srtPassword) {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(ChoucairLoginPage.LOGIN_BUTTON),
            Enter.theValue(srtUser).into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue((srtPassword)).into(ChoucairLoginPage.LOGIN_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
