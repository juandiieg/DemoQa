package dSteps;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userInterfaces.*;

public class registroSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private HomePage homePage = new HomePage();

    @Given("^ingreso a la plataforma demoqa$")
    public void ingresoALaPlataformaDemoqa() {
        actor.can(
                BrowseTheWeb.with(navegador)
        );
        navegador.manage().window().maximize();
        actor.wasAbleTo(
                Open.browserOn(homePage)
        );
    }

    @Given("^Ingreso al submodulo web tables$")
    public void ingresoAlSubmoduloWebTables() {
        actor.wasAbleTo(
                EnterModule.enterModule("webTables")
        );
    }

    //Se ingresa el nombre del archivo XLS por el feature
    @When("^Ingreso los datos \\\"([^\\\"]*)\\\" para el registro$")
    public void ingresoLosDatosParaElRegistro(String datos) {
        actor.wasAbleTo(
                FillRegister.addRegister(datos)
        );
    }

    @Then("^Agrego el registro en la tabla$")
    public void agregoElRegistroEnLaTabla() {
        actor.wasAbleTo(
                ValidateRegister.validateRegister()
        );
    }

    @When("^Selecciono la opcion eliminar registro$")
    public void seleccionoLaOpcionEliminarRegistro() {

    }

    @Then("^Elimino el registro de la tabla$")
    public void eliminoElRegistroDeLaTabla() {

    }


}
