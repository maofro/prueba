package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CellPage;

public class Cell implements Task {
    public static Cell theCell() {

        return Tasks.instrumented(Cell.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Windows").into(CellPage.INPUT_COMPUTER),
                Enter.theValue("10").into(CellPage.INPUT_VERSION),
                Enter.theValue("Spanish").into(CellPage.INPUT_LENGUAJE),
                Enter.theValue("Apple").into(CellPage.INPUT_BRAND),
                Enter.theValue("iPhone 13 Pro Max").into(CellPage.INPUT_MODEL),
                Enter.theValue("iOS 15.1").into(CellPage.INPUT_SO),
                Click.on(CellPage.PHONE_BUTTON)
        );

    }
}
