package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LocatePage extends PageObject {
    public static final Target INPUT_CITY= Target.the("where do we write the city do you life")
            .located(By.id("city"));
    public static final Target INPUT_ZIP= Target.the("where do we write the city do you life")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target LOCATE_BUTTON=Target.the("button that shows us the next form")
            .located(By.xpath("//div@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));
}
