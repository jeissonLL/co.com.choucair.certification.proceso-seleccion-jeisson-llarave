package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class OpenUp implements Task {

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs (T Actor) {
        actor.attemptsTo(Open.browserOn(ChoucairAcademyPage));
    }
}
