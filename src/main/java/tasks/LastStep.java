package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LastStepPage;

public class LastStep implements Task {
    public static LastStep theLast() {

        return Tasks.instrumented(LastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("M@nuel123456789*").into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue("M@nuel123456789*").into(LastStepPage.INPUT_CONFIRMPASSWORD),
                Click.on(LastStepPage.INFORM_CHECK),
                Click.on(LastStepPage.TERM_CHECK),
                Click.on(LastStepPage.PRIVACY_CHECK),
                Click.on(LastStepPage.FINAL_BUTTON)
        );

    }
}