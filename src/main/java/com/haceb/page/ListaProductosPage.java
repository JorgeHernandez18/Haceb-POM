package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductosPage extends PageObject {

    private final By lnkProducto = By.xpath("//h4[@class='shelve__name']");

    public By getLnkProducto() {
        return lnkProducto;
    }
}
