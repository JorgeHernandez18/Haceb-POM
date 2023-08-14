package com.haceb.steps;

import com.haceb.models.SeleccionAleatoria;
import com.haceb.page.DetalleProductoPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class DetalleProductoStep {

    @Page
    DetalleProductoPage detalleProductoPage;

    @Step("El usuario podra añadir el producto al carrito")
    public void elUsuarioAñadeElProductoAlCarrito(){
        detalleProductoPage.getDriver().findElement(detalleProductoPage.getBtnCompra()).click();
    }

    @Step("El usuario podra visualizar el producto en el carrito")
    public void elUsuarioVeElProductoEnElCarrito(){
        if (Data.extractTo().get(0).get("TituloProducto").equals(SeleccionAleatoria.prueba.toString())) {
            Assert.assertTrue(
                    detalleProductoPage.getDriver().findElement(detalleProductoPage.getLblProductoCarrito()).isDisplayed()
            );
        }else {
            Assert.fail("No coinciden los titulos de los productos");
        }
    }
}
