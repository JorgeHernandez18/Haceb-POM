package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PerfilPage extends PageObject {

    private final By txtNombre = By.xpath("//div[@class='db-m dn']//div[@class='vtex-pageHeader__container pa5 pa7-ns']//div[1]//div[1]");

    private final By lnkCategoria = By.xpath("//a[normalize-space()='Categorías']");

    //Hacer hover a este elemento
    private final By lnkElectroCocina = By.xpath("//a[@title='Electrodomésticos de cocina']");
    //Elegir de manera aleatoria
    private final By lnkSubcategoria = By.xpath("//li[@class='has-children cocina-line']//li[@class='no-has-children']");

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getLnkCategoria() {
        return lnkCategoria;
    }

    public By getLnkElectroCocina() {
        return lnkElectroCocina;
    }

    public By getLnkSubcategoria() {
        return lnkSubcategoria;
    }
}
