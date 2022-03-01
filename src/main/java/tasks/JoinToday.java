package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.JoinTodayPage;

public class JoinToday implements Task{
    private String firstname;
    private String lastname;
    private String email;
    private String mounth;
    private String day;

    public JoinToday(String firstname, String lastname, String email, String mounth, String day, String year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mounth = mounth;
        this.day = day;
        this.year = year;
    }

    private String year;

    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayPage.JOINTODAY_BUTTON),
                Enter.theValue(firstname).into(JoinTodayPage.INPUT_FIRTNAME),
                Enter.theValue(lastname).into(JoinTodayPage.INPUT_LASTNAME),
                Enter.theValue(email).into(JoinTodayPage.INPUT_EMAIL),
                Enter.theValue(mounth).into(JoinTodayPage.INPUT_BIRTHMONTH),
                Enter.theValue(day).into(JoinTodayPage.INPUT_BIRTHDAY),
                Enter.theValue(year).into(JoinTodayPage.INPUT_BIRTHYEAR),
                Click.on(JoinTodayPage.NEXT_BUTTON)
        );
    }
}
