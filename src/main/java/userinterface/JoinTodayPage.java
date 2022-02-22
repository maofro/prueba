package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class JoinTodayPage extends PageObject {
    public static final Target JOINTODAY_BUTTON=Target.the("button that shows us the form to join")
            .located(By.xpath("//div@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//ui-sref[contains(text(),'signup.personal')]"));
    public static final Target INPUT_FIRTNAME= Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME= Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL= Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_BIRTHMONTH= Target.the("where do we write the birth month").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTHDAY= Target.the("where do we write the birth day").located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR= Target.the("where do we write the birth year").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON=Target.the("button to continuing to the next step").located(By.xpath("//button[contains(@class,'form-group col-xs-12 text-right')]"));

}
