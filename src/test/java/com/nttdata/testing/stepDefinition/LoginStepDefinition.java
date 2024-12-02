package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.LoginPage;
import com.nttdata.testing.Tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class LoginStepDefinition {
    @Given("el {actor} está en la página de inicio")
    public void elUsuarioEstáEnLaPáginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }
    @And("el usuario selecciona el boton de login")
    public void elUsuarioSeleccionaElBotonDeLogin() {
        theActorInTheSpotlight().attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }

    @And("ingresa un nombre de usuario {string} y contraseña {string}")
    public void ingresaCredenciales(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(LoginPage.INP_USERNAMEL));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(LoginPage.INP_PASSWORDL));
    }
    @When("el usuario selecciona el boton de logearse")
    public void elUsuarioSeleccionaElBotonDeLogearse() {

        theActorInTheSpotlight().attemptsTo(Click.on(LoginPage.BTN_LOGIN_ING));
    }



    @Then("se realiza el logeo de manera correcta")
    public void seRealizaElLogeoDeManeraCorrecta() {
        System.out.println("exitoso");
    }
}
