package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private final By lblMiPerfil = By.xpath("//div[@class='link-account-item link-account-user']");
    private final By lblRegistrarte = By.xpath("//a[@class='cdc-fire cdc-register']");
    private final By btnIngresarHaceb = By.xpath("//button[@id='vtexIdUI-custom-oauth']");
    private final By btnCloseWindow = By.xpath("//div[@class='gigya-screen-dialog-close']/a");

    public By getLblMiPerfil() {
        return lblMiPerfil;
    }

    public By getLblRegistrarte() {
        return lblRegistrarte;
    }

    public By getBtnIngresarHaceb() {
        return btnIngresarHaceb;
    }

    public By getBtnCloseWindow() {
        return btnCloseWindow;
    }
}
