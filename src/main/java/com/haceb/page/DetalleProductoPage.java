package com.haceb.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleProductoPage extends PageObject {

    private final By btnCompra = By.xpath("//div[@class='product__buy flex']//a[@class='btn btn-default buy-in-page-button'][normalize-space()='Comprar']");

    private final By lblProductoCarrito = By.xpath("//a[@class='cart-prod-item__prod-name']");

    public By getBtnCompra() {
        return btnCompra;
    }

    public By getLblProductoCarrito() {
        return lblProductoCarrito;
    }
}
