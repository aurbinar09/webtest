package com.nttdata.testing.stepDefinition;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.nttdata.testing.Tasks.AgregarProductoAlCarrito;
import com.nttdata.testing.Tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;

public class AgregarProductoStepDefinition {
    @Given("el {actor} está en la página de inicio producto")
    public void elUsuarioEstáEnLaPáginaDeInicioProducto(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @When("selecciona el producto {string}")
    public void seleccionaElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProductoAlCarrito.llamado(producto));
    }

    @Then("el producto se agrego al carrito")
    public void elProductoSeAgregoAlCarrito() {
        System.out.println("exitoso");
    }
}
