package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroAdicionalPage extends PageObject {

    private final By txtCedula = By.xpath("//input[@placeholder='Ingrese su documento de identidad *']");
    private final By txtSeleccion = By.xpath("//select[@id='gigya-dropdown-153944062160082270']");
    private final By txtMasculino = By.xpath("//*[@id='gigya-dropdown-153944062160082270']/option[3]");
    private final By txtFecha = By.xpath("//input[@id='gigya-textbox-29430652596742216']");
    private final By btnEnviar = By.xpath("//input[@value='Enviar']");

    public By getTxtCedula() {
        return txtCedula;
    }

    public By getTxtSeleccion() {
        return txtSeleccion;
    }

    public By getTxtMasculino() {
        return txtMasculino;
    }

    public By getTxtFecha() {
        return txtFecha;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }
}
