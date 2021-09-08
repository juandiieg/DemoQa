package tasks;

import Helpers.ReadDataFrmXL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import userInterfaces.ElementsPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userInterfaces.ElementsPage.BTN_WEBTABLES;

public class ValidateRegister implements Task {


    String[][] data;

    public void readDat() throws Exception {
        data = ReadDataFrmXL
                .readData("src\\main\\resources\\utilities\\datos.xls", 0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            readDat();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int aux = 1; aux <= data[0].length+1; aux++) {
            actor.should(
                    seeThat(the(Target.the("Campo email de la tabla")
                            .locatedBy("//div[contains(text(),'" + data[aux][2] + "')]")), isVisible()
                    )
            );
        }
    }

    public static ValidateRegister validateRegister() {
        return instrumented(ValidateRegister.class);
    }
}
