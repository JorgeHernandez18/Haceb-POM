package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {

    private final By txtCorreo = By.xpath("//input[@id='gigya-loginID-51216659851706440']");
    private final By txtNombre = By.xpath("//input[@id='gigya-textbox-72173553995486780']");
    private final By txtApellido = By.xpath("//input[@id='gigya-textbox-146410824335495100']");
    private final By txtClave = By.xpath("//input[@id='gigya-password-54061940132406190']");
    private final By txtConfirmarClave = By.xpath("//input[@id='gigya-password-142670944012194750']");
    private final By checkTerminos = By.xpath("//label[@for='gigya-checkbox-70031539084410860']/span[@class='gigya-label-text gigya-checkbox-text']");
    private final By checkAutorizo = By.xpath("//label[@for='gigya-multiChoice-0-98366419479004930']");

    private final By btnRegistro = By.xpath("//input[@value='REGISTRARME']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getTxtConfirmarClave() {
        return txtConfirmarClave;
    }

    public By getCheckTerminos() {
        return checkTerminos;
    }

    public By getCheckAutorizo() {
        return checkAutorizo;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }
}
