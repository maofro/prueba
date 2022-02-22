package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.JoinTodayPage;

public class JoinToday implements Task{
    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayPage.JOINTODAY_BUTTON),
                Enter.theValue("Manuel Alejandro").into(JoinTodayPage.INPUT_FIRTNAME),
                Enter.theValue("Ordoñez Castro").into(JoinTodayPage.INPUT_LASTNAME),
                Enter.theValue("maofro@hotmail.com").into(JoinTodayPage.INPUT_EMAIL),
                Enter.theValue("March").into(JoinTodayPage.INPUT_BIRTHMONTH),
                Enter.theValue("29").into(JoinTodayPage.INPUT_BIRTHDAY),
                Enter.theValue("1990").into(JoinTodayPage.INPUT_BIRTHYEAR),
                Click.on(JoinTodayPage.NEXT_BUTTON)
        );
    }
}
