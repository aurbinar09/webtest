package com.nttdata.testing.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.nttdata.testing.Pages.LoginPage.*;
import com.nttdata.testing.Pages.LoginPage;

public class RealizarLogin implements Task{
    private final String username;
    private final String password;

    public RealizarLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static RealizarLogin conCredenciales(String username, String password) {
        return instrumented(RealizarLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(username).into(INP_USERNAMEL),
                Enter.theValue(password).into(INP_PASSWORDL),
                Click.on(BTN_LOGIN_ING)
        );
    }
}
