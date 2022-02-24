package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LocatePage;

public class Locate implements Task {
    public static Locate the() {

        return Tasks.instrumented(Locate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Tuluá").into(LocatePage.INPUT_CITY),
                Enter.theValue("763021").into(LocatePage.INPUT_ZIP),
                Enter.theValue("Colombia").into(LocatePage.INPUT_COUNTRY),
                Click.on(LocatePage.LOCATE_BUTTON)
        );
    }
}
