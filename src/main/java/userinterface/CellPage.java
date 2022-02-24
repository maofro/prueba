package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CellPage extends PageObject {
    public static final Target INPUT_COMPUTER= Target.the("where do we write teh type of SO of the computer do you have")
            .located(By.xpath("//div@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select OS')]"));
    public static final Target INPUT_VERSION= Target.the("where do we write teh type of version of the computer do you have")
            .located(By.xpath("//div@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select a Version')]"));
    public static final Target INPUT_LENGUAJE= Target.the("where do we write teh type of lenguaje of the computer do you have")
            .located(By.xpath("//div@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select OS language')]"));
    public static final Target INPUT_BRAND= Target.the("where do we write the brand of the cellphone do you have")
            .located(By.xpath("//div@class='ui-select-box']//span[contains(text(),'Select Brand')]"));
    public static final Target INPUT_MODEL= Target.the("where do we write the model of the cellphone do you have")
            .located(By.xpath("//div@class='ui-select-box']//span[contains(text(),'Select a Model')]"));
    public static final Target INPUT_SO= Target.the("where do we write the SO of your cellphone have")
            .located(By.xpath("//div@class='ui-select-box']//span[contains(text(),'Select OS')]"));
    public static final Target PHONE_BUTTON=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
}
