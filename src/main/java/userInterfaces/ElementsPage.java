package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ElementsPage extends PageObject {



    public static final Target BTN_WEBTABLES = Target.the("Boton tablas web")
            .locatedBy("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]");
    public static final Target BTN_ADD = Target.the("Botón añadir nuevo registro")
            .locatedBy("//button[@id='addNewRecordButton']");
    public static final Target BTN_DELETE = Target.the("Botón borrar registo")
            .locatedBy("//span[@id='delete-record-3']");
    public static final Target INP_FIRSTNAME = Target.the("Input primer nombre")
            .locatedBy("//input[@id='firstName']");
    public static final Target INP_LASSTNAME = Target.the("Input primer nombre")
            .locatedBy("//input[@id='lastName']");
    public static final Target INP_EMAIL = Target.the("Input primer nombre")
            .locatedBy("//input[@id='userEmail']");
    public static final Target INP_AGE = Target.the("Input primer nombre")
            .locatedBy("//input[@id='age']");
    public static final Target INP_SALARY = Target.the("Input primer nombre")
            .locatedBy("//input[@id='salary']");
    public static final Target INP_DEPARTMENT = Target.the("Input primer nombre")
            .locatedBy("//input[@id='department']");
    public static final Target BTN_SUBMIT = Target.the("Botón submit")
            .locatedBy("//button[@id='submit']");

    public static final Target EMAIL = Target.the("Campo email de la tabla")
            .locatedBy("//div[contains(text(),'"+""+"')]");




}
