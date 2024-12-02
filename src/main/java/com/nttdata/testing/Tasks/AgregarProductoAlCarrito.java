package com.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.nttdata.testing.Pages.ProductPage.*;

public class AgregarProductoAlCarrito implements Task {


    private final String producto;

    public AgregarProductoAlCarrito(String producto) {
        this.producto = producto;
    }

    public static AgregarProductoAlCarrito llamado(String producto) {
        return instrumented(AgregarProductoAlCarrito.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        actor.attemptsTo(
                Click.on(PRODUCT.of(producto)),
                Click.on(ADD_TO_CART_BUTTON)
        );
        //notificación
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "if (Notification.permission === 'granted') {" +
                        "new Notification('Producto agregado', {" +
                        "body: 'El producto \"" + producto + "\" se ha agregado al carrito.'," +
                        "icon: 'https://www.demoblaze.com/favicon.ico'" +
                        "});" +
                        "} else {" +
                        "Notification.requestPermission().then(permission => {" +
                        "if (permission === 'granted') {" +
                        "new Notification('Producto agregado', {" +
                        "body: 'El producto \"" + producto + "\" se ha agregado al carrito.'," +
                        "icon: 'https://www.demoblaze.com/favicon.ico'" +
                        "});" +
                        "}" +
                        "});" +
                        "}"
        );
        // 5 segundos para ver notificación
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
