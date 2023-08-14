package com.haceb.steps;

import com.haceb.models.DatosRegistro;
import com.haceb.models.ManejoPopUp;
import com.haceb.page.RegistroPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Step("El usuario diligencia el formulario de registro")
    public void elUsuarioDiligenciaElFormularioDeRegistro(){
        ManejoPopUp.obtenerVentanaActual(registroPage.getDriver());
        ManejoPopUp.cambiarVentanaEmergente(registroPage.getDriver());
        WaitUntil.the(registroPage.getTxtCorreo(), isEnabled()).forNoMoreThan(20).seconds();
        registroPage.getDriver().findElement(registroPage.getTxtCorreo()).sendKeys(DatosRegistro.data().get(0).get("Correo"));
        registroPage.getDriver().findElement(registroPage.getTxtNombre()).sendKeys(DatosRegistro.data().get(0).get("Nombre"));
        registroPage.getDriver().findElement(registroPage.getTxtApellido()).sendKeys(DatosRegistro.data().get(0).get("Apellido"));
        registroPage.getDriver().findElement(registroPage.getTxtClave()).sendKeys(DatosRegistro.data().get(0).get("Clave"));
        registroPage.getDriver().findElement(registroPage.getTxtConfirmarClave()).sendKeys(DatosRegistro.data().get(0).get("ConfirmClave"));
        registroPage.getDriver().findElement(registroPage.getCheckTerminos()).click();
        registroPage.getDriver().findElement(registroPage.getCheckAutorizo()).click();
        registroPage.getDriver().findElement(registroPage.getBtnRegistro()).click();
    }
}
