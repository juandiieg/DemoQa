package tasks;

import Helpers.ReadDataFrmXL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ElementsPage.*;

public class FillRegister implements Task {

    String dat;
    String[][] data;

    public FillRegister(String dat) {
        this.dat = dat;
    }

    public void readDat(String dat) throws Exception {
        data = ReadDataFrmXL
                .readData("src\\main\\resources\\utilities\\" + dat, 0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            readDat(dat);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Scroll.to(BTN_WEBTABLES),
                Click.on(BTN_WEBTABLES)
        );
        for (int aux = 1; aux <= data[0].length+1; aux++) {
            actor.attemptsTo(
                    Click.on(BTN_ADD),
                    Enter.theValue(data[aux][0]).into(INP_FIRSTNAME),
                    Enter.theValue(data[aux][1]).into(INP_LASSTNAME),
                    Enter.theValue(data[aux][2]).into(INP_EMAIL),
                    Enter.theValue(data[aux][3]).into(INP_AGE),
                    Enter.theValue(data[aux][4]).into(INP_SALARY),
                    Enter.theValue(data[aux][5]).into(INP_DEPARTMENT),
                    Click.on(BTN_SUBMIT)
            );
        }
    }

    public static FillRegister addRegister(String dat) {
        return instrumented(FillRegister.class, dat);
    }

}
