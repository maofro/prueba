package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LastStepPage extends PageObject {
    public static final Target INPUT_PASSWORD= Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD= Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target INFORM_CHECK=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target TERM_CHECK=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='checkmark signup-consent__checkbox error']ng-class['{error: userForm.termOfUse.$error.required}')]"));
    public static final Target PRIVACY_CHECK=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='checkmark signup-consent__checkbox error']ng-class['{error: userForm.privacySetting.$error.required}')]"));
    public static final Target FINAL_BUTTON=Target.the("button that shows us the next form")
            .located(By.id("laddaBtn"));
}
