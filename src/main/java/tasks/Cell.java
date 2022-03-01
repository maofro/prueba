package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CellPage;

public class Cell implements Task {
    private String computer;
    private String version;
    private String lenguaje;
    private String brand;
    private String model;
    private String SO;

    public Cell(String computer, String version, String lenguaje, String brand, String model, String SO) {
        this.computer = computer;
        this.version = version;
        this.lenguaje = lenguaje;
        this.brand = brand;
        this.model = model;
        this.SO = SO;
    }



    public static Cell theCell() {

        return Tasks.instrumented(Cell.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(computer).into(CellPage.INPUT_COMPUTER),
                Enter.theValue(version).into(CellPage.INPUT_VERSION),
                Enter.theValue(lenguaje).into(CellPage.INPUT_LENGUAJE),
                Enter.theValue(brand).into(CellPage.INPUT_BRAND),
                Enter.theValue(model).into(CellPage.INPUT_MODEL),
                Enter.theValue(SO).into(CellPage.INPUT_SO),
                Click.on(CellPage.PHONE_BUTTON)
        );

    }
}
