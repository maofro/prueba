package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LastStepPage;

public class LastStep implements Task {
    private String password;
    private String confirpass;

    public LastStep(String password, String confirpass) {
        this.password = password;
        this.confirpass = confirpass;
    }

    public static LastStep theLast() {

        return Tasks.instrumented(LastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue(confirpass).into(LastStepPage.INPUT_CONFIRMPASSWORD),
                Click.on(LastStepPage.INFORM_CHECK),
                Click.on(LastStepPage.TERM_CHECK),
                Click.on(LastStepPage.PRIVACY_CHECK),
                Click.on(LastStepPage.FINAL_BUTTON)
        );

    }
}