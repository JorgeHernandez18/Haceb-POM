package com.haceb.steps;

import com.haceb.models.ManejoPopUp;
import com.haceb.page.HomePage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeStep {

    @Page
    HomePage homePage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.haceb.com/");}

    @Step("El usuario clickea el boton de registrarte")
    public void elUsuarioClickeaRegistrarte(){
        WaitUntil.the(homePage.getBtnCloseWindow(), isVisible()).forNoMoreThan(20).seconds();
        homePage.getDriver().findElement(homePage.getBtnCloseWindow()).click();
        homePage.getDriver().findElement(homePage.getLblMiPerfil()).click();
        homePage.getDriver().findElement(homePage.getLblRegistrarte()).click();
    }

    @Step("El usuario clickea ingresar a haceb")
    public void elUsuarioClickeaIngresar(){
        homePage.getDriver().findElement(homePage.getBtnIngresarHaceb()).click();
    }

}
