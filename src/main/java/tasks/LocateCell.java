package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LocateCellPage;

public class LocateCell implements Task {
    public static LocateCell the() {
        return Tasks.instrumented(LocateCell.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LocateCellPage.LOCATE_BUTTON),
                Enter.theValue("Apple").into(LocateCellPage.INPUT_BRAND),
                Enter.theValue("iPhone 13 Pro Max").into(LocateCellPage.INPUT_BRAND),
                Enter.theValue("iOS 15.1").into(LocateCellPage.INPUT_SO),
                Click.on(LocateCellPage.PHONE_BUTTON),
                Enter.theValue("M@nuel123456789*").into(LocateCellPage.INPUT_PASSWORD),
                Enter.theValue("M@nuel123456789*").into(LocateCellPage.INPUT_CONFIRMPASSWORD),
                Click.on(LocateCellPage.INFORM_CHECK),
                Click.on(LocateCellPage.TERM_CHECK),
                Click.on(LocateCellPage.PRIVACY_CHECK),
                Click.on(LocateCellPage.FINAL_BUTTON)
        );

    }
}
