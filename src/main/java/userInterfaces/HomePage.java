package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com")
public class HomePage extends PageObject {
    public static final Target BTN_ELEMENTS = Target.the("Botón elementos")
            .locatedBy("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/*[1]");
    public static final Target BTN_WIDGETS = Target.the("Botón widgets")
            .locatedBy("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/*[1]");
    public static final Target BTN_ALERTS = Target.the("Botón Alerts, Frame & Windows")
            .locatedBy("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/*[1]");
}
