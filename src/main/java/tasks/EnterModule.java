package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ElementsPage.*;
import static userInterfaces.HomePage.*;

public class EnterModule implements Task {

    String modulo;

    public EnterModule(String modulo){
        this.modulo = modulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (modulo){
            case "webTables":
                actor.attemptsTo(Click.on(BTN_ELEMENTS));
        }
    }

    public static EnterModule enterModule(String modulo) {
        return instrumented(EnterModule.class, modulo);
    }

}
