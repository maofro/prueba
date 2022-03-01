package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LocatePage;

public class Locate implements Task {
    private String city;
    private String zip;
    private String country;

    public Locate(String city, String zip, String country) {
        this.city = city;
        this.zip = zip;
        this.country = country;
    }


    public static Locate the() {

        return Tasks.instrumented(Locate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(LocatePage.INPUT_CITY),
                Enter.theValue(zip).into(LocatePage.INPUT_ZIP),
                Enter.theValue(country).into(LocatePage.INPUT_COUNTRY),
                Click.on(LocatePage.LOCATE_BUTTON)
        );
    }
}
