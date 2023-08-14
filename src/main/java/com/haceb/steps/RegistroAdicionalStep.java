package com.haceb.steps;

import com.haceb.models.DatosRegistro;
import com.haceb.models.ManejoPopUp;
import com.haceb.page.RegistroAdicionalPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegistroAdicionalStep {

    @Page
    RegistroAdicionalPage registroAdicionalPage;

    @Step("El usuario diligencia el formulario de registro adicional")
    public void elUsuarioDiligenciaElFormularioDeRegistroAdicional(){
        WaitUntil.the(registroAdicionalPage.getTxtCedula(), isEnabled()).forNoMoreThan(20).seconds();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtCedula()).sendKeys(DatosRegistro.data().get(0).get("Cedula"));
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtSeleccion()).click();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtMasculino()).click();
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getTxtFecha()).sendKeys(DatosRegistro.data().get(0).get("Fecha"));
        registroAdicionalPage.getDriver().findElement(registroAdicionalPage.getBtnEnviar()).click();
        ManejoPopUp.ventanaPrincipal(registroAdicionalPage.getDriver());
    }
}
