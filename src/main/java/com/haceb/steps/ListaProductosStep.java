package com.haceb.steps;

import com.haceb.models.SeleccionAleatoria;
import com.haceb.page.ListaProductosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ListaProductosStep {

    @Page
    ListaProductosPage listaProductosPage;

    @Step("El usuario selecciona un producto aleatoriamente")
    public void elUsuarioSeleccionaUnProductoAleatoriamente(){
        SeleccionAleatoria.seleccion(listaProductosPage.getDriver(), listaProductosPage.getLnkProducto()).click();
        SeleccionAleatoria.escrituraExcel();
    }
}
